/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MainFrame
 * Author:   a112233
 * Date:     2019/5/25 4:43 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.roll.widget;

import com.roll.dialog.LoadingPanel;
import com.roll.listener.DefaultClickListener;
import com.roll.listener.PlayListener;
import com.roll.model.DataModel;
import com.roll.model.MusicModel;
import com.roll.model.RecommendListModel;
import com.roll.model.SearchListModel;
import com.roll.model.SongDetaiModel;
import com.roll.net.NetWrap;
import com.roll.player.PlayWarp;
import com.roll.utils.StringUtils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 〈主界面〉
 *
 * @author a112233
 * @create 2019/5/25
 * @since 1.0.0
 */
public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private int mWidth, mHeight;
    private NetWrap netWrap;
    private PlayWarp playWarp;
    private LoadingPanel glasspane = null;

    private boolean isPlaying = false;
    private MusicModel music;

    private JLabel time;
    private JProgressBar jpb;
    private JList listView = null;
    private List<MusicModel> mainData;

    public MainFrame() {
        netWrap = new NetWrap();
        playWarp = new PlayWarp();
        music = new MusicModel();
        glasspane = new LoadingPanel();
        initView();
        playWarp.setPlayListener(new PlayListener() {
            public void play(long allTime, long hasPlay) {
                setTime(hasPlay / 1000);
            }
        });
    }

    private void initView() {
        setTitle("Roll音乐播放器");    //设置显示窗口标题

        // 获取屏幕宽度
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        mWidth = 500;
        mHeight = ( int ) (( int ) screensize.getHeight() * 0.8);
        setSize(mWidth, mHeight);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭

        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        final JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(10, 10, mWidth - 90, 40);
        jTextField1.addFocusListener(new JTextFieldHintListener(jTextField1, "搜索音乐"));
        mainPanel.add(jTextField1);
        jTextField1.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
                if ( e.getSource() == jTextField1 ) {
                    if ( e.getKeyCode() == KeyEvent.VK_ENTER ) //判断按下的键是否是回车键
                    {
                        search(jTextField1);
                    }
                }
            }

            public void keyReleased(KeyEvent e) {
            }
        });

        JButton search = new JButton("搜索");
        search.setBounds(mWidth - 80, 10, 70, 40);
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                search(jTextField1);
            }
        });

        JButton btn1 = new JButton("今日推荐歌单");
        btn1.setBounds(mWidth - 490, 60, 120, 40);

        JButton btn2 = new JButton("获取榜单列表");
        btn2.setBounds(mWidth - 370, 60, 120, 40);

        JButton btn3 = new JButton("获取歌手列表");
        btn3.setBounds(mWidth - 250, 60, 120, 40);

        JButton btn4 = new JButton("随机播放音乐");
        btn4.setBounds(mWidth - 130, 60, 120, 40);

        mainPanel.add(search);
        mainPanel.add(btn1);
        mainPanel.add(btn2);
        mainPanel.add(btn3);
        mainPanel.add(btn4);

        //图标
        final JLabel lb = new JLabel();
        try {
            ImageIcon icon = new ImageIcon(new URL("http://qukufile2.qianqian.com/data2/pic/046d17bfa056e736d873ec4f891e338f/540336142/540336142.jpg@s_2,w_300,h_300"));
            //设置icon的大小
            icon.setImage(icon.getImage().getScaledInstance(100, 100,
                    Image.SCALE_DEFAULT));
            lb.setIcon(icon);
            lb.setBounds(12, 110, 100, 100);
            mainPanel.add(lb);
        } catch ( MalformedURLException e ) {
            e.printStackTrace();
        }
        final JLabel name = new JLabel("我是歌曲的名字");
        name.setBounds(122, 115, mWidth, 20);
        name.setFont(getTextFont(18));//设置JLabel的字体
        name.setForeground(Color.BLACK);//设置文字的颜色
        mainPanel.add(name);

        final JLabel author = new JLabel("我是歌手的名字");
        author.setBounds(122, 145, mWidth, 20);
        author.setFont(getTextFont(14));//设置JLabel的字体
        author.setForeground(Color.GRAY);//设置文字的颜色
        mainPanel.add(author);

        time = new JLabel("00:00 / 00:00");
        time.setBounds(122, 180, 100, 20);
        time.setFont(getTextFont(10));//设置JLabel的字体
        time.setForeground(Color.GRAY);//设置文字的颜色
        mainPanel.add(time);

        jpb = new JProgressBar();
        jpb.setBounds(122, 195, mWidth - 140, 20);
        jpb.setMinimum(1);
        jpb.setMaximum(100);
        mainPanel.add(jpb);

        //设置播放按钮
        final ImageIcon play = new ImageIcon(getClass().getResource("/bfzn_004.png"));
        //设置icon的大小
        play.setImage(play.getImage().getScaledInstance(60, 60,
                Image.SCALE_DEFAULT));
        final JLabel playlb = new JLabel(play);
        playlb.setBounds(370, 115, 60, 60);
        mainPanel.add(playlb);
        playlb.addMouseListener(new DefaultClickListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Thread() {
                    @Override
                    public void run() {
                        showDialog();
                        if ( isPlaying ) {
                            isPlaying = false;
                            checkStatus(playlb, name, author, time, lb);
                            playWarp.pause();
                        } else {
                            isPlaying = true;
                            checkStatus(playlb, name, author, time, lb);
                            playWarp.resume();
                        }
                        stopDialog();
                    }
                }.start();
            }
        });

        ImageIcon play1 = new ImageIcon(getClass().getResource("/bfzn_005.png"));
        //设置icon的大小
        play1.setImage(play1.getImage().getScaledInstance(30, 30,
                Image.SCALE_DEFAULT));
        JLabel playlb1 = new JLabel(play1);
        playlb1.setBounds(330, 145, 30, 30);
        mainPanel.add(playlb1);
        playlb1.addMouseListener(new DefaultClickListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });

        ImageIcon play2 = new ImageIcon(getClass().getResource("/bfzn_007.png"));
        //设置icon的大小
        play2.setImage(play2.getImage().getScaledInstance(30, 30,
                Image.SCALE_DEFAULT));
        JLabel playlb2 = new JLabel(play2);
        playlb2.setBounds(440, 145, 30, 30);
        mainPanel.add(playlb2);

        listView = new JList();
        // 设置选项数据（内部将自动封装成 ListModel ）
        mainData = new ArrayList<MusicModel>();
        RecommendListModel recommendListModel = netWrap.getRecommendList();
        if ( recommendListModel != null ) {
            List<RecommendListModel.DataBean> data = recommendListModel.getData();
            for ( RecommendListModel.DataBean datum : data ) {
                MusicModel musicModel = new MusicModel();
                musicModel.setPic(datum.getPic_small());
                musicModel.setAuthor(datum.getAuthor());
                musicModel.setName(datum.getTitle());
                musicModel.setPlaying(false);
                musicModel.setSongId(datum.getSong_id());
                musicModel.setAlbumName(datum.getAlbum_title());
                mainData.add(musicModel);
            }
        }
        DataModel listModel = new DataModel(mainData);
        listView.setModel(listModel);
        listView.setCellRenderer(new BookCellRenderer());
        listView.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(final ListSelectionEvent e) {
                new Thread() {
                    @Override
                    public void run() {
                        showDialog();
                        if ( e.getValueIsAdjusting() == false ) {
                            int lastIndex = e.getLastIndex();
                            SongDetaiModel songDetails = netWrap.getSongDetails(mainData.get(lastIndex).getSongId());
                            if ( songDetails != null ) {
                                isPlaying = true;
                                music.setAllTime(songDetails.getData().getTime());
                                music.setName(songDetails.getData().getSongName());
                                music.setAuthor(songDetails.getData().getArtistName());
                                music.setPic(songDetails.getData().getSongPic());
                                checkStatus(playlb, name, author, time, lb);
                                playWarp.play(songDetails.getData().getSongLink());

                                for ( MusicModel dataBean : mainData ) {
                                    dataBean.setPlaying(false);
                                }

                                mainData.get(lastIndex).setPlaying(true);
                                DataModel listModel = new DataModel(mainData);
                                listView.setModel(listModel);

                                stopDialog();
                            }
                        }
                    }
                }.start();
            }
        });

        JScrollPane jScrollPane1 = new JScrollPane(listView);    //滚动条panel
        jScrollPane1.setBounds(10, 220, mWidth - 20, mHeight - 250);
        mainPanel.add(jScrollPane1);

        add(mainPanel);

        glasspane.setBounds(225, mHeight / 2 - 25, 50, 50);
        setGlassPane(glasspane);

        setVisible(true);    //设置窗口是否可见
    }

    public static void main(String[] a) {
        new MainFrame();
    }

    private Font getTextFont(int size) {
        Font font = new Font("宋体", Font.PLAIN, size);//创建1个字体实例
        return font;
    }

    private void checkStatus(JLabel playlb, JLabel name, JLabel author, JLabel time, JLabel jLabel) {
        URL res = null;
        if ( !isPlaying ) {
            res = getClass().getResource("/bfzn_004.png");
        } else {
            res = getClass().getResource("/bfzn_003.png");
        }
        //设置播放按钮
        final ImageIcon play = new ImageIcon(res);
        //设置icon的大小
        play.setImage(play.getImage().getScaledInstance(60, 60,
                Image.SCALE_DEFAULT));
        playlb.setIcon(play);

        if ( music != null ) {
            name.setText(music.getName());
            author.setText(music.getAuthor());
            time.setText(music.getAllTime() + "");
            try {
                ImageIcon icon = new ImageIcon(new URL(music.getPic()));
                //设置icon的大小
                icon.setImage(icon.getImage().getScaledInstance(100, 100,
                        Image.SCALE_DEFAULT));
                jLabel.setIcon(icon);
            } catch ( Exception e ) {
            }
        }
    }

    private void setTime(long times) {
        int min = 0;
        int second = 0;
        String alllTime = "--:--";
        int allTimeSecond = 0;
        if ( music != null ) {
            allTimeSecond = ( int ) (music.getAllTime());
            min = ( int ) (music.getAllTime() / 60);
            second = ( int ) (music.getAllTime() % 60);
            alllTime = (min < 10 ? ("0" + min) : min + "") + ":" + (second < 10 ? ("0" + second) : (second + ""));
        }
        min = ( int ) (times / 60);
        second = ( int ) (times % 60);
        time.setText((min < 10 ? ("0" + min) : min + "") + ":" + (second < 10 ? ("0" + second) : (second + "")) + " / " + alllTime);

        if ( jpb != null ) {
            jpb.setValue(( int ) (times * 100 / allTimeSecond));
        }
    }

    private void showDialog() {
        glasspane.start();
    }

    private void stopDialog() {
        glasspane.stop();
    }

    private void showTips(String tips) {
        JOptionPane.showMessageDialog(this, tips, "标题", JOptionPane.WARNING_MESSAGE);
    }

    private void search(JTextField jTextField1) {
        final String text = jTextField1.getText();
        if ( text.equals("搜索音乐") ) {
            showTips("请输入搜索内容...");
            return;
        }
        new Thread() {
            @Override
            public void run() {
                showDialog();
                SearchListModel searchListModel = netWrap.searchMusis(text);
                if ( searchListModel.getCode() == 0 ) {
                    stopDialog();
                    showTips(searchListModel.getMsg());
                    return;
                }
                List<SearchListModel.DataBean.ListBean> list = searchListModel.getData().getList();
                mainData.clear();
                for ( SearchListModel.DataBean.ListBean listBean : list ) {
                    MusicModel musicModel = new MusicModel();
                    musicModel.setSongId(listBean.getId());
                    musicModel.setAlbumName(listBean.getAlbumName());
                    musicModel.setName(listBean.getSongName());
                    musicModel.setAuthor(listBean.getArtistName());
                    mainData.add(musicModel);
                }
                DataModel listModel = new DataModel(mainData);
                listView.setModel(listModel);
                stopDialog();
            }
        }.start();
    }
}