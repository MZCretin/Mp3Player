/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PlayWarp
 * Author:   cretin
 * Date:     5/26/19 00:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.roll.player;

import com.mzlion.easyokhttp.HttpClient;
import com.roll.listener.PlayListener;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 * 〈〉
 *
 * @author cretin
 * @create 5/26/19
 * @since 1.0.0
 */
public class PlayWarp {
    ByteArrayInputStream BIS;

    private Timer timer;
    private PlayListener playListener;

    public Player player;
    public long pauseLocation;
    public long songTotalLength;
    public String fileLocation;

    public PlayListener getPlayListener() {
        return playListener;
    }

    public void setPlayListener(PlayListener playListener) {
        this.playListener = playListener;
    }

    public void stop() {
        if ( player != null ) {
            player.close();
            pauseLocation = 0;
            songTotalLength = 0;
        }
        stopTimer();
    }

    public void pause() {
        if ( player != null ) {
            pauseLocation = BIS.available();
            player.close();
            stopTimer();
        }
    }

    private void stopTimer() {
        if ( timer != null ) {
            timer.cancel();
            timer = null;
        }
    }

    private void startTimer() {
        if ( playListener == null )
            return;
        if ( timer != null ) {
            timer.cancel();
            timer = null;
        }
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(player.getPosition() + "   ");
                if ( player != null ) {
                    playListener.play(0, player.getPosition());
                }
            }
        }, 0, 1000);
    }

    public void play(String path) {
        try {
            if ( player != null ) {
                player.close();
                pauseLocation = 0;
                songTotalLength = 0;
            }
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            HttpClient
                    // 请求方式和请求url
                    .get(path)
                    .execute()
                    .asStream(baos);

            BIS = new ByteArrayInputStream(baos.toByteArray());

            player = new Player(BIS);
            songTotalLength = BIS.available();
            fileLocation = path + "";
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                    if ( player.isComplete() ) {
                        play(fileLocation);
                    }
                } catch ( JavaLayerException ex ) {
                    ex.printStackTrace();
                }
            }
        }.start();
        startTimer();
    }

    public void resume() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            HttpClient
                    // 请求方式和请求url
                    .get(fileLocation)
                    .execute()
                    .asStream(baos);
            BIS = new ByteArrayInputStream(baos.toByteArray());
            player = new Player(BIS);
            BIS.skip(songTotalLength - pauseLocation);
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch ( JavaLayerException ex ) {
                    ex.printStackTrace();
                }
            }
        }.start();
        startTimer();
    }

}