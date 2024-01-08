package com.Basics;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		The string tokenizer class allows an application to break a string into tokens
		StringTokenizer st=new StringTokenizer("Hello World Java Programming");
		System.out.println(st.hasMoreTokens());
		System.out.println("------------------");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
