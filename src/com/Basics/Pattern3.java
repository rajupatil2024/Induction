package com.Basics;

public class Pattern3 {

	public static void main(String[] args) {
		int n=5;
        for(int i=1;i<=n;i++)//rows
        {
            for(int j=1;j<=n;j++)//col
            {
                if(j<=n-i)
                {
                System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
	}
}
//	  *
//   **
//  ***
// ****
//*****