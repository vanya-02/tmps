package com.Adapter;

import com.Adapter.models.Battery2019;
import com.Adapter.models.Battery2020;

public class Client {
    public static void main(String[] args) {
        // get kw/h of old battery type
        Battery2019 battery2019 = new Battery2019();
        System.out.println("Battery capacity of 2019 model: " + battery2019.getWh());

        // get kw/h of new battery type
        Battery2020 battery2020 = new Battery2020();
        BatteryAdapter batteryAdapter = new BatteryAdapter(battery2020);
        System.out.println("Battery capacity of 2020 model: " + batteryAdapter.getWh());
    }
}