package com.Basics;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DemoLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		  System.out.println("Enter the Date as YYYY-MM-DD");
		  String date=s.next();

		  String[] pr=date.split("-");
		  System.out.println(pr[0]+" "+pr[1]+" "+pr[2]);
		  int year=Integer.parseInt(pr[0]);
		  System.out.println(year);
		  int month=Integer.parseInt(pr[1]);
		  System.out.println(month);
		  int day=Integer.parseInt(pr[2]);
		  System.out.println(day);


		  LocalDate ld=LocalDate.parse(date);
		  LocalDate ld2=LocalDate.now();
		  System.out.println("Today's Date: "+ld2);

		  System.out.println("Date of Birth: "+ld);
		  Period p=Period.between(ld2,ld);
		  System.out.println(p); 
		System.out.println("Age :"+p.getYears()); 
		System.out.println("Months :"+p.toTotalMonths());
		  
		  }
	}


