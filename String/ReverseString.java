package com.Suraj.String;

public class ReverseString {

	public static void main(String[] args) {
		String str="java";
		
		//approach 1
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
		
		System.out.println("");
		//approach 2
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		// approach 3
		
		StringBuilder sbb =new StringBuilder(str);
		System.out.println(sbb.reverse());

	}

}
