package com.Suraj.NumberProgram;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Number :");
		int num=sc.nextInt();
		
		int sum=0;
      
		while(num>9) {
			while(num>0) {
				int d=num%10;
				sum+=d*d;
				num/=10;
			}
			num=sum;
			sum=0;
		}
		if(num==1) {
			System.out.println("It is a Happy Number");
		}
		else {
			System.out.println("It is not Happy Number");
		}
	}

}
