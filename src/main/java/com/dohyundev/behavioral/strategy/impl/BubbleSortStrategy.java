package com.dohyundev.behavioral.strategy.impl;

import com.dohyundev.behavioral.strategy.SortStrategy;

public class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    @Override
    public void printStartMessage() {
        System.out.println("버블솔트 시작");
    }
}
