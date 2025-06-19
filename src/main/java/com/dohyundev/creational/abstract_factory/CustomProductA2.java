package com.dohyundev.creational.abstract_factory;

public class CustomProductA2 extends ProductA {
    @Override
    public void use() {
        System.out.println(this.getClass().getName());
    }
}
