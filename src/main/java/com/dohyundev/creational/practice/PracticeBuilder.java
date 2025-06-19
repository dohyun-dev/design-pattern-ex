package com.dohyundev.creational.practice;

public class PracticeBuilder {

    static class Car {
        private int hp;
        private int gearCount;
        private String name;

        public Car(Builder builder) {
            this.hp = builder.hp;
            this.gearCount = builder.gearCount;
            this.name = builder.name;
        }

        static Builder builder() {
            return new Builder();
        }

        static class Builder {
            private int hp;
            private int gearCount;
            private String name;

            public Builder hp(int hp) {
                this.hp = hp;
                return this;
            }

            public Builder gearCount(int gearCount) {
                this.gearCount = gearCount;
                return this;
            }

            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Car build() {
                return new Car(this);
            }
        }

        @Override
        public String toString() {
            return "Car{" +
                    "hp=" + hp +
                    ", gearCount=" + gearCount +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Car car = Car.builder()
                .hp(150)
                .gearCount(6)
                .name("아반떼")
                .build();

        System.out.println(car.toString());
    }
}
