package com.FactoryMethodDP;

import com.FactoryMethodDP.CarTypes.Car;

public class Demo {
    public static void main(String[] args) {
        CarCreator cc = new CarCreator();
        Car car1 = cc.createNew("fast");
        Car car2 = cc.createNew("lightweight");
        Car car3 = cc.createNew("powerful");

        car1.writeSpecs();
        car2.writeSpecs();
        car3.writeSpecs();
    }
}
