package com.dohyundev.behavioral.chain_of_responsibility;

public class ConcreteHandler3 extends Handler {

    @Override
    protected void handleRequest(String request) {
        System.out.println("request 처리3");
    }
}
