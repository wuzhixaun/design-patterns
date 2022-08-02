package com.wuzx.creataion.factory.simplefactory;


/**
 * 货车
 */
public class VanCar extends AbstractCar {

    public VanCar() {
        this.engine = "货车";
    }

    @Override
    public void run() {
        System.out.println("货车启动");
    }
}
