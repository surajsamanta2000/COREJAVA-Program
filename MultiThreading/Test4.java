package com.Suraj.MultiThreading;

public class Test4 extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(4000); // 4 second
                System.out.println("Sleep thread - " + i);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        new Test4().start();
    }
}

