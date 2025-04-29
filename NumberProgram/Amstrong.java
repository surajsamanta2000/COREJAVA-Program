package com.Suraj.NumberProgram;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		
		int n=num;
		int sum=0;
		
		int len=(""+num).length();
		
		while(n>0) {
			int rem=n%10;
			
			sum=sum+(int)Math.pow(rem, len);
			n/=10;
		}
		
		if(num==sum)System.out.println(num+" Is a Amstrong Number .");
		else System.out.println(num+" Not a Amstrong Number.");

	}

}
