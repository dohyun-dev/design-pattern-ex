package com.dohyundev.creational.singleton.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ThreadSafeSingleton3 {

    private static volatile ThreadSafeSingleton3 instance;

    private ThreadSafeSingleton3() {
        System.out.println("생성자 호출: " + this);
    }

    public static ThreadSafeSingleton3 getInstance() {
        if (instance == null) {
            makeInstance();
        }
        return instance;
    }

    private static void makeInstance() {
        synchronized (ThreadSafeSingleton3.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton3();
            }
        }
    }

    /**
     * Thread-Safe 하지 않음
     * 동시에 여러 thread 접근 가능
     */
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

        // 중복 여부 검사
        long distinctCount = instances.stream().distinct().count();
        System.out.println("\n서로 다른 인스턴스 수: " + distinctCount);
    }
}
