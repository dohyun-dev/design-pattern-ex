package com.dohyundev.creational.practice;

import java.time.Duration;
import java.time.Instant;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.IntStream;

public class PlacticeSingleton {

    static class SingletonDoubleCheckLocking {
        private static volatile SingletonHolder instance;

        static SingletonHolder getInstance() {
            if (instance == null) {
                synchronized (SingletonHolder.class) {
                    if (instance == null) {
                        instance = new SingletonHolder();
                    }
                }
            }
            return instance;
        }

        public static void main(String[] args) {
            Instant before = Instant.now();
            Collection<SingletonHolder> duplicatedCheckSet = Collections.synchronizedCollection(new HashSet<SingletonHolder>());
            IntStream.range(0, 100000).mapToObj(i -> new Thread(() -> {
                SingletonHolder instance = SingletonHolder.getInstance();
                duplicatedCheckSet.add(instance);
            })).peek(Thread::start)
                    .forEach(t -> {
                        try {
                            t.join();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    });
            System.out.println(duplicatedCheckSet.size() == 1);

            // 싱글톤 인스턴스 검증
            System.out.println("싱글톤 인스턴스 개수: " + duplicatedCheckSet.size());
            System.out.println("정상 여부: " + (duplicatedCheckSet.size() == 1));

            Instant after = Instant.now();
            System.out.println("실행 시간: " + Duration.between(before, after).toMillis() + " ms");
        }
    }

    static class SingletonHolder {
        static SingletonHolder getInstance() {
            return Holder.instance;
        }

        private static class Holder {
            private static SingletonHolder instance = new SingletonHolder();
        }

        public static void main(String[] args) {
            Instant before = Instant.now();
            Collection<SingletonHolder> duplicatedCheckSet = Collections.synchronizedCollection(new HashSet<SingletonHolder>());
            IntStream.range(0, 100000).mapToObj(i -> new Thread(() -> {
                        SingletonHolder instance = SingletonHolder.getInstance();
                        duplicatedCheckSet.add(instance);
                    })).peek(Thread::start)
                    .forEach(t -> {
                        try {
                            t.join();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    });
            System.out.println(duplicatedCheckSet.size() == 1);

            // 싱글톤 인스턴스 검증
            System.out.println("싱글톤 인스턴스 개수: " + duplicatedCheckSet.size());
            System.out.println("정상 여부: " + (duplicatedCheckSet.size() == 1));

            Instant after = Instant.now();
            System.out.println("실행 시간: " + Duration.between(before, after).toMillis() + " ms");
        }
    }
}
