package com.Suraj.NumberProgram;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void convert(int num) {
		
		String str="";
		while(num>0) {
			int rem=num%2;
			num/=2;
			str=str+rem;
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Decimal Number :");
		int num=sc.nextInt();
		convert(num);
		

	}

}
