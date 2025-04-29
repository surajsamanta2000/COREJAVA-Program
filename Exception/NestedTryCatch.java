package com.Suraj.Exception;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int b = 30 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception caught");
            }

            try {
                int[] a = new int[5];
                a[10] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBounds Exception caught");
            }

        } catch (Exception e) {
            System.out.println("Parent Exception caught");
        }
    }
}

