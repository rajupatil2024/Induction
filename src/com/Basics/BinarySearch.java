package com.Basics;

import java.util.Scanner;

public class BinarySearch {
	
	private static int binarySearch(int numArray[], int number_to_search) {
        int low = 0;
        int high = numArray.length - 1;
        
        while (low <= high){
            int index = (low + high) / 2;
            int indexNumber = numArray[index];
            
            if (number_to_search == indexNumber){
                return index;
            }
            if (number_to_search < indexNumber){
                high = index - 1;
            }
            if (number_to_search > indexNumber){
                low = index + 1;
            }
        }
        
        return -1;
  }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to choose index");
		int a=sc.nextInt();

		int[] arrayofnums = {2,3,6,8,9,13,20};
        
        System.out.println(binarySearch(arrayofnums, a));
		

	}

}
