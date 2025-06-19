package com.dohyundev.structural.factory_method;

import java.util.List;

public class FactoryMethod {
    public static void main(String[] args) {
        List<AbstractFactory> abstractFactories = List.of(new ConcreteFactoryA(), new ConcreteFactoryB());

        abstractFactories.stream().map(AbstractFactory::create).forEach(Product::use);
    }
}
