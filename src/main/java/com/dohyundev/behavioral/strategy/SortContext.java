package com.dohyundev.behavioral.strategy;

public class SortContext {
    private SortStrategy sortStrategy;

    public SortContext() {
    }

    public SortContext(SortStrategy defaultStrategy) {
        this.sortStrategy = defaultStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] array) {
        sortStrategy.printStartMessage();
        int[] cloneArray = array.clone();
        sortStrategy.sort(cloneArray);
        return cloneArray;
    }
}
