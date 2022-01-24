package com.FactoryMethodDP.CarTypes;

import java.util.Random;

public class FastCar extends Car {
    public FastCar(){
        Random rand = new Random();

        this.mileage = rand.nextInt(100)+400;
        this.mass = rand.nextInt(500)+900;
        this.maxSpeed = rand.nextInt(50)+150;
    }

    @Override
    public void writeSpecs() {
        System.out.println("This is a fast car with the following specifications:");
        System.out.println("mileage:" + this.mileage);
        System.out.println("max speed:" + this.maxSpeed);
        System.out.println("mass:" + this.mass);
    }
}