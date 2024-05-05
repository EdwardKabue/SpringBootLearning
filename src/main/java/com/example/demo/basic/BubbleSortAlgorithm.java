package com.example.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component marks a class a bean for Spring boot
//@Qualifier marks a bean as a dependency based on the requirements of a situation.
@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers){
        //logic for bubble sort

        return numbers;
    }
}
