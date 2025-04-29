package com.Suraj.String;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean IsPalindrome(String str) {
		
		char[] ch=str.toCharArray();
		int i=0,j=str.length()-1;
		
		while(i<j) {
			if(ch[i]!=ch[j])return false;
			i++;
			j--;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String ");
		
		String str=sc.next();
		
		if(IsPalindrome(str))System.out.println(str+" Is a Palindrome.");
		else System.out.println("Not a Palindrome");

	}

}
