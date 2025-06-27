package com.dohyundev.behavioral.chain_of_responsibility;

public class ConcreteHandler1 extends Handler {

    @Override
    protected void handleRequest(String request) {
        System.out.println("request 처리1");
    }
}
