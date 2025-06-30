package com.dohyundev.behavioral.strategy;

import com.dohyundev.behavioral.strategy.impl.*;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class StrategyPatternClient {
    public static void main(String[] args) {
        int[] target = generateRandomArray(10000000, 100000);

        SortContextTimeRecordProxy bubbleSortContextTimeRecordProxy = new SortContextTimeRecordProxy(new SortContext(new BubbleSortStrategy()));
        SortContextTimeRecordProxy selectionSortContextTimeRecordProxy = new SortContextTimeRecordProxy(new SortContext(new SelectionSortStrategy()));
        SortContextTimeRecordProxy insertionSortContextTimeRecordProxy = new SortContextTimeRecordProxy(new SortContext(new InsertionSortStrategy()));
        SortContextTimeRecordProxy quickSortContextTimeRecordProxy = new SortContextTimeRecordProxy(new SortContext(new QuickSortStrategy()));
        SortContextTimeRecordProxy mergeSortContextTimeRecordProxy = new SortContextTimeRecordProxy(new SortContext(new MergeSortStrategy()));

//        bubbleSortContextTimeRecordProxy.sort(target);
//        selectionSortContextTimeRecordProxy.sort(target);
//        insertionSortContextTimeRecordProxy.sort(target);
        quickSortContextTimeRecordProxy.sort(target);
        mergeSortContextTimeRecordProxy.sort(target);
    }

    public static int[] generateRandomArray(int length, int bound) {
        Random random = new Random();
        return IntStream.range(0, length)
                .map(i -> random.nextInt(bound))
                .toArray();
    }

    public static class SortContextTimeRecordProxy extends SortContext {
        private final SortContext sortContext;

        public SortContextTimeRecordProxy(SortContext sortContext) {
            this.sortContext = sortContext;
        }

        @Override
        public int[] sort(int[] array) {
            long startTime = System.nanoTime();
            int[] result = sortContext.sort(array);
            long endTime = System.nanoTime();
//            System.out.println("원배열 : " + Arrays.toString(Arrays.stream(sortContext.sort(array)).toArray()));
//            System.out.println("정렬결과 : " + Arrays.toString(Arrays.stream(sortContext.sort(result)).toArray()));
            System.out.println("수행시간 : " + (endTime - startTime) / 1000);
            return result;
        }
    }
}
