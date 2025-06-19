package com.dohyundev.structural.abstract_factory;

public class CustomProductB1 extends ProductB {
    @Override
    public void use() {
        System.out.println(this.getClass().getName());
    }
}
