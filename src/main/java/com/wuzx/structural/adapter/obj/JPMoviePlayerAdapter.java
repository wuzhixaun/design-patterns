package com.wuzx.structural.adapter.obj;


import com.wuzx.structural.adapter.Player;
import com.wuzx.structural.adapter.Translator;
import com.wuzx.structural.adapter.ZhTranslator;


/**
 * 组合的方式：对象结构模型，适配转换到了翻译器的功能上
 *
 * （继承、组合）、封装、多态
 *
 *
 *
 */
public class JPMoviePlayerAdapter implements Player {

    //组合的方式
    private Translator translator = new ZhTranslator();
    private Player target;//被适配对象
    public JPMoviePlayerAdapter(Player target){
        this.target = target;
    }

    @Override
    public String play() {

        String play = target.play();
        //转换字幕
        String translate = translator.translate(play);
        System.out.println("日文："+translate);
        return play;
    }
}
