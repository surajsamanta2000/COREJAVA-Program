package com.Suraj.ArrayPrograms;


public class FindNeighbour {

	public static void main(String[] args) {
int a[] = {10, 20, 15, 2, 23, 90, 67};
/*Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15
both of them are less than 20
similarly 90 has neighbors 23 and 67.*/
		
		findelement(a);

	}

	public static void findelement(int a[])
	{
		for(int i = 1 ;i<a.length;i++)
		{
			if(a[i]>= a[i-1] && a[i]>=a[i+1])
			{
				System.out.println(a[i]);
			}
		}
	}
}
