package com.Suraj.NumberProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number :");
		int num=sc.nextInt();
		
		int n=num,sum=0;
		
		while(n>0) {
			sum=(sum*10)+(n%10);
			n/=10;
		}
		
		if(sum==num)System.out.println(num+" Is a Palindrome Number.");
		else System.out.println("It is not a Palindrome Number.");
		
		

	}

}
