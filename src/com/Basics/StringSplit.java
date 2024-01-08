package com.Basics;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JAVA PROGRAMMING LANGUAGE";
		String sarr[]=s.split("G");
		
		for(int i=0; i<sarr.length; i++)
		{
			System.out.println(sarr[i]+" index is "+i);
		}

	}

}
