package com.Basics;

public class Looping {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++)
		{
			System.out.println("Outer "+i);
			for(int j=1; j<=3; j++)
			{
				System.out.println("Inner "+j);
			}
			
		}

	}

}
