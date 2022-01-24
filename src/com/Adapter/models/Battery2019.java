package com.Adapter.models;

import com.Adapter.abstractions.Battery;

public class Battery2019 implements Battery {
    private String batteryCapacity = "87320 Wh";

    @Override
    public String getWh() {
        return batteryCapacity;
    }
}
