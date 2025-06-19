package com.dohyundev.creational.factory_method;

import java.util.List;

public class FactoryMethod {
    public static void main(String[] args) {
        List<ProductFactory> abstractFactories = List.of(new ConcreteFactoryA(), new ConcreteFactoryB());

        abstractFactories.stream().map(ProductFactory::create).forEach(Product::use);
    }
}
