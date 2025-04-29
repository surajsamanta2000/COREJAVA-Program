package com.Suraj.String;

import java.util.HashMap;
import java.util.Map;

public class Anagramm {
	
	public static boolean CheckAnagram(String str1,String str2) {
		
		if(str1.length()!=str2.length())
			return false;
		
		Map<Character,Integer> map1 =new HashMap<>();
		
		Map<Character,Integer> map2 =new HashMap<>();
		
		for(char ch : str1.toCharArray()) {
		   map1.put(ch,map1.getOrDefault(ch,0)+1);
		}
		
		for(char ch : str2.toCharArray()) {
			   map2.put(ch,map2.getOrDefault(ch,0)+1);
			}
		
		return map1.equals(map2);
			
	}

	public static void main(String[] args) {
		
		System.out.println(CheckAnagram("silent","listen"));

	}

}
