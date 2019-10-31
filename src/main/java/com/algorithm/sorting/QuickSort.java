package com.algorithm.sorting;

public class QuickSort {

	public static int[] arr = new int[] {88,6,1,345,11,2,3};
	public static void main(String[] args) {
		
		int right = arr.length-1;
		
		System.out.println();
		for(int n : arr) {
			System.out.print(n+",");
		}
		System.out.println();
		
		quickSort(0,right,arr);
		
	}
	public static void quickSort(int start , int end , int[] a) {
	
		if(start>=end) {
			return;
		}
		
		
		int key = start;
		int i = start+1;
		int j = end;
		
		while(i<=j) {
			while(a[i] <= a[key] && i<end) {
				i++;
			}
			while(a[j] >= a[key] && j>start) {
				j --;
			}
			
			int temp = 0;
			if(i>=j) {
			    temp = a[j];
				a[j] = a[key];
				a[key] = temp;
				
			}else {
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
					
			}
			System.out.println();
			for(int n : a) {
				System.out.print(n+",");
			}
			System.out.println();
		}
		
		
		
		quickSort( start, j-1,arr);
		quickSort( j+1, end,arr);
	}

}
