package com.Basics;

public class MethodOverloading {
	
	void operations()
	{
		int a=10,b=30;
		System.out.println("Methos with zero argument "+(a+b));
	}
	void operations(int a,int b)
	{
		System.out.println("Method with two argument "+(a+b));
	}
	void operations(int a)
	{
		int c=20;
		System.out.println("Method with one argument "+(a+c));
	}
	void operations(float a)
	{
		int c=20;
		System.out.println("Method with one argument but datatype is changed "+(a+c));
	}

	public static void main(String[] args) {
		MethodOverloading m1=new MethodOverloading();
		m1.operations();
		m1.operations(12);
		m1.operations(12, 34);
		m1.operations(12.34f);

	}

}
