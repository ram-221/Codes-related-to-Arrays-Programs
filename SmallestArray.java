package com.array;

public class SmallestArray {

	 public static void main(String args[])
	  {
	     int arr[] = {14, 54, 13, 69, 84, 10, 20, 4};
	     int min = arr[0];
	     for(int i=0; i<arr.length; i++) {
	    	 if(min > arr[i])
	         {
	            min = arr[i];
	         }
	     }
	     System.out.print(min); 
	  }
}
