package com.dohyundev.structural.abstract_factory;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = new OneFactory();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        AbstractFactory factory2 = new SecondFactory();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();

        productA1.use();
        productB1.use();
        productA2.use();
        productB2.use();
    }
}
