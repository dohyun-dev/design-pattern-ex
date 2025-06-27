package com.dohyundev.behavioral.strategy;

import com.dohyundev.behavioral.strategy.impl.BubbleSortStrategy;
import com.dohyundev.behavioral.strategy.impl.InsertionSortStrategy;
import com.dohyundev.behavioral.strategy.impl.SelectionSortStrategy;

import java.util.Arrays;

public class StrategyPatternClient {
    public static void main(String[] args) {
        int[] target = {3, 2, 1, 1, 2, 3, 4};

        SortContext sortContext = new SortContext(new BubbleSortStrategy());
        System.out.println(Arrays.toString(Arrays.stream(sortContext.sort(target)).toArray()));

        sortContext.setSortStrategy(new SelectionSortStrategy());
        System.out.println(Arrays.toString(Arrays.stream(sortContext.sort(target)).toArray()));

        sortContext.setSortStrategy(new InsertionSortStrategy());
        System.out.println(Arrays.toString(Arrays.stream(sortContext.sort(target)).toArray()));
    }
}
