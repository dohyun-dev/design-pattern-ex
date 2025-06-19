package com.dohyundev.structural.abstract_factory;

public class CustomProductA1 extends ProductA {
    @Override
    public void use() {
        System.out.println(this.getClass().getName());
    }
}
