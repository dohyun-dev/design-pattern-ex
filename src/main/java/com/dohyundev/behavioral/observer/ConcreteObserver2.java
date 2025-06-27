package com.dohyundev.behavioral.observer;

class ConcreteObserver2 implements Observer {
    @Override
    public void update() {
        System.out.println("수신2");
    }
}
