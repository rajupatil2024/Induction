package com.Basics;

public class Operators {

	public static void main(String[] args) {
		
		int a=20;
		int c=10;
		int b=5;
		int d=(a++)+(++b)+(c--);
		int e=(++c)+(++a)-(b++)+(d++);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("Relation Operator");
		
		int n1=30,n2=40;
		System.out.println(n1==n2);
		System.out.println(n1<n2);
		System.out.println(n1>n2);
		System.out.println(n1<=n2);
		System.out.println(n1>=n2);
		System.out.println(n1!=n2);
		
		System.out.println("Logical operator");
		
		System.out.println("Bitwise Operator");
		
		System.out.println(6&4);
		System.out.println(6|4);
		int num2=4;
		System.out.println(~num2);
		
		//Shift Operator
		//left shift(<<),right shift(>>)
		
		int num4=5;
		System.out.println("Left Shift "+(num4<<2));
		int num5=6;
		System.out.println("right Shift "+(num5>>2));
		
		

	}

}
