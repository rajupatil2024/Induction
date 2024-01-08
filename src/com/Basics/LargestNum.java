package com.Basics;

public class LargestNum {

	public static void main(String[] args) {
		int a=15;
		int b=25;
		int c=20;
		
		String result=a>b&&a>c? a+" is Largest":b>c? b+" is Largest":c+" is Largest";
		
		System.out.println(result);

	}

}
