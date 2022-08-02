package com.wuzx.creataion.factory.simplefactory;

public class WuLinFactory {


    public AbstractCar newCar(String type) {
        if ("van".equals(type)) {
            return new VanCar();
        } else if ("mini".equals(type)) {
            return new MiniCar();
        }
        return null;
    }
}
