package com.Basics;

public class Palindrome {

	public static void main(String[] args) {
		int n=232;
		int temp=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("the given number is Palindrome");
		}
		else {
			System.out.println("The given number is not a Palindrome");
		}

	}

}
