package com.Basics;

import java.util.Scanner;

public class ReverseSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rev=0;
		int sum=0;
		
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("reverse of the numer is "+rev);
		System.out.println("sum of the number is "+sum);

	}

}
