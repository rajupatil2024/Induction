package com.Basics;

import java.util.Scanner;

public class RunRateCalculator {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

    try {
        System.out.println("Enter the total runs scored: ");
        int runs = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the total overs faced: ");
        int overs = Integer.parseInt(sc.nextLine());

        if (overs == 0) {
            throw new ArithmeticException();
        }

        double runRate = (double) runs / overs;
        System.out.println("Current Run Rate: "+ runRate);
        } 
    catch (Exception ex) {
        System.out.println(ex.getClass().getName());
    }
}
}
