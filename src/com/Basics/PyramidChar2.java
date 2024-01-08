package com.Basics;

import java.util.Scanner;

public class PyramidChar2 {

	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the no of lines");
    	int n=sc.nextInt();
    	int a=1;
    	for(int i=1;i<=n;i++)
    	{
	       	for(int j=1;j<=i;j++)
        	{	
            	System.out.print((char)(a+64));//a=1+64=65,//a=2+64=66
            	a++;//1//2//3
        	}
        	System.out.println("");
    	}
	}
}
//A
//BC
//DEF
//GHIJ
//KLMNO
