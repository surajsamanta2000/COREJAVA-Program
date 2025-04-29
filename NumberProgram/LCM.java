package com.Suraj.NumberProgram;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two Number :");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int count=1;
		
		while(true) {
			
			if(count%num1==0 & count%num2==0)break;
			count++;
		}
		
		System.out.println("LCM of Two Numbers :"+count);

	}

}
