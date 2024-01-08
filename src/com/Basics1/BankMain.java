package com.Basics1;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        Bank[] banks = new Bank[] { new SBI(), new AXIS(), new HDFC(), new KarnatakaBank() };

        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("---------------------------------------");
        System.out.println("Rate of Interest and Total Payable Amount for Different Banks:");
        

        for (Bank bank : banks) {
            double rate = bank.rateOfInterest();
            System.out.println(bank.getClass().getSimpleName() + ": " + rate + "%");
            System.out.println("Total Payable amount in "+bank.getClass().getSimpleName()+": "+(loanAmount+(loanAmount*(rate/100))));
            System.out.println("===============================================");
        }

        scanner.close();
    }
}
