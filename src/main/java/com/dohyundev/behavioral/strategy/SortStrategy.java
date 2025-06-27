package com.dohyundev.behavioral.strategy;

public interface SortStrategy {
    void sort(int[] array);

    default void swap(int[] array, int targetIndex1, int targetIndex2) {
        int temp = array[targetIndex1];
        array[targetIndex1] = array[targetIndex2];
        array[targetIndex2] = temp;
    }

    void printStartMessage();
}
