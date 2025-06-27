package com.dohyundev.behavioral.strategy;

public class SortContext {
    private SortStrategy sortStrategy;

    public SortContext(SortStrategy defaultStrategy) {
        this.sortStrategy = defaultStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public final int[] sort(int[] array) {
        sortStrategy.printStartMessage();
        sortStrategy.sort(array);
        return array;
    }
}
