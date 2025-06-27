package com.dohyundev.behavioral.strategy;

import com.dohyundev.behavioral.strategy.impl.BubbleSortStrategy;
import com.dohyundev.behavioral.strategy.impl.InsertionSortStrategy;
import com.dohyundev.behavioral.strategy.impl.SelectionSortStrategy;

import java.util.Arrays;

public class StrategyPatternClient {
    public static void main(String[] args) {
        int[] target = {3, 2, 1, 1, 2, 3, 4};

        SortService bubleSortService = new SortService(new BubbleSortStrategy());
        SortService selectionSortService = new SortService(new SelectionSortStrategy());
        SortService insertionSortService = new SortService(new InsertionSortStrategy());

        System.out.println(Arrays.toString(Arrays.stream(bubleSortService.sort(target)).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(selectionSortService.sort(target)).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(insertionSortService.sort(target)).toArray()));
    }
}
