package com.Suraj.String;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String str="  java  is easy ";
		
		String str1=str.replaceAll("\\s","");
		
		System.out.println(str1);

	}

}
