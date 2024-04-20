package com.example.demo.basic;

import org.springframework.stereotype.Component;

//@Primary marks a bean as the bean to be used by spring boot when your application is run.
@Component
//@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers){
        //logic for quick sort

        return numbers;
    }
}
