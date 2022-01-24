package com.PrototypeDP;

import com.PrototypeDP.CarTypes.Car;
import com.PrototypeDP.CarTypes.FastCar;
import com.PrototypeDP.CarTypes.LightweightCar;
import com.PrototypeDP.CarTypes.PowerfulCar;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CarDesigner {
    private static final Map<String, Car> carMap = new HashMap<>();

    public static Car getCar(String  name)
    {
        return (Car) carMap.get(name).clone();
    }

    public static void newCar(String modelName){
        Random rand = new Random();
        int type = rand.nextInt(3);

        Car car;
        switch (type) {
            case 0 -> {
                car = new FastCar();
            }
            case 1 -> {
                car = new LightweightCar();
            }
            case 2 -> {
                car = new PowerfulCar();
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        car.setModel("Model "+ modelName);

        carMap.put(car.getModel(), car);
    }
}
