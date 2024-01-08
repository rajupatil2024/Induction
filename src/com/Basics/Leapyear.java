package com.Basics;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		int y=sc.nextInt();
		if(y%100==0)
		{
			if(y%400==0)
			{
				System.out.println("It is Leap Year");
			}
			else
			{
				System.out.println("It is not Leap Year");
			}
		}
		else if(y%4==0)
		{
			System.out.println("It is Leap Year");
		}
		else
		{
			System.out.println("it is not Leap Year");
		}
	}
}
