package com.Suraj.String;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str="MY NAME IS SURAJ";
		
		String[] arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			
			String x=arr[i];
			
			StringBuffer sb=new StringBuffer(x);
			sb.reverse();
			
			System.out.print(sb+" ");
		}

	}

}
