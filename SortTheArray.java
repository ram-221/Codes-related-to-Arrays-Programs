package com.array;

public class SortTheArray {

	 public static void main(String[] args) { 

	       int [] arr = new int [] {9, 5, 1, 7, 3}; 
	       int temp = 0; 

	       for (int i = 0; i < arr.length; i++) { 
	           for (int j = i+1; j < arr.length; j++) { if(arr[i] > arr[j]) { 
	                 temp = arr[i]; 
	                 arr[i] = arr[j]; 
	                 arr[j] = temp; 
	              } 
	           } 
	       } 

	    //Displaying elements of array after sorting 
	    for (int i = 0; i < arr.length; i++) { 
	     System.out.print(arr[i] + " "); 
	   } 
	  } 
}
