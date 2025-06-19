package com.dohyundev.creational.factory_method;

public class ConcreteFactoryA extends ProductFactory {
    @Override
    public Product createProduct() {
        return new ConCreateProductA();
    }
}
