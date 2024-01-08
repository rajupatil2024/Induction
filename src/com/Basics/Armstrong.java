package com.Basics;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int m=sc.nextInt();
		System.out.println("Enter the last number");
		int n=sc.nextInt();
		
		for(int i=m; i<=n; i++)
		{
			int num=i;
			int num1=num;
			int count=0;
			
			while(num>0)
			{
				count++;
				num/=10;
			}
			int sum=0;
			
			while(num1>0)
			{
				int rem=num1%10;
				int prod=1;
				
				for(int j=1; j<=count; j++)
				{
					prod=prod*rem;
				}
				sum=sum+prod;
				num1/=10;
			}
			if(sum==i)
			{
				System.out.println("Armstrong number "+i);
			}
		}
		

	}

}
