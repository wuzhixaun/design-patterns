package com.wuzx.creataion.builder;

public class MainTest {


    public static void main(String[] args) {
        AbstractBuilder builder = new XiaomiBuilder();
        builder.mem("16g").disk("1T").cam("2亿").cpu("晓龙888888888");


        final Phone phone = builder.getPhone();
        System.out.println(phone);
    }
}
