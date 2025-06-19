package com.dohyundev.structural.factory_method;

public class ConCreateProductB implements Product{
    @Override
    public void setting() {
        System.out.println(this.getClass().getName() + "세팅");
    }

    @Override
    public void use() {
        System.out.println(this.getClass().getName() + "사용");
    }
}