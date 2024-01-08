package com.Basics;

public class DemoPoly {
	public void add(int a,int b) {
		System.out.println("The added value is: "+(a+b));
	}
	public int add(int a,int b,int c) {
		return (a+b+c);
	}
	
	public static void main(String[] args) {
		DemoPoly d=new DemoPoly();
		d.add(20, 30);
		System.out.println("The added value is: "+d.add(20, 30, 40));
		
	}
}
