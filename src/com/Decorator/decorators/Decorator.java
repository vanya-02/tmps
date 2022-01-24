package com.Decorator.decorators;

import com.Decorator.abstractions.IOptions;

public abstract class Decorator implements IOptions
{
    protected IOptions component;
}
