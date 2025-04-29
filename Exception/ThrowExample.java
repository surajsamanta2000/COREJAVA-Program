package com.Suraj.Exception;

public class ThrowExample {
	
	public static void checkAge(int age) {
		
		if(age<18) throw new ArithmeticException("Not Eligible For Voting");
		
		else System.out.println("Eligible For Voting");
	}
	
	public static void main(String[] args) {
		checkAge(21);
	}

}
