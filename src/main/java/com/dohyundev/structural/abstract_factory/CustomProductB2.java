package com.dohyundev.structural.abstract_factory;

public class CustomProductB2 extends ProductB {
    @Override
    public void use() {
        System.out.println(this.getClass().getName());
    }
}
