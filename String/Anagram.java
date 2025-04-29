package com.Suraj.String;

import java.util.Scanner;

public class Anagram {
	
	
	public static boolean IsAnagram(String s1,String s2) {
		
		while(true) {
			if(s1.length()!=s2.length())return false;
			
			if(s1.length()==0 & s2.length()==0)return true;
			
			char ch=s1.charAt(0);
			s1=s1.replace(ch+"","");
			s2=s1.replace(ch+"","");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two String ");
		
		String str1=sc.next();
		String str2=sc.next();
		
		if(IsAnagram(str1, str2)) System.out.println("String Are Anagram");
		else System.out.println("Strings are not Anagram");

	}

}
