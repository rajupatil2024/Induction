package com.Basics;

public class MethodEx {
	void print()
	{
		System.out.println("Void Type");
	}
	static int a=20,b=30;
	
	void add()//refvar.methodname
	{
		int result=a+b;
		System.out.println("Addition of 2 numbers "+result);
	}
	int sub(int n1,int n2)//inside sopln when return with refvar.methodname
	{
		int res=n1-n2;
		return res;
	}
	static char disp()
	{
		return 'A';
	}
	static void mul()//classname.methodname
	{
		System.out.println("Multiplication of 2 numbers "+(a*b));
	}

	public static void main(String[] args) {
		MethodEx m1=new MethodEx();//Object Creation
		m1.add();
		System.out.println("Subtraction of 2 numbers "+m1.sub(35,10));
		MethodEx.mul();
		MethodEx.disp();
		

	}

}
