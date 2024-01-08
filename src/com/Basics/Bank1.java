package com.Basics;

import java.util.Scanner;

public class Bank1 {

	static int balance=5000;
	
	static void withdrawal(int a)
	{
		balance-=a;
	}
	static void deposit(int b)
	{
		balance+=b;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the withdrawal amount");
		int a=sc.nextInt();
		System.out.println("Enter the Deposit amount");
		int b=sc.nextInt();
		
		withdrawal(a);
		deposit(b);
		System.out.println("Your account balance is"+balance);

	}
}
