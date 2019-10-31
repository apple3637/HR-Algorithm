package com.algorithm.sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		selectionSort(arr);
	}
	
	public static void selectionSort(int[] a) {
		int min = 0;
		int minIdx = 0;
		
		for(int i=0;i<a.length;i++) {
			
			min = a[i];
			minIdx = i;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<min) {
					min = a[j];
					minIdx = j;
				}
			}
			if(a[i]>min) {
				 int temp = a[i];
				 a[i] = a[minIdx];
				 a[minIdx] = temp;
			}
			for(int n:a) {
				System.out.print(n+",");
			}
			System.out.println();
		}
		
		for(int n:a) {
			System.out.print(n+",");
		}
	}

}
