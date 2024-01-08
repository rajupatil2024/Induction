package com.Basics;

public class Employee {

	int empId;
	String empName;
	
	Employee()
	{
		this(215);
		System.out.println("Constructor 1");
	}
	Employee(int empId)
	{
		this(215,"kumar");
		System.out.println("Constructor 2");
		this.empId=empId;
	}
	Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
		System.out.println("Constructor 3");
	}
	
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
	}
	
}
