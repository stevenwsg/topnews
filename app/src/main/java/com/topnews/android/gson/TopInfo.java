package com.topnews.android.gson;

import java.io.Serializable;

/**
 * Created by dell on 2017/3/7.
 *
 * 首页新闻信息封装
 */

public class TopInfo implements Serializable{

    public String id;

    public String title;

    public String source;

    public String imgeUrl;

    public String ContentUrl;

    public int curPage;    //当前页面

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof TopInfo))
            return false;

        TopInfo info= (TopInfo) obj;

        return this.title.equals(info.title);
    }
}
