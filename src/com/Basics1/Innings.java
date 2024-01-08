package com.Basics1;

public class Innings {
	    private String teamName;
	    private String inningsName;
	    private int runs;

	    public String getTeamName() {
			return teamName;
		}
		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}
		public String getInningsName() {
			return inningsName;
		}
		public void setInningsName(String inningsName) {
			this.inningsName = inningsName;
		}
		public int getRuns() {
			return runs;
		}
		public void setRuns(int runs) {
			this.runs = runs;
		}
		public void displayInningsDetails() {
	    	if(inningsName.equals("first")){
	    		System.out.println("Team: " + teamName);
		        System.out.println("Innings Name: " + inningsName);
		        System.out.println("Runs: " + runs);
		        System.out.println((runs+1)+" needs to win");
	    	}
	    	else if(inningsName.equals("second")) {
	    		System.out.println("Team: " + teamName);
		        System.out.println("Innings Name: " + inningsName);
		        System.out.println("Runs: " + runs);
		        System.out.println("Match ended");
	    	}
	    	else {
	    		System.out.println("Invalid");
	    	}
	    }
}
