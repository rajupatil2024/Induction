package com.Basics1;

public class Vehicle {

	private String make;
	private String vehicleNumber;
	private String fuelType;
	private int fuelCapacity;
	private int cc;
	
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) 
	{
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public void displayBasicInfo() {
		System.out.println("Make: " + make);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("CC: " + cc);
	}
	
	
	
	
}
