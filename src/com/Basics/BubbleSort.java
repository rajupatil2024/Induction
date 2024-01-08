package com.Basics;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {5,7,6,1,3,8,12};
		int n=a.length;
		System.out.println("Before Sorting");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		for(int i=0; i<n; i++) 
		{
			for(int j=1; j<(n-i); j++) 
			{
				if(a[j-1]>a[j]) 
				{
					a[j-1]=a[j]-a[j-1]+(a[j]=a[j-1]);
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
	}

}
