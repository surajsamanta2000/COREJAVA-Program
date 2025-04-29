package com.Suraj.MultiThreading;


class Mythread extends Thread{
	
	public void run() {
		System.out.println("Task Added...");
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Mythread m= new Mythread();
		m.start();

	}

}
