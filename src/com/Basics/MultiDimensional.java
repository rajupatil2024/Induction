package com.Basics;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{12,13,14},{15,16,17},{18,19,20}};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
