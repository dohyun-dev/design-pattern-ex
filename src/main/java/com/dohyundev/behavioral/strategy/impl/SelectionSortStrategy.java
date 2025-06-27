package com.dohyundev.behavioral.strategy.impl;

import com.dohyundev.behavioral.strategy.SortStrategy;

public class SelectionSortStrategy implements SortStrategy {

    @Override
    public int[] sort(int[] array) {
        int[] result = array.clone();

        for (int i = 0; i < result.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < result.length; j++) {
                if (result[minIndex] > result[j]) {
                    minIndex = j;
                }
            }
            swap(result, i, minIndex);
        }

        return result;
    }
}
