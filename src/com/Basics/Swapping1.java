package com.Basics;

public class Swapping1 {

	public static void main(String[] args) {
		int a = 20;
        int b = 30;
  
        System.out.println("Before swapping a = " + a
                           + " and b = " + b);
  
        a = a + b;//50
        b = a - b;//20
        a = a - b;//30
  
        System.out.println("After swapping a = " + a
                           + " and b = " + b);

	}

}
