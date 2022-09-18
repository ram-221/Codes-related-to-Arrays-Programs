package com.array;

public class SecondSmallest {

	 static int secSmallest(int arr[], int n)
	   {
	     
	      int smallest = arr[0];

	      for (int i=0; i < n; i++){
	         if(arr[i] < smallest)
	            smallest = arr[i];
	      }
  
	     int sec_smallest = Integer.MAX_VALUE;

	     // finding second smallest here
	     for (int i=0; i < n; i++){
	         if(arr[i] != smallest && arr[i] < sec_smallest)
	           sec_smallest = arr[i];
	     }

	    return sec_smallest;

	  }
	  public static void main(String args[])
	  {

	      int arr[] = {22, 13, 10, 18, 34, 19};
	      int n = arr.length;
	      System.out.print(secSmallest(arr, n)); 
	   }
}
