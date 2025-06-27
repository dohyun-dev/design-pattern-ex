package com.dohyundev.behavioral.strategy.impl;

import com.dohyundev.behavioral.strategy.SortStrategy;

public class InsertionSortStrategy implements SortStrategy {
    @Override
    public int[] sort(int[] array) {
        int[] result = array.clone();

        for (int i = 1; i < result.length; i++) {
            for (int j = i; j > 0; j--) {
                if (result[j] < result[j - 1]) {
                    swap(result, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return result;
    }
}
