package com.Basics;

public class Reversenum {

	public static void main(String[] args) {
		int rem=0;
		int rev=0;
		int n=254;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}

}
