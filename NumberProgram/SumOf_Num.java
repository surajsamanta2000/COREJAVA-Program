package com.Suraj.NumberProgram;

public class SumOf_Num {

	public static void main(String[] args) {
		int num =235;
		int sum=0,n=num;
		
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		
		System.out.println("Sum of a Number is :"+sum);

	}

}