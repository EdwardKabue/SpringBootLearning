package com.example.demo.basic;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Primary marks a bean as the bean to be used by spring boot when your application is run.
@Service
//@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers){
        //logic for quick sort

        return numbers;
    }
}
