package com.Basics;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row");
		int row=sc.nextInt();
		for(int i=1; i<=row; i++)
		{
			for(int j=row; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)// j<=(i*2)-1
			{
				System.out.print(" *");
			}
			System.out.println("");
		}

	}

}
