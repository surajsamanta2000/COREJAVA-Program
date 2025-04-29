package com.Suraj.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {

	public static void main(String[] args) {
		
		String str="java is easy java easy java is easy java is easy";
		int count=0;
	   Pattern p=Pattern.compile("java");
	   Matcher m=p.matcher(str);
	   
	   while(m.find()) {
		   System.out.println(m.start());
		   System.out.println(m.end());
		   System.out.println(m.group());
		   System.out.println("--------------");
		   
		   count++;
	   }
	   
	   System.out.println("No.of Occurance "+count);

	}

}