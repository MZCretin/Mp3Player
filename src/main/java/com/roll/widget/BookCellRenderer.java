package com.roll.widget;

import com.roll.model.MusicModel;
import com.roll.model.RecommendListModel;
import com.roll.utils.StringUtils;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.EventListener;

import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

class BookCellRenderer implements ListCellRenderer {
    public BookCellRenderer() {

    }

    public Component getListCellRendererComponent(final JList list, final Object value, int index, final boolean isSelected, boolean cellHasFocus) {
        return new JPanel() {
            public void paintComponent(final Graphics g) {
                super.paintComponent(g);
                final MusicModel item = ( MusicModel ) value;
                setBackground(Color.WHITE);
                g.setFont(new Font("DialogInput", Font.PLAIN, 18));
                g.drawString(item.getName(), 80, 25);
                g.setFont(new Font("DialogInput", Font.PLAIN, 14));
                g.setColor(Color.GRAY);
                g.drawString(item.getAuthor() + " · " + item.getAlbumName(), 80, 65);
//                new Thread() {
//                    @Override
//                    public void run() {
                        try {
                            ImageIcon imageIcon = null;
                            if( StringUtils.isEmpty(item.getPic())){
                                imageIcon = new ImageIcon(getClass().getResource("/music.jpg"));
                            }else {
                                imageIcon = new ImageIcon(new URL(item.getPic()));
                            }
                            imageIcon.setImage(imageIcon.getImage().getScaledInstance(60, 60,
                                    Image.SCALE_DEFAULT));
                            g.drawImage(imageIcon.getImage(), 10, 10, 60, 60, null);
                        } catch ( MalformedURLException e ) {
                            e.printStackTrace();
                        }
//                    }
//                }.start();
                g.setColor(Color.WHITE);
                g.drawLine(0, 79, 1000, 80);

                if(item.isPlaying()){
                    g.setColor(Color.RED);
                    g.drawString("正在播放中...", 80, 45);
                }
            }

            public Dimension getPreferredSize() {
                return new Dimension(480, 80);
            }
        };
    }
}