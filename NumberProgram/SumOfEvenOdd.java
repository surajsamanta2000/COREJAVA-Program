package com.Suraj.NumberProgram;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=sc.nextInt();
		
		int SumEven=0,SumOdd=0;
		int n=num;
		
		while(n>0) {
			int rem =n%10;
			if(rem%2==0)SumEven+=rem;
			else SumOdd+=rem;
			
			n/=10;
			
		}
		
		System.out.println("Sum of EvenNumber ="+SumEven);
		System.out.println("Sum of OddNumber = "+SumOdd);
	}

}
