package com.FactoryMethodDP.CarTypes;

import java.util.Random;

public class PowerfulCar extends Car{
    public PowerfulCar(){
        Random rand = new Random();

        this.mileage = rand.nextInt(100)+300;
        this.mass = rand.nextInt(500)+1100;
        this.maxSpeed = rand.nextInt(40)+60;
    }

    @Override
    public void writeSpecs() {
        System.out.println("This is a powerful car with the following specifications:");
        System.out.println("mileage:" + this.mileage);
        System.out.println("max speed:" + this.maxSpeed);
        System.out.println("mass:" + this.mass);
    }
}