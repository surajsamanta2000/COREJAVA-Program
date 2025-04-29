package com.Suraj.WrapperClass;

import java.util.ArrayList;

public class WrapperWithList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing
        numbers.add(10); // int -> Integer
        numbers.add(20);
        numbers.add(30);

        // Unboxing
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;  // Integer -> int
        }

        System.out.println("Sum: " + sum);
    }
}
