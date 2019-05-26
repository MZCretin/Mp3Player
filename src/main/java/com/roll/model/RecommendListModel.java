/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RecommendListModel
 * Author:   a112233
 * Date:     2019/5/25 4:22 PM
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
 * @author a112233
 * @create 2019/5/25
 * @since 1.0.0
 */
public class RecommendListModel {

    /**
     * code : 1
     * msg : 数据返回成功
     * data : [{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/3e365e7535b811de49d93048e40a3c35/165460/165460.jpg@s_2,w_1000,h_1000","ting_uid":"1230","si_proxycompany":"滚石国际音乐股份有限公司","author":"李圣杰","info":"","album_title":"关于你的歌","title":"手放开","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/3e365e7535b811de49d93048e40a3c35/165460/165460.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2006-06-16","pic_premium":"http://qukufile2.qianqian.com/data2/pic/3e365e7535b811de49d93048e40a3c35/165460/165460.jpg@s_2,w_500,h_500","song_id":"2076038","pic_small":"http://qukufile2.qianqian.com/data2/pic/3e365e7535b811de49d93048e40a3c35/165460/165460.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/ff79f25b52fa8d8e4cac593c99e441e2/611719776/611719776.jpg@s_2,w_1000,h_1000","ting_uid":"1202","si_proxycompany":"滚石国际音乐股份有限公司","author":"伍佰","info":"","album_title":"滚石爱情故事 电视原声带","title":"挪威的森林","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/ff79f25b52fa8d8e4cac593c99e441e2/611719776/611719776.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2016-06-08","pic_premium":"http://qukufile2.qianqian.com/data2/pic/ff79f25b52fa8d8e4cac593c99e441e2/611719776/611719776.jpg@s_2,w_500,h_500","song_id":"539884177","pic_small":"http://qukufile2.qianqian.com/data2/pic/ff79f25b52fa8d8e4cac593c99e441e2/611719776/611719776.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/3354ca69b56f3fb571cff0360a5d74f3/557335383/557335383.jpg@s_2,w_1000,h_1000","ting_uid":"1226","si_proxycompany":"华宇世博音乐文化（北 京）有限公司-太合麦田","author":"许巍","info":"","album_title":"那一年","title":"那一年","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/3354ca69b56f3fb571cff0360a5d74f3/557335383/557335383.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2000-11-30","pic_premium":"http://qukufile2.qianqian.com/data2/pic/3354ca69b56f3fb571cff0360a5d74f3/557335383/557335383.jpg@s_2,w_500,h_500","song_id":"247696","pic_small":"http://qukufile2.qianqian.com/data2/pic/3354ca69b56f3fb571cff0360a5d74f3/557335383/557335383.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/af3f9f74df25f56cd15d79a173317433/603432878/603432878.jpg@s_2,w_1000,h_1000","ting_uid":"340364211","si_proxycompany":"绍兴牧歌文化发展有限公司","author":"夏雨菲","info":"","album_title":"纸短情长","title":"纸短情长","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/af3f9f74df25f56cd15d79a173317433/603432878/603432878.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2018-09-05","pic_premium":"http://qukufile2.qianqian.com/data2/pic/af3f9f74df25f56cd15d79a173317433/603432878/603432878.jpg@s_2,w_500,h_500","song_id":"603432881","pic_small":"http://qukufile2.qianqian.com/data2/pic/af3f9f74df25f56cd15d79a173317433/603432878/603432878.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/d8888793ccb5c5b984c3dc7447bc466a/614448444/614448444.jpg","ting_uid":"1376","si_proxycompany":"北京普天同乐文化传媒有限公司","author":"龙梅子","info":"","album_title":"浪里的浪","title":"浪里的浪","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/d8888793ccb5c5b984c3dc7447bc466a/614448444/614448444.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2019-05-20","pic_premium":"http://qukufile2.qianqian.com/data2/pic/d8888793ccb5c5b984c3dc7447bc466a/614448444/614448444.jpg@s_2,w_500,h_500","song_id":"614448414","pic_small":"http://qukufile2.qianqian.com/data2/pic/d8888793ccb5c5b984c3dc7447bc466a/614448444/614448444.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/79ba42b5950a6be9107d973c96b0c5b7/2021332/2021332.jpg@s_2,w_1000,h_1000","ting_uid":"1097","si_proxycompany":"滚石国际音乐股份有限公司","author":"周华健,潘越云","info":"","album_title":"男欢女爱","title":"是否","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/79ba42b5950a6be9107d973c96b0c5b7/2021332/2021332.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"1990-12-20","pic_premium":"http://qukufile2.qianqian.com/data2/pic/79ba42b5950a6be9107d973c96b0c5b7/2021332/2021332.jpg@s_2,w_500,h_500","song_id":"219319","pic_small":"http://qukufile2.qianqian.com/data2/pic/79ba42b5950a6be9107d973c96b0c5b7/2021332/2021332.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/1ac5b0f1c95c78be5dd1f17343380a8c/613318868/613318868.jpg@s_2,w_1000,h_1000","ting_uid":"1052","si_proxycompany":"华宇世博音乐文化（北京）有限公司-海蝶音乐","author":"林俊杰","info":"电视剧《乌鸦嘴妙女郎》插曲","album_title":"乌鸦嘴妙女郎 电视原声带","title":"不潮不用花钱","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/1ac5b0f1c95c78be5dd1f17343380a8c/613318868/613318868.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2015-11-24","pic_premium":"http://qukufile2.qianqian.com/data2/pic/1ac5b0f1c95c78be5dd1f17343380a8c/613318868/613318868.jpg@s_2,w_500,h_500","song_id":"259242650","pic_small":"http://qukufile2.qianqian.com/data2/pic/1ac5b0f1c95c78be5dd1f17343380a8c/613318868/613318868.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/124464141/124464141.jpg@s_2,w_1000,h_1000","ting_uid":"5976","si_proxycompany":"北京听见时代娱乐传媒有限公司","author":"玖月奇迹","info":"","album_title":"中国美","title":"中国范儿","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/124464141/124464141.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2013-01-30","pic_premium":"http://qukufile2.qianqian.com/data2/pic/124464141/124464141.jpg@s_2,w_500,h_500","song_id":"34153315","pic_small":"http://qukufile2.qianqian.com/data2/pic/124464141/124464141.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/124802097/124802097.jpg@s_2,w_1000,h_1000","ting_uid":"1209","si_proxycompany":"滚石国际音乐股份有限公司","author":"赵传","info":"","album_title":"我终于失去了你","title":"我终于失去了你","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/124802097/124802097.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"1989-06-04","pic_premium":"http://qukufile2.qianqian.com/data2/pic/124802097/124802097.jpg@s_2,w_500,h_500","song_id":"10386683","pic_small":"http://qukufile2.qianqian.com/data2/pic/124802097/124802097.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/music/883FD3D00802D653B1586465419FDB63/255637274/255637274.jpg","ting_uid":"232955144","si_proxycompany":"汕头市中林文化传媒有限公司","author":"陈梓豪","info":"","album_title":"天蓬大元帅","title":"天蓬大元帅","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/music/883FD3D00802D653B1586465419FDB63/255637274/255637274.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2015-09-12","pic_premium":"http://qukufile2.qianqian.com/data2/music/883FD3D00802D653B1586465419FDB63/255637274/255637274.jpg@s_2,w_500,h_500","song_id":"247109265","pic_small":"http://qukufile2.qianqian.com/data2/music/883FD3D00802D653B1586465419FDB63/255637274/255637274.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/21525784c980c3103d42ca867cebeb3b/610697149/610697149.jpg@s_2,w_1000,h_1000","ting_uid":"88037695","si_proxycompany":"上海市欣雨文化传媒有限公司","author":"小老头","info":"","album_title":"绿野户外驴歌","title":"我的老父亲","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/21525784c980c3103d42ca867cebeb3b/610697149/610697149.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2015-02-12","pic_premium":"http://qukufile2.qianqian.com/data2/pic/21525784c980c3103d42ca867cebeb3b/610697149/610697149.jpg@s_2,w_500,h_500","song_id":"135928448","pic_small":"http://qukufile2.qianqian.com/data2/pic/21525784c980c3103d42ca867cebeb3b/610697149/610697149.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/1374375c9972238b765a8864bc64b9a5/613326214/613326214.jpg@s_2,w_1000,h_1000","ting_uid":"110947521","si_proxycompany":"反正靠谱（北京）音乐有限责任公司","author":"周品","info":"","album_title":"路过的世界沿途都是你","title":"路过的世界沿途都是你","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/1374375c9972238b765a8864bc64b9a5/613326214/613326214.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2019-03-29","pic_premium":"http://qukufile2.qianqian.com/data2/pic/1374375c9972238b765a8864bc64b9a5/613326214/613326214.jpg@s_2,w_500,h_500","song_id":"613326165","pic_small":"http://qukufile2.qianqian.com/data2/pic/1374375c9972238b765a8864bc64b9a5/613326214/613326214.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/119999361/119999361.jpg","ting_uid":"2613","si_proxycompany":"北京明业嘉辉文化发展有限公司","author":"张冬玲","info":"","album_title":"爱只说给你听","title":"花开的时候你就来看我","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/119999361/119999361.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2014-05-20","pic_premium":"http://qukufile2.qianqian.com/data2/pic/119999361/119999361.jpg@s_2,w_500,h_500","song_id":"119999574","pic_small":"http://qukufile2.qianqian.com/data2/pic/119999361/119999361.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/babc90f1c0d9cda330a931a48241815e/567184179/567184179.jpg@s_2,w_1000,h_1000","ting_uid":"340290225","si_proxycompany":"西藏海尧文化艺术有限公司","author":"胡旭晨","info":"","album_title":"星动亚洲第三季第6期","title":"追光者","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/babc90f1c0d9cda330a931a48241815e/567184179/567184179.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2017-12-03","pic_premium":"http://qukufile2.qianqian.com/data2/pic/babc90f1c0d9cda330a931a48241815e/567184179/567184179.jpg@s_2,w_500,h_500","song_id":"567184620","pic_small":"http://qukufile2.qianqian.com/data2/pic/babc90f1c0d9cda330a931a48241815e/567184179/567184179.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/36cb8ae5e98588a6541d2334e71324e3/610267944/610267944.jpg@s_2,w_1000,h_1000","ting_uid":"340297124","si_proxycompany":"独立音乐人","author":"马思唯","info":"","album_title":"P.E.I Vol.2","title":"马思唯 - 崂山道士","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/36cb8ae5e98588a6541d2334e71324e3/610267944/610267944.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2014-02-11","pic_premium":"http://qukufile2.qianqian.com/data2/pic/36cb8ae5e98588a6541d2334e71324e3/610267944/610267944.jpg@s_2,w_500,h_500","song_id":"610267880","pic_small":"http://qukufile2.qianqian.com/data2/pic/36cb8ae5e98588a6541d2334e71324e3/610267944/610267944.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/55fbdbf8364a847020e06ae7548702a0/288632073/288632073.jpg@s_2,w_1000,h_1000","ting_uid":"43997434","si_proxycompany":"北京新奥视讯国际文化传媒有限公司","author":"DJ小可","info":"","album_title":"DJ小可 ⑩帽子戏法","title":"雨中慢摇","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/55fbdbf8364a847020e06ae7548702a0/288632073/288632073.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2008-02-25","pic_premium":"http://qukufile2.qianqian.com/data2/pic/55fbdbf8364a847020e06ae7548702a0/288632073/288632073.jpg","song_id":"18173490","pic_small":"http://qukufile2.qianqian.com/data2/pic/55fbdbf8364a847020e06ae7548702a0/288632073/288632073.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/8d6d36c66ccb0dd8acf707e8fce234be/611681814/611681814.jpg@s_2,w_1000,h_1000","ting_uid":"2517","si_proxycompany":"TAIHE MUSIC GROUP","author":"薛之谦","info":"","album_title":"怪咖","title":"哑巴","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/8d6d36c66ccb0dd8acf707e8fce234be/611681814/611681814.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2018-12-31","pic_premium":"http://qukufile2.qianqian.com/data2/pic/8d6d36c66ccb0dd8acf707e8fce234be/611681814/611681814.jpg@s_2,w_500,h_500","song_id":"591310911","pic_small":"http://qukufile2.qianqian.com/data2/pic/8d6d36c66ccb0dd8acf707e8fce234be/611681814/611681814.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/258961341/258961341.jpg","ting_uid":"55225920","si_proxycompany":"巴州魔音文化传媒有限公司","author":"云飞","info":"","album_title":"绣满霞光的蒙古袍","title":"天边","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/258961341/258961341.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2015-11-24","pic_premium":"http://qukufile2.qianqian.com/data2/pic/258961341/258961341.jpg@s_2,w_500,h_500","song_id":"258962519","pic_small":"http://qukufile2.qianqian.com/data2/pic/258961341/258961341.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/fa2da19b8344d2848a66d8998e5e66e1/70727/70727.png@s_2,w_1000,h_1000","ting_uid":"1228","si_proxycompany":"滚石国际音乐股份有限公司","author":"陈淑桦","info":"电影《滚滚红尘》主题曲","album_title":"给淑桦的一封信","title":"滚滚红尘","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/fa2da19b8344d2848a66d8998e5e66e1/70727/70727.png@s_2,w_150,h_150","pic_singer":"","publishtime":"2003-12-26","pic_premium":"http://qukufile2.qianqian.com/data2/pic/fa2da19b8344d2848a66d8998e5e66e1/70727/70727.png@s_2,w_500,h_500","song_id":"241645","pic_small":"http://qukufile2.qianqian.com/data2/pic/fa2da19b8344d2848a66d8998e5e66e1/70727/70727.png@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/958843fee2d48ee196af32ce31887711/614339598/614339598.jpg@s_2,w_1000,h_1000","ting_uid":"1092","si_proxycompany":"滚石国际音乐股份有限公司","author":"张国荣","info":"电影《金枝玉叶2》主题曲","album_title":"国.日.英最佳精选","title":"有心人","language":"yue","pic_big":"http://qukufile2.qianqian.com/data2/pic/958843fee2d48ee196af32ce31887711/614339598/614339598.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2000-05-01","pic_premium":"http://qukufile2.qianqian.com/data2/pic/958843fee2d48ee196af32ce31887711/614339598/614339598.jpg","song_id":"1072998","pic_small":"http://qukufile2.qianqian.com/data2/pic/958843fee2d48ee196af32ce31887711/614339598/614339598.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/5e85a56aea07840c0fec9b743fe44648/612258065/612258065.jpg@s_2,w_1000,h_1000","ting_uid":"1557","si_proxycompany":"华宇世博音乐文化（北京）有限公司-普通代理","author":"许嵩","info":"","album_title":"寻雾启示","title":"庐州月","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/5e85a56aea07840c0fec9b743fe44648/612258065/612258065.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2009-12-24","pic_premium":"http://qukufile2.qianqian.com/data2/pic/5e85a56aea07840c0fec9b743fe44648/612258065/612258065.jpg@s_2,w_500,h_500","song_id":"273993","pic_small":"http://qukufile2.qianqian.com/data2/pic/5e85a56aea07840c0fec9b743fe44648/612258065/612258065.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/5070d8a2ba77bb9c7c0bf75bcae8de0c/613202368/613202368.jpg@s_2,w_1000,h_1000","ting_uid":"1314","si_proxycompany":"反正靠谱（北京）音乐有限责任公司","author":"老狼,小柯","info":"","album_title":"谁","title":"谁（电影《老师·好》推广曲）","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/5070d8a2ba77bb9c7c0bf75bcae8de0c/613202368/613202368.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2019-03-25","pic_premium":"http://qukufile2.qianqian.com/data2/pic/5070d8a2ba77bb9c7c0bf75bcae8de0c/613202368/613202368.jpg@s_2,w_500,h_500","song_id":"613175124","pic_small":"http://qukufile2.qianqian.com/data2/pic/5070d8a2ba77bb9c7c0bf75bcae8de0c/613202368/613202368.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/05887d71d4301b51760d130ff830a95f/130259271/130259271.jpg@s_2,w_1000,h_1000","ting_uid":"247684","si_proxycompany":"安徽汉马文化传媒有限公司","author":"龙飞,门丽","info":"","album_title":"亲爱的 你在哪里","title":"亲爱的你在哪里","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/05887d71d4301b51760d130ff830a95f/130259271/130259271.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2015-01-14","pic_premium":"http://qukufile2.qianqian.com/data2/pic/05887d71d4301b51760d130ff830a95f/130259271/130259271.jpg@s_2,w_500,h_500","song_id":"242185322","pic_small":"http://qukufile2.qianqian.com/data2/pic/05887d71d4301b51760d130ff830a95f/130259271/130259271.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/c8011e2241efd6b7ccca028269f7fdc3/68387/68387.jpg@s_2,w_1000,h_1000","ting_uid":"1095","si_proxycompany":"滚石国际音乐股份有限公司","author":"梁静茹","info":"","album_title":"勇气","title":"爱你不是两三天","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/c8011e2241efd6b7ccca028269f7fdc3/68387/68387.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2000-08-02","pic_premium":"http://qukufile2.qianqian.com/data2/pic/c8011e2241efd6b7ccca028269f7fdc3/68387/68387.jpg@s_2,w_500,h_500","song_id":"748830","pic_small":"http://qukufile2.qianqian.com/data2/pic/c8011e2241efd6b7ccca028269f7fdc3/68387/68387.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/116502218/116502218.jpg@s_2,w_1000,h_1000","ting_uid":"7209932","si_proxycompany":"北京东方艺乐文化传播有限公司","author":"咏咏","info":"","album_title":"净土十小咒","title":"消灾吉祥神咒 (佛教音乐)","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/116502218/116502218.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2014-03-15","pic_premium":"http://qukufile2.qianqian.com/data2/pic/116502218/116502218.jpg","song_id":"116503401","pic_small":"http://qukufile2.qianqian.com/data2/pic/116502218/116502218.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/1b231e4e096e7d1885b000152cad120e/68563/68563.jpg@s_2,w_1000,h_1000","ting_uid":"1228","si_proxycompany":"滚石国际音乐股份有限公司","author":"陈淑桦,周华健","info":"","album_title":"爱的进行式","title":"萍水相逢","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/1b231e4e096e7d1885b000152cad120e/68563/68563.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"1994-01-27","pic_premium":"http://qukufile2.qianqian.com/data2/pic/1b231e4e096e7d1885b000152cad120e/68563/68563.jpg@s_2,w_500,h_500","song_id":"309125","pic_small":"http://qukufile2.qianqian.com/data2/pic/1b231e4e096e7d1885b000152cad120e/68563/68563.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/1a037d20bc3b666c4354e70816fdd8cc/601810743/601810743.jpg","ting_uid":"87901298","si_proxycompany":"北京龙乐世纪文化传媒有限公司","author":"阿本","info":"","album_title":"伤心的时候可以听情歌","title":"伤心的时候可以听情歌","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/1a037d20bc3b666c4354e70816fdd8cc/601810743/601810743.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2001-01-08","pic_premium":"http://qukufile2.qianqian.com/data2/pic/1a037d20bc3b666c4354e70816fdd8cc/601810743/601810743.jpg@s_2,w_500,h_500","song_id":"22662642","pic_small":"http://qukufile2.qianqian.com/data2/pic/1a037d20bc3b666c4354e70816fdd8cc/601810743/601810743.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/36761a317162c60da53839dc15aec38c/603877729/603877729.jpg@s_2,w_1000,h_1000","ting_uid":"2170032","si_proxycompany":"北京兰楚森文化传播有限公司","author":"张可儿","info":"","album_title":"爱你一百岁","title":"美丽姑娘花一样","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/36761a317162c60da53839dc15aec38c/603877729/603877729.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2013-08-06","pic_premium":"http://qukufile2.qianqian.com/data2/pic/36761a317162c60da53839dc15aec38c/603877729/603877729.jpg","song_id":"68719015","pic_small":"http://qukufile2.qianqian.com/data2/pic/36761a317162c60da53839dc15aec38c/603877729/603877729.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/55438873881e95fbeb8036e135b26396/568967878/568967878.jpg@s_2,w_1000,h_1000","ting_uid":"1383","si_proxycompany":"完美青春(成都)文化传播有限公司","author":"李健,王俊凯","info":"电影《解忧杂货店》宣传曲","album_title":"雾中列车","title":"雾中列车","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/55438873881e95fbeb8036e135b26396/568967878/568967878.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2017-12-26","pic_premium":"http://qukufile2.qianqian.com/data2/pic/55438873881e95fbeb8036e135b26396/568967878/568967878.jpg@s_2,w_500,h_500","song_id":"568445418","pic_small":"http://qukufile2.qianqian.com/data2/pic/55438873881e95fbeb8036e135b26396/568967878/568967878.jpg@s_2,w_90,h_90"},{"pic_huge":"http://qukufile2.qianqian.com/data2/pic/829663acc8201cb05dbe484a6d6c672f/186087/186087.jpg@s_2,w_1000,h_1000","ting_uid":"1261","si_proxycompany":"滚石国际音乐股份有限公司","author":"陈绮贞","info":"","album_title":"还是会寂寞","title":"还是会寂寞","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/829663acc8201cb05dbe484a6d6c672f/186087/186087.jpg@s_2,w_150,h_150","pic_singer":"","publishtime":"2000-04-12","pic_premium":"http://qukufile2.qianqian.com/data2/pic/829663acc8201cb05dbe484a6d6c672f/186087/186087.jpg@s_2,w_500,h_500","song_id":"621106","pic_small":"http://qukufile2.qianqian.com/data2/pic/829663acc8201cb05dbe484a6d6c672f/186087/186087.jpg@s_2,w_90,h_90"}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * pic_huge : http://qukufile2.qianqian.com/data2/pic/3e365e7535b811de49d93048e40a3c35/165460/165460.jpg@s_2,w_1000,h_1000
         * ting_uid : 1230
         * si_proxycompany : 滚石国际音乐股份有限公司
         * author : 李圣杰
         * info :
         * album_title : 关于你的歌
         * title : 手放开
         * language : 国语
         * pic_big : http://qukufile2.qianqian.com/data2/pic/3e365e7535b811de49d93048e40a3c35/165460/165460.jpg@s_2,w_150,h_150
         * pic_singer :
         * publishtime : 2006-06-16
         * pic_premium : http://qukufile2.qianqian.com/data2/pic/3e365e7535b811de49d93048e40a3c35/165460/165460.jpg@s_2,w_500,h_500
         * song_id : 2076038
         * pic_small : http://qukufile2.qianqian.com/data2/pic/3e365e7535b811de49d93048e40a3c35/165460/165460.jpg@s_2,w_90,h_90
         */

        private String pic_huge;
        private String ting_uid;
        private String si_proxycompany;
        private String author;
        private String info;
        private String album_title;
        private String title;
        private String language;
        private String pic_big;
        private String pic_singer;
        private String publishtime;
        private String pic_premium;
        private String song_id;
        private String pic_small;
        private boolean isPlaying;

        public boolean isPlaying() {
            return isPlaying;
        }

        public void setPlaying(boolean playing) {
            isPlaying = playing;
        }

        public String getPic_huge() {
            return pic_huge;
        }

        public void setPic_huge(String pic_huge) {
            this.pic_huge = pic_huge;
        }

        public String getTing_uid() {
            return ting_uid;
        }

        public void setTing_uid(String ting_uid) {
            this.ting_uid = ting_uid;
        }

        public String getSi_proxycompany() {
            return si_proxycompany;
        }

        public void setSi_proxycompany(String si_proxycompany) {
            this.si_proxycompany = si_proxycompany;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getAlbum_title() {
            return album_title;
        }

        public void setAlbum_title(String album_title) {
            this.album_title = album_title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getPic_big() {
            return pic_big;
        }

        public void setPic_big(String pic_big) {
            this.pic_big = pic_big;
        }

        public String getPic_singer() {
            return pic_singer;
        }

        public void setPic_singer(String pic_singer) {
            this.pic_singer = pic_singer;
        }

        public String getPublishtime() {
            return publishtime;
        }

        public void setPublishtime(String publishtime) {
            this.publishtime = publishtime;
        }

        public String getPic_premium() {
            return pic_premium;
        }

        public void setPic_premium(String pic_premium) {
            this.pic_premium = pic_premium;
        }

        public String getSong_id() {
            return song_id;
        }

        public void setSong_id(String song_id) {
            this.song_id = song_id;
        }

        public String getPic_small() {
            return pic_small;
        }

        public void setPic_small(String pic_small) {
            this.pic_small = pic_small;
        }
    }
}