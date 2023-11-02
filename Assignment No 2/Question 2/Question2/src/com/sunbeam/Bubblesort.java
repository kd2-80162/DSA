package com.sunbeam;

import java.util.Arrays;

public class Bubblesort {

	public static void bubbleSort(int arr[],int N) {
		int count =0;
		int passes=0;
		int flag;
		for(int i=1;i<N;i++)
		{    passes++;
		     flag=0;
			for(int j=0;j<N-i;j++)
			{
			count++;
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
		}
		System.out.println("No of Comparision="+count);
		System.out.println("No of Passes="+passes);
	}
	
	
	public static void main(String[] args) {
		int arr[]= {33,22,66,55,44,11};
		
		System.out.println("Array Before sort"+Arrays.toString(arr));
		
		bubbleSort(arr,arr.length);
		
		System.out.println("Array after Sort"+Arrays.toString(arr));
		
				
		

	}

}
