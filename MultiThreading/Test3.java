package com.Suraj.MultiThreading;

class MyTask implements Runnable {
    private String name;
    MyTask(String name) {
        this.name = name;
    }

    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(name + " - " + i);
        }
    }
}

public class Test3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask("Task1"));
        Thread t2 = new Thread(new MyTask("Task2"));
        t1.start();
        t2.start();
    }
}

