package com.Suraj.ArrayPrograms;
import java.util.Arrays;

public class MinMaxWithStreams {
    public static void main(String[] args) {
        int[] numbers = {11, 2, 3, 44, 5};

       int min=Arrays.stream(numbers).min().orElseThrow(()->new IllegalArgumentException("Array is Empty"));
       
       int max=Arrays.stream(numbers).max().orElseThrow(()->new IllegalArgumentException("Array is Empty"));
       
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}

