package com.PrototypeDP.CarTypes;

public abstract class Car implements Cloneable{
    protected String model;
    protected Integer mass;
    protected Integer mileage;
    protected Integer maxSpeed;

    public abstract void writeSpecs();

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Object clone() {
        Object carClone = null;

        try {
            carClone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return carClone;
    }
}
