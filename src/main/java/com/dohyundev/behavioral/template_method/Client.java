package com.dohyundev.behavioral.template_method;

class Client {

    public static void main(String[] args) {
        AbstractClass ex1 = new ConcreteClass1();
        AbstractClass ex2 = new ConcreteClass2();

        ex1.templateMethod();
        ex2.templateMethod();
    }
}
