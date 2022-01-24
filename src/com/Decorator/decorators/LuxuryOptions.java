package com.Decorator.decorators;

import com.Decorator.abstractions.IOptions;

public class LuxuryOptions extends Decorator
{
    private final String standardOptions = "LIDARs: front, front and back\n" +
            "Automation level: drive assist, autopilot";

    public LuxuryOptions(IOptions component) {
        this.component = component;
    }

    @Override
    public void optionsList()
    {
        this.component.optionsList();
        System.out.println(standardOptions);
    }
}
