package com.wuzx.creataion.factory.simplefactory;

public class Main {


    public static void main(String[] args) {
        WuLinFactory factory = new WuLinFactory();

        final AbstractCar van = factory.newCar("van");
        van.run();
        final AbstractCar mini = factory.newCar("mini");
        mini.run();

    }
}
