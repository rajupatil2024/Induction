package com.Basics;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
        for(int i=n;i>=1;i--)//rows
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
//*****
// ****
//  ***
//   **
//    *
