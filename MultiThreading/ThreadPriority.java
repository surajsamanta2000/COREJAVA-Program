package com.Suraj.MultiThreading;

public class  ThreadPriority extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
    	ThreadPriority t1 = new ThreadPriority();
    	ThreadPriority t2 = new ThreadPriority();

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
    }
}
