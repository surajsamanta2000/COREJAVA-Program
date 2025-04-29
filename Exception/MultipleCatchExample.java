package com.Suraj.Exception;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught");
        } catch (Exception e) {
            System.out.println("General Exception caught");
        }
    }
}

