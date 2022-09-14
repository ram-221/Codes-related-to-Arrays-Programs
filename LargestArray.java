package com.array;

public class LargestArray {

	public static void main(String args[])
	{
		int arr[] = {25, 102, 99, 63, 34, 101, 525};
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.print(max); 
	}
}
