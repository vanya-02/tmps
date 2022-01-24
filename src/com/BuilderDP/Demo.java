package com.BuilderDP;

import com.BuilderDP.CarTypes.FastCar;
import com.BuilderDP.CarTypes.NoLiceseCar;
import com.BuilderDP.CarTypes.PowerfulCar;

public class Demo {
    public static void main(String[] args) {
        PackBuilder family_pack = new PackBuilder();

        family_pack.addItem(new NoLiceseCar());
        family_pack.addItem(new FastCar());

        family_pack.showCars();


        PackBuilder business_pack = new PackBuilder();

        business_pack.addItem(new FastCar());
        business_pack.addItem(new PowerfulCar());

        business_pack.showCars();
    }
}
