package com.Basics1;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Press D to Development Employee Details");
		System.out.println("Press T to Testing Employee Details");
		char ch=sc.next().charAt(0);
		if (ch=='d'||ch=='D') {
			System.out.println("Details of Development Employee");
			System.out.println("Enter the Employee Name: ");
			String ename=sc.next();
			System.out.println("Enter the Employee Salary: ");
			double salary=sc.nextDouble();
			System.out.println("Enter Employee Id: ");
			int eid=sc.nextInt();
			Development d1=new Development(ename,salary,eid);
			d1.display();
		}
		else if(ch=='t'||ch=='T') {
			System.out.println("Details of Testing Employee");
			System.out.println("Enter the Employee Name: ");
			String ename=sc.next();
			System.out.println("Enter the Employee Salary: ");
			double salary=sc.nextDouble();
			System.out.println("Enter Employee Id: ");
			int eid=sc.nextInt();
			Testing t1=new Testing(ename,salary,eid);
			t1.display();
		}
    }

}
