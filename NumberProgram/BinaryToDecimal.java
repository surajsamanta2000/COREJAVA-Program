package com.Suraj.NumberProgram;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		int binaryNumber=1011;
		
		int sum=0,j=0,n=binaryNumber;
		
		while(n>0) {
			int rem=n%10;
			n/=10;
			sum+=rem*(int)Math.pow(2,j++);
		}
		
		System.out.println(binaryNumber+" to Decimal -->"+sum);

	}

}
