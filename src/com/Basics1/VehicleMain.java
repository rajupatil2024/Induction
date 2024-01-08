package com.Basics1;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Make: ");
		String make=sc.next();
		System.out.println("Vehicle number: ");
		String vehicleNumber=sc.next();
		System.out.println("Fuel Type: ");
		String fuelType=sc.next();
		System.out.println("Fuel Capacity: ");
		int fuelCapacity=sc.nextInt();
		System.out.println("Vehicle CC: ");
		int cc=sc.nextInt();
		System.out.println("==============================");
		System.out.println("");
		
		Vehicle v = new Vehicle(make, vehicleNumber, fuelType, fuelCapacity, cc);

		v.displayBasicInfo();
		
		

	}

}
