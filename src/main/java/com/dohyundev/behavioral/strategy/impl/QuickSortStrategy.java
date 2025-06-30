package com.dohyundev.behavioral.strategy.impl;

import com.dohyundev.behavioral.strategy.SortStrategy;

import java.util.Random;

public class QuickSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] array) {
        partition(array, 0, array.length - 1);
    }

    private void partition(int[] array, int low, int high) {
        if (low >= high) return;

        int pivot = array[low + new Random().nextInt(high - low + 1)];

        int start = low;
        int end = high;

        while (start <= end) {
            while (array[start] < pivot) start++;
            while (array[end] > pivot) end--;
            if (start <= end) {
                swap(array, start, end);
                start++;
                end--;
            }
        }

        partition(array, low, end);
        partition(array, start, high);
    }

    @Override
    public void printStartMessage() {
        System.out.println("퀵 정렬 시작");
    }
}
