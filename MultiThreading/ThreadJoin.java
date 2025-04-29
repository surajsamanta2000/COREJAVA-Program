package com.Suraj.MultiThreading;

public class ThreadJoin extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Running " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
    	ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();

        t1.start();
        t1.join(); // wait for t1 to finish before starting t2
        t2.start();
    }
}

