package com.dohyundev.structural.factory_method;

public class ConcreteFactoryB extends ProductFactory {
    @Override
    public Product createProduct() {
        return new ConCreateProductB();
    }
}
