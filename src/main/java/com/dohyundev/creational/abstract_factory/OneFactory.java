package com.dohyundev.creational.abstract_factory;

public class OneFactory implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new CustomProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new CustomProductB1();
    }
}
