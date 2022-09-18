package com.array;

public class SumOfElementAnArray {

	public static void main(String args[])
	   {

	       int arr[] = {6, 3, 2, 4, 7};

	       int sum = 0;

	       for(int i=0; i<arr.length; i++)
	       {
	         sum = sum + arr[i];
	       }

	       System.out.print(sum); 
	   }
}
