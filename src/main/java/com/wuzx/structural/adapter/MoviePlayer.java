package com.wuzx.structural.adapter;


/**
 * 电影播放器
 */
public class MoviePlayer implements Player {


    @Override
    public String play() {
        System.out.println("正在播放英雄联盟.avi");
        String content = "你好";
        System.out.println(content);
        return content;
    }
}
