package com.Suraj.NumberProgram;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		
		int sqrt=num*num;
		
		int len=(""+num).length();
		
		int result=(int)(sqrt%Math.pow(10, len));
		
		if(num==result)System.out.println(num+" Is a Automorphic Number.");
		else System.out.println("Not a Automorphic Number");

	}

}
