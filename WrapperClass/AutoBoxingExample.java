package com.Suraj.WrapperClass;

public class AutoBoxingExample {
    public static void main(String[] args) {
        // Autoboxing
        Integer num = 100;  // int automatically converted to Integer
        System.out.println("Autoboxed Integer: " + num);

        // Unboxing
        int value = num;    // Integer automatically converted to int
        System.out.println("Unboxed int: " + value);
    }
}
