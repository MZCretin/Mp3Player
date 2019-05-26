/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SongDetaiModel
 * Author:   a112233
 * Date:     2019/5/25 4:26 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.roll.model;

/**
 * 〈〉
 *
 * @author a112233
 * @create 2019/5/25
 * @since 1.0.0
 */
public class SongDetaiModel {

    /**
     * code : 1
     * msg : 数据返回成功
     * data : {"songName":"稻香","artistName":"周杰伦","albumName":"魔杰座","songPic":"http://qukufile2.qianqian.com/data2/pic/046d17bfa056e736d873ec4f891e338f/540336142/540336142.jpg@s_2,w_300,h_300","lrcLink":"http://qukufile2.qianqian.com/data2/lrc/13762398/13762398.lrc","time":223,"songLink":"http://zhangmenshiting.qianqian.com/data2/music/1042bded3e4540ca66d31a7336f8205b/599474129/139084057600128.mp3?xcode=444e247710416e65cc3224dc97e4d7a9","format":"mp3","rate":128,"size":3577594}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * songName : 稻香
         * artistName : 周杰伦
         * albumName : 魔杰座
         * songPic : http://qukufile2.qianqian.com/data2/pic/046d17bfa056e736d873ec4f891e338f/540336142/540336142.jpg@s_2,w_300,h_300
         * lrcLink : http://qukufile2.qianqian.com/data2/lrc/13762398/13762398.lrc
         * time : 223
         * songLink : http://zhangmenshiting.qianqian.com/data2/music/1042bded3e4540ca66d31a7336f8205b/599474129/139084057600128.mp3?xcode=444e247710416e65cc3224dc97e4d7a9
         * format : mp3
         * rate : 128
         * size : 3577594
         */

        private String songName;
        private String artistName;
        private String albumName;
        private String songPic;
        private String lrcLink;
        private int time;
        private String songLink;
        private String format;
        private int rate;
        private int size;

        public String getSongName() {
            return songName;
        }

        public void setSongName(String songName) {
            this.songName = songName;
        }

        public String getArtistName() {
            return artistName;
        }

        public void setArtistName(String artistName) {
            this.artistName = artistName;
        }

        public String getAlbumName() {
            return albumName;
        }

        public void setAlbumName(String albumName) {
            this.albumName = albumName;
        }

        public String getSongPic() {
            return songPic;
        }

        public void setSongPic(String songPic) {
            this.songPic = songPic;
        }

        public String getLrcLink() {
            return lrcLink;
        }

        public void setLrcLink(String lrcLink) {
            this.lrcLink = lrcLink;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public String getSongLink() {
            return songLink;
        }

        public void setSongLink(String songLink) {
            this.songLink = songLink;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public int getRate() {
            return rate;
        }

        public void setRate(int rate) {
            this.rate = rate;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }
}