package com.dohyundev.behavioral.chain_of_responsibility;

public class ChainOfResponsibilityClient {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNext(handler2).setNext(handler3);

        handler1.run("sss");
    }
}
