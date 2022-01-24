package com.BuilderDP;

import com.BuilderDP.CarTypes.Car;

import java.util.ArrayList;
import java.util.List;

public class PackBuilder {
    private final List<Car> cars = new ArrayList<Car>();

    public void addItem(Car car){
        cars.add(car);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Car car : cars) {
            cost += car.getPrice();
        }
        return cost;
    }

    public void showCars(){
        for (Car car: cars) {
            System.out.println(car.getModelName());
            System.out.println(car.automationLevel().getAutomationLevel());
            System.out.println("Price : " + car.getPrice() + " $\n");
        }
    }
}
