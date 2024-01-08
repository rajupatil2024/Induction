package com.Basics;

public class MinMaxArray {

	public static void main(String[] args) {
		 
		int[] num = { 11, 9, 3, 4, 36, 22, 21 };
		// initialize minimum and maximum element with the first element
        int max = num[0];
        int min = num[0];
 
        // do for each array element
        for(int i=1; i<num.length; i++)
        {
            // if the current element is greater than the maximum
            if (num[i] > max) {
                max = num[i];
            }
            // if the current element is smaller than the minimum
            else if (num[i] < min) {
                min = num[i];
            }
        }
 
        System.out.println("The minimum array element is " + min);
        System.out.println("The maximum array element is " + max);
    }
}
