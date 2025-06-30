package com.dohyundev.behavioral.strategy.impl;

import com.dohyundev.behavioral.strategy.SortStrategy;

public class MergeSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] array) {
        int[] sorted = mergeSort(array, 0, array.length - 1);

    }

    private int[] mergeSort(int[] array, int start, int end) {
        if (start == end) {
            return new int[] { array[start] };
        }

        int mid = (start + end) / 2;
        int[] left = mergeSort(array, start, mid);
        int[] right = mergeSort(array, mid + 1, end);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return merged;
    }

    @Override
    public void printStartMessage() {
        System.out.println("병합정렬 시작");
    }
}
