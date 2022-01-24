package com.Adapter;

import com.Adapter.abstractions.Battery;
import com.Adapter.models.Battery2020;

public class BatteryAdapter implements Battery
{
    Battery2020 battery2020;

    public BatteryAdapter(Battery2020 battery2020){
        this.battery2020 = battery2020;
    }

    @Override
    public String getWh() {
        return battery2020.getBatteryWeight() *
                battery2020.getBatterySpecificEnergy() +
                " Wh";
    }
}