package com.Basics;

public class ReverseString1 {

	public static void main(String[] args) {
		String s="JAVA PROGRAMMING";
		String sarr[]=s.split(" ");
		String rev="";
			
		for(int i=0; i<sarr.length; i++)
		{
			for(int j=sarr[i].length()-1; j>=0; j--)
			{
				rev+=sarr[i].charAt(j);
			}
			System.out.print(rev+" ");
			rev="";
			
		}

	}

}
