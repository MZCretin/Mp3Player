/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: NetWrap
 * Author:   a112233
 * Date:     2019/5/25 5:56 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.roll.net;

import com.mzlion.easyokhttp.HttpClient;
import com.roll.model.RecommendListModel;
import com.roll.model.SearchListModel;
import com.roll.model.SongDetaiModel;

/**
 * 〈〉
 *
 * @author a112233
 * @create 2019/5/25
 * @since 1.0.0
 */
public class NetWrap {
    /**
     * 下载图片
     *
     * @param pic
     * @return
     */
    public byte[] downloadPic(String pic) {
        return HttpClient
                // 请求方式和请求url
                .get(pic)
                .execute()
                .asByteData();
    }

    /**
     * 获取推荐数据
     *
     * @return
     */
    public RecommendListModel getRecommendList() {
        return HttpClient
                // 请求方式和请求url
                .get("http://www.mxnzp.com/api/music/recommend/list")
                .execute()
                .asBean(RecommendListModel.class);
    }

    /**
     * 获取音乐详情
     *
     * @param songId
     */
    public SongDetaiModel getSongDetails(String songId) {
        return HttpClient
                .get("http://www.mxnzp.com/api/music/song/detail?songId=" + songId)
                .execute()
                .asBean(SongDetaiModel.class);
    }

    /**
     * 搜索音乐
     * @param keyWord
     * @return
     */
    public SearchListModel searchMusis(String keyWord) {
        return HttpClient
                        .get("http://mxnzp.com/api/music/song/search?keyWord=" + keyWord)
                        .execute()
                        .asBean(SearchListModel.class);
    }
}