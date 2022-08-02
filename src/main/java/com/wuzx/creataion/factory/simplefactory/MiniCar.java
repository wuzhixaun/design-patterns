package com.wuzx.creataion.factory.simplefactory;

public class MiniCar extends AbstractCar {

    public MiniCar() {
        this.engine = "小汽车";
    }

    @Override
    public void run() {
        System.out.println("小气车发动");
    }
}
