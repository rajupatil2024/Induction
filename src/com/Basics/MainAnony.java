package com.Basics;


public class MainAnony {
		 public static void main(String[] as){
		   ODI o1=new ODI();
		   o1.noOfOvers();
		   o1.getPlayers();

		   //Anonymous Inner Class
		  Match t20=new Match(){
		    public void noOfOvers(){
		   System.out.println(" 20 Overs ");
		 }
		  };
		  t20.noOfOvers();
		  t20.getPlayers();
		}
}
