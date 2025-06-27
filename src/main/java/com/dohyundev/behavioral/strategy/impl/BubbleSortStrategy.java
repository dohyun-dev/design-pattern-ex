package com.dohyundev.behavioral.strategy.impl;

import com.dohyundev.behavioral.strategy.SortStrategy;

public class BubbleSortStrategy implements SortStrategy {
    @Override
    public int[] sort(int[] array) {
        int[] result = array.clone();
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j] > result[j+1]) {
                    swap(result, j, j + 1);
                }
            }
        }
        return result;
    }
}
