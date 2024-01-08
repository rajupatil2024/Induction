package com.Basics1;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Team name: ");
		Innings in=new Innings();
		in.setTeamName(sc.next());
		System.out.println("innings: ");
		in.setInningsName(sc.next());
		System.out.println("Runs: ");
		in.setRuns(sc.nextInt());
		in.displayInningsDetails();

	}

}
