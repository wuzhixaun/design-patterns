package com.wuzx.behavioral.observer;

public class HumanFans extends AbstractFans {
    @Override
    void acceptMsg(String msg) {
        System.out.println("主播说："+msg);
    }
}
