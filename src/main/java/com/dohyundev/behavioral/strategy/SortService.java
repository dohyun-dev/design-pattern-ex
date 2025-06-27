package com.dohyundev.behavioral.strategy;

public class SortService {
    private final SortStrategy sortStrategy;

    public SortService(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] array) {
        return sortStrategy.sort(array);
    }
}
