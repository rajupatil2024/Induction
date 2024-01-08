package com.Basics1;

import java.util.Arrays;
import java.util.Scanner;

class TeamNameNotFoundException extends Exception {
    public TeamNameNotFoundException(String teamName) {
        super("Team '" + teamName + "' not found in the list of participating teams.");
    }
}

public class WorldCupPredictor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        String[] teams = {"India","Australia","SouthAfrica","England","Pakistan","New zealand","Sri Lanka","Bangladesh","Afghanistan","West Indies"}; // Array to store the 10 participating teams
       
        // Input the predicted winner
        System.out.println("Enter the Predicted Winner Team: ");
        String predictedWinner =sc.next(); // Change this to the predicted winner

        try {
            if (Arrays.asList(teams).contains(predictedWinner)) {
                System.out.println("The predicted winner of the ICC World Cup is: " + predictedWinner);
            } else {
                throw new TeamNameNotFoundException(predictedWinner);
            }
        } catch (TeamNameNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
	}
}
