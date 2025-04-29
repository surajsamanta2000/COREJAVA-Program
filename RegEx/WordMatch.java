package com.Suraj.RegEx;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordMatch {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("ab");
		Matcher m=p.matcher("abbbabbbababbab");
		int count=0;
		
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

