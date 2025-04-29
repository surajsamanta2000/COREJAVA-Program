package com.Suraj.Exception;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("This will always be executed");
        }
    }
}
