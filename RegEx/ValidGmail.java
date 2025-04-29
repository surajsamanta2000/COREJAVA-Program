package com.Suraj.RegEx;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidGmail {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A email Id :");
		String s=sc.next();
		Pattern p=Pattern.compile("[a-zA-Z0-9_.-]+@gmail.com");
		Matcher m=p.matcher(s);
		
		if(m.find()&&m.group().equals(s)) {
			System.out.println(" It is a Valid Gamil id");
		}
		else 
			System.out.println(" It is not a valid Gmail id");

	}

}
