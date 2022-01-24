package com.FactoryMethodDP;

import com.FactoryMethodDP.CarTypes.Car;
import com.FactoryMethodDP.CarTypes.FastCar;
import com.FactoryMethodDP.CarTypes.LightweightCar;
import com.FactoryMethodDP.CarTypes.PowerfulCar;

public class CarCreator {

    public Car createNew(String type){
        switch (type) {
            case "lightweight" -> { return new LightweightCar(); }
            case "powerful" -> { return new PowerfulCar(); }
            case "fast" -> { return new FastCar(); }
        }

        return null;
    }
}
