package com.Basics;

public class SearchingArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {34,56,78,99,65,36};
		int key=25;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==key)
			{
				System.out.println("Element: "+a[i] +"found at index: "+i);
			}
		}

	}

}
