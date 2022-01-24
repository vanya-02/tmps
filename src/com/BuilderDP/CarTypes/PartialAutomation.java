package com.BuilderDP.CarTypes;

import com.BuilderDP.PilotTypes.LevelTwo;

public abstract class PartialAutomation implements Car{
    @Override
    public LevelTwo automationLevel() {
        return new LevelTwo();
    }

    @Override
    public abstract String getModelName();

    @Override
    public abstract float getPrice();

}
