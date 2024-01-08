package com.Basics;

import java.util.Scanner;

public class SwapTwoBitwise {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the first number :");  
		int a = sc.nextInt();  
		System.out.print("Enter the second number :");  
		int b = sc.nextInt();
		
		System.out.println("Before swapping:");  
		System.out.println("a = " +a +", b = " +b);
		
		//Bitwise XOR Operator
		a = a ^ b;  
		b = a ^ b;  
		a = a ^ b;
		
		System.out.println("After swapping:");  
		System.out.print("a = " +a +", b = " +b);  
	}  
		

}


