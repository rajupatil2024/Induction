package com.Basics;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class DemoLocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the intime as HH:MM:SS");
		  String inTime=sc.next();

		LocalTime lt=LocalTime.parse(inTime);
		LocalTime lt2=LocalTime.now();

		Duration d=Duration.between(lt,lt2);
		System.out.println(d);

		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
	}

}
