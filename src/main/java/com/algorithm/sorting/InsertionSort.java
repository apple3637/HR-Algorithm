package com.algorithm.sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		
		for(int i=0; i<arrSize;i++) {
			arr[i] = sc.nextInt();
		}
		
		InsertionSort(arr);
	}
	
	public static void InsertionSort(int[] a) {
		
		for(int i = 1 ; i<a.length;i++) {
			int key = a[i];
			int j = i-1;
			
			while(j>=0 && key<a[j]) {
				
				a[j+1] =a[j];
				j --;
			}
			a[j+1] = key;
		}
		
		for(int n : a) {
			System.out.print(n+",");
		}
	}

}
