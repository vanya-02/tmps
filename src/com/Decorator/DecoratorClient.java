package com.Decorator;

import com.Decorator.abstractions.IOptions;
import com.Decorator.decorators.StandardOptions;
import com.Decorator.decorators.LuxuryOptions;

public class DecoratorClient
{
    public static void main(String[] args)
    {
        IOptions baseModel = new ConcreteComponent();
        System.out.println("  On base models you can choose:");
        baseModel.optionsList();

        IOptions standardModel = new StandardOptions(baseModel);
        System.out.println("\n  On standard models car you can choose:");
        standardModel.optionsList();

        IOptions luxuryModel = new LuxuryOptions(standardModel);
        System.out.println("\n  On luxury models car you can choose:");
        luxuryModel.optionsList();
    }
}
