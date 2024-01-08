package com.Basics;


public class CountCharString {

	public static void main(String[] args) 
	{
		String s="Java";
		int count=0;
		char[] ch=s.toCharArray();
		int length=ch.length;
		
		for(int i=0; i<length; i++)
		{
			for(int j=0; j<length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			System.out.println(ch[i]+" count is "+count);
			count=0;
		}

	}

}
