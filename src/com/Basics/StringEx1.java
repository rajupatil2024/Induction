package com.Basics;

public class StringEx1 {

	public static void main(String[] args) {
		
		String str1="Hello";
		str1=str1.concat("World");
		System.out.println(str1);
		String str2=new String("Hello");
		str2=str2.concat("World");
		str2.intern();
		System.out.println(str1.equals(str2));
//		System.out.println(str1==str2);
		System.out.println("-------------------");
		StringBuffer b1=new StringBuffer("Java");
		b1.append("Programming");
		System.out.println(b1);
		StringBuilder b2=new StringBuilder("Java");
		b2.append("C++");
		System.out.println(b2);
		 System.out.println("-------------------------"); 	
		System.out.println("str1 length"+str1.length());
		for(int i=0; i<str1.length(); i++)
		{
			System.out.print(str1.charAt(i));
		}

	}

}
