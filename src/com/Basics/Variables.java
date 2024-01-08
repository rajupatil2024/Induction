package com.Basics;

public class Variables {

	static int temp=0;
	void print()
	{
		temp++;
		System.out.println("count "+temp);
	}
	public static void main(String[] args) {
		
		Variables v1=new Variables();
		v1.print();
		v1.print();
		v1.print();
		v1.print();

	}

}
