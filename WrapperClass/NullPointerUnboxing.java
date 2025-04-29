package com.Suraj.WrapperClass;

public class NullPointerUnboxing {
    public static void main(String[] args) {
        Integer num = null;

        // Throws NullPointerException because of unboxing
        int value = num;  // null -> primitive int (not allowed)
        System.out.println("Value: " + value);
    }
}