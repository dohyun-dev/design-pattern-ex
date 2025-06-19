package com.dohyundev.creational.practice;

public class PracticeAbstractFactory {

    // ===== Abstract Factory =====
    abstract static class CarFactory {
        public abstract Engine createEngine();
        public abstract TransMission createTransmission();
    }

    // ===== Abstract Product: Engine =====
    abstract static class Engine {
        private final int engineDisplacement;
        private final int enginePower;

        public Engine(int engineDisplacement, int enginePower) {
            this.engineDisplacement = engineDisplacement;
            this.enginePower = enginePower;
        }

        public void spec() {
            System.out.println("Engine Displacement: " + engineDisplacement + "cc");
            System.out.println("Engine Power: " + enginePower + "hp");
        }
    }

    // ===== Abstract Product: TransMission =====
    abstract static class TransMission {
        private final Type type;
        private final int gearCount;

        public TransMission(Type type, int gearCount) {
            this.type = type;
            this.gearCount = gearCount;
        }

        public void spec() {
            System.out.println("Transmission Type: " + type);
            System.out.println("Gear Count: " + gearCount);
        }

        enum Type {
            MT, AT
        }
    }

    static class HyundaiEngine extends Engine {
        public HyundaiEngine() {
            super(2000, 150);
        }
    }

    static class ToyotaEngine extends Engine {
        public ToyotaEngine() {
            super(1800, 140);
        }
    }

    static class HyundaiTransMission extends TransMission {
        public HyundaiTransMission() {
            super(Type.AT, 6);
        }
    }

    static class ToyotaTransMission extends TransMission {
        public ToyotaTransMission() {
            super(Type.MT, 5);
        }
    }

    static class HyundaiFactory extends CarFactory {
        public Engine createEngine() {
            return new HyundaiEngine();
        }

        public TransMission createTransmission() {
            return new HyundaiTransMission();
        }
    }

    static class ToyotaFactory extends CarFactory {
        public Engine createEngine() {
            return new ToyotaEngine();
        }

        public TransMission createTransmission() {
            return new ToyotaTransMission();
        }
    }

    public static void main(String[] args) {
        CarFactory factory = new HyundaiFactory();

        Engine engine = factory.createEngine();
        TransMission transmission = factory.createTransmission();

        engine.spec();
        transmission.spec();
    }
}
