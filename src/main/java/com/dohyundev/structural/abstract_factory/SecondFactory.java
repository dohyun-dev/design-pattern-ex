package com.dohyundev.structural.abstract_factory;

public class SecondFactory implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new CustomProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new CustomProductB2();
    }
}
