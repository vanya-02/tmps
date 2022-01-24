package com.FactoryMethodDP.CarTypes;

import java.util.Random;

public class LightweightCar extends Car {
    public LightweightCar(){
        Random rand = new Random();

        this.mileage = rand.nextInt(200)+700;
        this.mass = rand.nextInt(300)+600;
        this.maxSpeed = rand.nextInt(30)+100;
    }

    @Override
    public void writeSpecs() {
        System.out.println("This is a lightweight car with the following specifications:");
        System.out.println("mileage:" + this.mileage);
        System.out.println("max speed:" + this.maxSpeed);
        System.out.println("mass:" + this.mass);
    }
}
