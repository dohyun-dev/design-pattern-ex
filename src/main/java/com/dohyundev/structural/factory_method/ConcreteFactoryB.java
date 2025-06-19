package com.dohyundev.structural.factory_method;

public class ConcreteFactoryB extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ConCreateProductB();
    }
}
