package com.sunbeam;

import java.util.Arrays;

public class Insertionsort {
	
	public static void insertionSort(int arr[],int N) {
		int passes=0;
		for(int i=1;i<N;i++) {
			passes++;
			int  temp=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>temp) {
				
				arr[j+1]=arr[j]; 
				
				j--;
			}
			arr[j+1]=temp;
			System.out.println("No of Passes are ="+passes);
		}
		
	}
	

	public static void main(String[] args) {
		
		int arr[]= {55, 44, 22, 66, 11, 33};
		
		System.out.println("Before Sorting Array="+Arrays.toString(arr));
		
		insertionSort(arr,arr.length);
		
		System.out.println("After Sorting Array="+Arrays.toString(arr));

	}

}
