package com.wuzx.creataion.factory.factorymethod;

/**
 * RacingCar分厂
 */
public class WulinRacingCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
