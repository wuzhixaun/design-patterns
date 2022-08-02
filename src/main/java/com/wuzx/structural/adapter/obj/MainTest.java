package com.wuzx.structural.adapter.obj;


import com.wuzx.structural.adapter.MoviePlayer;

public class MainTest {
    public static void main(String[] args) {

        // MeiYanDecorator decorator = new MeiYanDecorator(manTikTok);
        JPMoviePlayerAdapter adapter = new JPMoviePlayerAdapter(new MoviePlayer());

        adapter.play();
    }

}
