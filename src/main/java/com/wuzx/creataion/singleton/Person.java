package com.wuzx.creataion.singleton;


/**
 * 单例设计模式
 * 一个单一的类，负责创建自己的对象，同时确保系统中只有单个对象被创建。
 * 单例特点
 * •某个类只能有一个实例；（构造器私有）
 * •它必须自行创建这个实例；（自己编写实例化逻辑）
 * •它必须自行向整个系统提供这个实例；（对外提供实例化方法）
 */
public class Person {

    private String name;
    private int age;


    private volatile static Person person;

    /**
     * 构造方法私有化
     */
    private Person() {

    }


    /**
     * 获取实例
     *
     * @return
     */
    public static synchronized Person getInstance() {
        if (null == person) {
            synchronized (Person.class) {
                if (null == person) {
                    person = new Person();
                }
            }
        }
        return person;
    }

}
