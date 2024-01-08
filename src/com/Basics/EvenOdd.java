package com.Basics;

public class EvenOdd {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int n=20;
		for(int i=1; i<=n; i++)
		{
			if(i%2==0) {
				a++;
			}
			else
			{
				b++;
			}
		}
		System.out.println("Number of even "+a);
		System.out.println("Number of odd "+b);
		

	}

}
