/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Main
 * Author:   a112233
 * Date:     2019/5/25 3:47 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.roll;

import com.mzlion.easyokhttp.HttpClient;
import com.roll.model.RecommendListModel;
import com.roll.model.SongDetaiModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 * 〈〉
 *
 * @author a112233
 * @create 2019/5/25
 * @since 1.0.0
 */
public class Main {
//    public static void main(String[] args) {
//        RecommendListModel recommendListModel = HttpClient
//                // 请求方式和请求url
//                .get("http://www.mxnzp.com/api/music/recommend/list")
//                .execute()
//                .asBean(RecommendListModel.class);
//        if ( recommendListModel != null )
//            for ( RecommendListModel.DataBean datum : recommendListModel.getData() ) {
//                SongDetaiModel songDetaiModel = HttpClient
//                        .get("http://www.mxnzp.com/api/music/song/detail?songId=" + datum.getSong_id())
//                        .execute()
//                        .asBean(SongDetaiModel.class);
//                if ( songDetaiModel != null ) {
//                    playMusic(songDetaiModel.getData().getSongLink());
//                }
//            }
//
//        System.out.println("result：" + recommendListModel);
//    }

    private static void playMusic(String url) {
        // 播放一个 mp3 音频文件, 代码很简单
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            HttpClient
                    // 请求方式和请求url
                    .get(url)
                    .execute()
                    .asStream(baos);

            final ByteArrayInputStream swapStream = new ByteArrayInputStream(baos.toByteArray());
            Player player = null;
            try {
                player = new Player(swapStream);
                player.play();
            } catch ( JavaLayerException e ) {
                e.printStackTrace();
            }
        } catch ( Exception e ) {
            e.printStackTrace();
            System.out.println("抛出异常！！");
        }
        System.out.println("hello world");
    }
}