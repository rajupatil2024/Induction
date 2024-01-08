package com.Basics;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the arithmetic operation to calculate");
		String st=sc.next();
		switch(st)
		{
			case "sum":System.out.println(a+b);
			break;
			case "sub":System.out.println(a-b);
			break;
			case "multi":System.out.println(a*b);
			break;
			case "div":System.out.println(a/b);
			break;
			default:System.out.println("Incorrect Operation");
		}
	}
}
