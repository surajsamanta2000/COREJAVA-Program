package com.Suraj.ArrayPrograms;

import java.util.Arrays;

public class SingleDimension {
	
	int arr[];
	
	public SingleDimension(int size) {
		
		arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=Integer.MIN_VALUE;
		}		
	}
	
	public void insert(int loc,int value) {
		
		try {
			
			if(arr[loc]==Integer.MIN_VALUE) {
				arr[loc]=value;
				System.out.println("Sucessfully Inserted..");
			}else {
				System.out.println("This cell is alredy Occupied.");
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access Array.");
		}
	}

	@Override
	public String toString() {
		return "SingleDimension [arr=" + Arrays.toString(arr) + "]";
	}
	
	

}
