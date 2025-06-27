package com.dohyundev.behavioral.observer;

class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        subject.registerObserver(new ConcreteObserver1());
        subject.registerObserver(new ConcreteObserver2());

        subject.notifyObservers();
    }
}
