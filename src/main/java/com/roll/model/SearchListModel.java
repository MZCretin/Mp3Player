/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SearchListModel
 * Author:   cretin
 * Date:     5/26/19 12:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.roll.model;

import java.util.List;

/**
 * 〈〉
 *
 * @author cretin
 * @create 5/26/19
 * @since 1.0.0
 */
public class SearchListModel {

    /**
     * code : 1
     * msg : 数据返回成功
     * data : {"page":1,"totalCount":18,"totalPage":1,"limit":30,"list":[{"songName":"稻香","artistName":"周猷智","albumName":"《稻香》","id":"2001359"},{"songName":"稻香","artistName":"MIKA STUDIO","albumName":"《深呼吸》","id":"606889413"},{"songName":"稻香","artistName":"云游侠何然","albumName":"","id":"74071252"},{"songName":"稻香","artistName":"周杰伦","albumName":"《魔杰座》","id":"1390840"},{"songName":"稻香","artistName":"周杰伦","albumName":"《The Era 2010 超时代演唱会》","id":"5453553"},{"songName":"稻香","artistName":"郁可唯","albumName":"","id":"576929"},{"songName":"稻香","artistName":"海潮哥","albumName":"《中文电摇》","id":"542495964"},{"songName":"稻香","artistName":"代悦","albumName":"","id":"519259"},{"songName":"稻香","artistName":"Hope组合","albumName":"","id":"59498204"},{"songName":"稻香","artistName":"李成宇","albumName":"","id":"246478413"},{"songName":"稻香","artistName":"李成宇","albumName":"","id":"246509591"},{"songName":"稻香的風","artistName":"brworkstudio","albumName":"《風禾日麗》","id":"613850955"},{"songName":"风起稻香","artistName":"司夏","albumName":"","id":"73884245"},{"songName":"万年稻香","artistName":"曹珊珊","albumName":"《万年稻香》","id":"590369849"},{"songName":"南風撫稻香","artistName":"","albumName":"《愛戀口風琴》","id":"606569281"},{"songName":"剑网三同人 风起稻香","artistName":"清弄","albumName":"","id":"73901028"},{"songName":"本草纲目+稻香+忍者 (原唱:周杰伦)","artistName":"JC练习生11队","albumName":"《1VS11》","id":"293263004"},{"songName":"vol.18 揽把稻香，暖烟霞","artistName":"刘珂矣","albumName":"《珂矣的心灵独语》","id":"600506622"},{"songName":"太湖美","artistName":"吴文璟","albumName":"《太湖美》","id":"257558204"},{"songName":"有空来玩","artistName":"北原山猫","albumName":"","id":"69063708"},{"songName":"很不低调","artistName":"方大同","albumName":"《JTW 西游记》","id":"271932373"},{"songName":"太湖美","artistName":"黑鸭子","albumName":"","id":"616060"},{"songName":"中国顺","artistName":"尹相杰,1+3音乐组合","albumName":"《中国顺》","id":"1984186"},{"songName":"闪闪亮","artistName":"邱琳雅","albumName":"","id":"242591805"},{"songName":"太湖美","artistName":"德德玛","albumName":"","id":"69155893"},{"songName":"多珍重","artistName":"郭小俊","albumName":"《爱情傀儡》","id":"103838996"},{"songName":"我在四季等你","artistName":"Easy Mind","albumName":"","id":"270853800"},{"songName":"太湖美","artistName":"群星","albumName":"","id":"679616"},{"songName":"滦州情","artistName":"韩晓辉","albumName":"","id":"246941331"},{"songName":"忍者","artistName":"SWING","albumName":"《Swing》","id":"940610"}]}
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
         * page : 1
         * totalCount : 18
         * totalPage : 1
         * limit : 30
         * list : [{"songName":"稻香","artistName":"周猷智","albumName":"《稻香》","id":"2001359"},{"songName":"稻香","artistName":"MIKA STUDIO","albumName":"《深呼吸》","id":"606889413"},{"songName":"稻香","artistName":"云游侠何然","albumName":"","id":"74071252"},{"songName":"稻香","artistName":"周杰伦","albumName":"《魔杰座》","id":"1390840"},{"songName":"稻香","artistName":"周杰伦","albumName":"《The Era 2010 超时代演唱会》","id":"5453553"},{"songName":"稻香","artistName":"郁可唯","albumName":"","id":"576929"},{"songName":"稻香","artistName":"海潮哥","albumName":"《中文电摇》","id":"542495964"},{"songName":"稻香","artistName":"代悦","albumName":"","id":"519259"},{"songName":"稻香","artistName":"Hope组合","albumName":"","id":"59498204"},{"songName":"稻香","artistName":"李成宇","albumName":"","id":"246478413"},{"songName":"稻香","artistName":"李成宇","albumName":"","id":"246509591"},{"songName":"稻香的風","artistName":"brworkstudio","albumName":"《風禾日麗》","id":"613850955"},{"songName":"风起稻香","artistName":"司夏","albumName":"","id":"73884245"},{"songName":"万年稻香","artistName":"曹珊珊","albumName":"《万年稻香》","id":"590369849"},{"songName":"南風撫稻香","artistName":"","albumName":"《愛戀口風琴》","id":"606569281"},{"songName":"剑网三同人 风起稻香","artistName":"清弄","albumName":"","id":"73901028"},{"songName":"本草纲目+稻香+忍者 (原唱:周杰伦)","artistName":"JC练习生11队","albumName":"《1VS11》","id":"293263004"},{"songName":"vol.18 揽把稻香，暖烟霞","artistName":"刘珂矣","albumName":"《珂矣的心灵独语》","id":"600506622"},{"songName":"太湖美","artistName":"吴文璟","albumName":"《太湖美》","id":"257558204"},{"songName":"有空来玩","artistName":"北原山猫","albumName":"","id":"69063708"},{"songName":"很不低调","artistName":"方大同","albumName":"《JTW 西游记》","id":"271932373"},{"songName":"太湖美","artistName":"黑鸭子","albumName":"","id":"616060"},{"songName":"中国顺","artistName":"尹相杰,1+3音乐组合","albumName":"《中国顺》","id":"1984186"},{"songName":"闪闪亮","artistName":"邱琳雅","albumName":"","id":"242591805"},{"songName":"太湖美","artistName":"德德玛","albumName":"","id":"69155893"},{"songName":"多珍重","artistName":"郭小俊","albumName":"《爱情傀儡》","id":"103838996"},{"songName":"我在四季等你","artistName":"Easy Mind","albumName":"","id":"270853800"},{"songName":"太湖美","artistName":"群星","albumName":"","id":"679616"},{"songName":"滦州情","artistName":"韩晓辉","albumName":"","id":"246941331"},{"songName":"忍者","artistName":"SWING","albumName":"《Swing》","id":"940610"}]
         */

        private int page;
        private int totalCount;
        private int totalPage;
        private int limit;
        private List<ListBean> list;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * songName : 稻香
             * artistName : 周猷智
             * albumName : 《稻香》
             * id : 2001359
             */

            private String songName;
            private String artistName;
            private String albumName;
            private String id;

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

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }
    }
}