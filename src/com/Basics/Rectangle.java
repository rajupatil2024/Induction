package com.Basics;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		double l=sc.nextDouble();
		System.out.println("enter the width");
		double w=sc.nextDouble();
		
		double area=l*w;
		double perimeter=2*(l+w);
		
		System.out.println("Area of Rectangle "+area);
		System.out.println("Perimeter of Rectangle "+perimeter);

	}

}
