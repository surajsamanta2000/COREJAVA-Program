package com.Suraj.ArrayPrograms;


//input=[1,0,1,1,0,0,1] 
//output=[0,0,0,1,1,1,1]
import java.util.Arrays;

public class ArraySegregation {

	public static void main(String[] args) {
		
		int arr []= {1,0,1,1,0,0,1};
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
