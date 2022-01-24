package com.BuilderDP.CarTypes;

public class FastCar extends ConditionalAutomation{
    @Override
    public String getModelName() {
        return "Tesla Model S";
    }

    @Override
    public float getPrice() {
        return 35000.00F;
    }
}
