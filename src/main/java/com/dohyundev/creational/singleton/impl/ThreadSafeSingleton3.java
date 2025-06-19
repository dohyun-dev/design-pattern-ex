package com.dohyundev.creational.singleton.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ThreadSafeSingleton3 {

    private ThreadSafeSingleton3() {
        System.out.println("생성자 호출: " + this);
    }

    private static class Holder {
        private static final ThreadSafeSingleton3 INSTANCE = new ThreadSafeSingleton3();
    }

    public static ThreadSafeSingleton3 getInstance() {
        return Holder.INSTANCE;
    }

    public static void main(String[] args) {
        List<ThreadSafeSingleton3> instances = Collections.synchronizedList(new ArrayList<>());

        Runnable task = () -> {
            ThreadSafeSingleton3 singleton = ThreadSafeSingleton3.getInstance();
            instances.add(singleton);
        };

        List<Thread> threads = IntStream.range(0, 1000)
                .mapToObj(i -> new Thread(task))
                .peek(Thread::start)
                .toList();

        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        long distinctCount = instances.stream().distinct().count();
        System.out.println("\n서로 다른 인스턴스 수: " + distinctCount);
    }
}
