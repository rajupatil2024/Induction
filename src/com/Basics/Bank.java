package com.Basics;

public class Bank {

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
		Bank.withdrawal(1000);
		Bank.deposit(500);
		System.out.println("Your account balance is"+balance);

	}

}
