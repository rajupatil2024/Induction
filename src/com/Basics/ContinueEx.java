package com.Basics;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Day");
		String name=sc.next();
		switch(name)
		{
		case "Monday": System.out.println("Hara Hara Mahadev");
		break;
		case "Tuesday": System.out.println("om Gan Ganapathey Namah");
		break;
		case "Wednesday": System.out.println("Krishna Janmastami");
		break;
		case "Thursday": System.out.println("Sai ram");
		break;
		case "Friday": System.out.println("Govinda Govinda");
		break;
		case "Saturday": System.out.println("Jai Bhajarangabali");
		break;
		case "Sunday": System.out.println("Sleepy Day");
		break;
		default:System.out.println("Good Bye...");
		}

//		for(int i=1; i<=10; i++)
//		{
//			if(i==1||i==4)
//			{
//				continue;
//			}
//			System.out.println(i);
//		}
	}

}
