package com.PrototypeDP;

public class Demo {
    public static void main (String[] args){
        // generate a few cars
        CarDesigner.newCar("V");
        CarDesigner.newCar("W");
        CarDesigner.newCar("X");
        CarDesigner.newCar("Y");
        CarDesigner.newCar("Z");

        // print their specs
        CarDesigner.getCar("Model V").writeSpecs();
        CarDesigner.getCar("Model W").writeSpecs();
        CarDesigner.getCar("Model X").writeSpecs();
        CarDesigner.getCar("Model Y").writeSpecs();
        CarDesigner.getCar("Model Z").writeSpecs();

    }
}
