package com.Basics;

public class Fibonacci {

	public static void main(String[] args) {
		int first=0,second=1,temp=0;
		int n=20;
		for(int i=1; i<=n; i++)
		{
			System.out.println(first);
			temp=first+second;//0//1//1
			first=second;//f=1//f=1//f=2
			second=temp;//s=1//2//3
		}

	}

}
