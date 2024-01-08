package com.Basics;

public class AddSubArray {

	public static void main(String[] args) {
		/*initialize two matrices*/   
		int m1[][]={{1,2,3},{4,5,6},{7,8,9}};    
		int m2[][]={{7,3,9},{2,8,6},{6,4,2}};    

		/*creating third matrix to store 
		the sum of m1 and m2 matrices */   
		int m3[][]=new int[3][3];  

		/*add and print addition of m1 and m2 matrices */
		System.out.println("Addition of two Array");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				m3[i][j]=m1[i][j]+m2[i][j];
				System.out.print(m3[i][j]+" "); 	
			}    
			System.out.println();  
		}
		System.out.println("Subtraction of two Array");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				m3[i][j]=m1[i][j]-m2[i][j];
				System.out.print(m3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
