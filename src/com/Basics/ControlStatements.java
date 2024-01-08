package com.Basics;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		int age=23;
		
		if(age>21)
		{
			System.out.println("Eligible for marriage");
		}
		else
		{
			System.out.println("not Eligible for marriage");
		}
		System.out.println("Rest of the code");
		
		System.out.println("print the number is even or odd");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}

	}

}
