package com.example.designpattern.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEveryDayDemo {

    public static void main(String[] args) {
        Integer[] arrayOfInts = new Integer[]{1,2,3,4};
        List<Integer> listOfIntegers = Arrays.asList(arrayOfInts);
        System.out.println(arrayOfInts);
        System.out.println(listOfIntegers);

    }
}
