package com.Suraj.NumberProgram;

import java.util.Scanner;

public class PrimeNo {
	
	private static boolean isPrime(int n) {
		if(n<=1) return false;
		else {
			for(int i=2;i<=n/i;i++) {
				if(n%i==0)return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Number :");
		int num=sc.nextInt();
		
		if(isPrime(num)==true) {
			System.out.println(num+" Is a Prime Number .");
		}
		else System.out.println(num+" Is  not a Prime Number .");

	}

}
