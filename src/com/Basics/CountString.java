package com.Basics;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		String s=sc.next();
		int vowels=0;
		int consonants=0;
		int specialCharacters=0;
		char str[] = s.toCharArray();
		int n= str.length;
		for(int i=0; i<n; i++)
		{
   	 		if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||str[i]=='o' || str[i]=='u' || str[i]=='A' ||str[i]=='E' || str[i]=='I' || str[i]=='O' ||str[i]=='U')
    		{
       	 		vowels++;
    		}
    		else if((str[i]>='a'&& str[i]<='z') || (str[i]>='A'&& str[i]<='Z'))
    		{
        		consonants++;
    		}
    		else
    		{	
                specialCharacters++;
    		}
		}
		System.out.println("Vowels = "+vowels);
		System.out.println("Consonants = "+consonants);
		System.out.println("Special characters = "+specialCharacters);

	}

}
