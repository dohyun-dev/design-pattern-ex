package com.dohyundev.creational.practice;

public class PracticeFactoryMethod {

    interface CarFactory {
        Car create();
    }

    static class AvanteFactory implements CarFactory {
        private interface AvanteProperties {
            int ENGINE_DISPLACEMENT = 1599;
            int ENGINE_POWER = 150;
            int LIMIT_SPEED = 230;
        }

        @Override
        public Car create() {
            return new Avante(AvanteProperties.ENGINE_DISPLACEMENT, AvanteProperties.ENGINE_POWER, AvanteProperties.LIMIT_SPEED);
        }
    }

    static class GrandureFactory implements CarFactory {
        private interface GrandureProperties {
            int ENGINE_DISPLACEMENT = 2998;
            int ENGINE_POWER = 250;
            int LIMIT_SPEED = 250;
        }

        @Override
        public Car create() {
            return new Grandure(GrandureProperties.ENGINE_DISPLACEMENT, GrandureProperties.ENGINE_POWER, GrandureProperties.LIMIT_SPEED);
        }
    }

    abstract static class Car {
        private final int engineDisplacement;
        private final int enginePower;
        private final int limitSpeed;

        public Car(int engineDisplacement, int enginePower, int limitSpeed) {
            this.engineDisplacement = engineDisplacement;
            this.enginePower = enginePower;
            this.limitSpeed = limitSpeed;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "engineDisplacement=" + engineDisplacement +
                    ", enginePower=" + enginePower +
                    ", limitSpeed=" + limitSpeed +
                    '}';
        }
    }

    public static class Avante extends Car {
        public Avante(int engineDisplacement, int enginePower, int limitSpeed) {
            super(engineDisplacement, enginePower, limitSpeed);
        }
    }

    public static class Grandure extends Car {
        public Grandure(int engineDisplacement, int enginePower, int limitSpeed) {
            super(engineDisplacement, enginePower, limitSpeed);
        }
    }

    public static void main(String[] args) {
        CarFactory avanteFactory = new AvanteFactory();
        CarFactory grandureFactory = new GrandureFactory();

        Car car1 = avanteFactory.create();
        Car car2 = grandureFactory.create();

        System.out.println(car1);
        System.out.println(car2);
    }
}
