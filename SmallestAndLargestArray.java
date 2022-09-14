package com.array;

public class SmallestAndLargestArray {

	 public static void main(String args[])
	   {
	       int arr[] = {63, 45, 12, 01, 89, 75, 30};

	       int largest = arr[0], smallest=arr[0];

	       for(int i=0; i<arr.length; i++) { 
	    	   if(smallest > arr[i])
	              smallest = arr[i];
	           if(largest < arr[i])
	              largest = arr[i];
	       }

	       System.out.println(smallest);
	       System.out.println(largest);
	   }
}
