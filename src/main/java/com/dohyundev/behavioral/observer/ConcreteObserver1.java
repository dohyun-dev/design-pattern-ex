package com.dohyundev.behavioral.observer;

class ConcreteObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("수신1");
    }
}
