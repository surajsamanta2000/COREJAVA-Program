package com.Suraj.MultiThreading;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread running");
    }
}

public class Test2 {
	
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}

