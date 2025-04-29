package com.Suraj.RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A  Mobile Number :");
		String s=sc.next();
		
		Pattern p=Pattern.compile("[6-9][0-9]{9}");//("[6-9]//d{9}")
		
		Matcher m=p.matcher(s);
		
		if(m.find()&&m.group().equals(s)) {
			System.out.println(s+" Is a Valid Phone Number");
		}
		else
			System.out.println(s+" It is Not A Valid Phone Number");

	}

}
