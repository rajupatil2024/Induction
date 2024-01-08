package com.Basics;

public class ArrayExample {

	public static void main(String[] args) {
		int number[]=new int [5];
		number[0]=23;
		number[1]=19;
		number[2]=27;
		number[3]=45;
		number[4]=13;
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);
		System.out.println("length "+number.length);
		
		for(int i=1; i<number.length; i++)
		{
			System.out.println(number[i]);
		}
		int values[]= {1,3,5,7,9,11,13};
		System.out.println("length of array 2 "+values.length);
		for(int i=0; i<values.length; i++)
		{
			System.out.println(values[i]);
		}
		//reverse an array element
		System.out.println("After reversing the array");
		for(int i=values.length-1; i>=0; i--)
		{
			System.out.println(values[i]);
		}
		
		
		

	}

}
