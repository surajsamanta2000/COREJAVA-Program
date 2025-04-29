package com.Suraj.WrapperClass;


public class WrapperExample {
    public static void main(String[] args) {
        int primitive = 10;

        // Manual boxing
        Integer boxed = Integer.valueOf(primitive);
        System.out.println("Boxed Integer: " + boxed);

        // Manual unboxing
        int unboxed = boxed.intValue();
        System.out.println("Unboxed int: " + unboxed);
    }
}

