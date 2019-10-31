package com.algorithm.sorting;

import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] =temp;
				}
			}
		}
	}

}
