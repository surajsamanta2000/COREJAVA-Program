package com.Suraj.NumberProgram;

import java.util.Scanner;

public class SumOfEvenOddPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int num=sc.nextInt();
		
		int SumE=0,SumO=0;
		int n=num,i=1;
		
		while(n>0) {
			if(i%2!=0)SumE+=n%10;
			else SumO+=n%10;
			i++;
			n/=10;
		}
		
		System.out.println("Sum of Even position Digits :"+SumE);
		System.out.println("Sum of Odd Position Digits :"+SumO);
		
	}

}