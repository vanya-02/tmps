package com.BuilderDP.CarTypes;

import com.BuilderDP.PilotTypes.Pilot;

public interface Car {
    public String getModelName();
    public Pilot automationLevel();
    public float getPrice();
}
