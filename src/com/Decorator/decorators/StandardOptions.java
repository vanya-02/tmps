package com.Decorator.decorators;

import com.Decorator.abstractions.IOptions;

public class StandardOptions extends Decorator
{
    private final String standardOptions = "Rims color: black, silver\n" +
            "Battery capacity: 42 kWh, 56 kWh";

    public StandardOptions(IOptions component) {
        this.component = component;
    }

    @Override
    public void optionsList() {
        this.component.optionsList();
        System.out.println(standardOptions);
    }
}
