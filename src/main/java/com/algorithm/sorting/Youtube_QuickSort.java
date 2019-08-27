package com.algorithm.sorting;

public class Youtube_QuickSort {

	public static int []data = new int[]{1,10,5,8,7,6,4,3,2,9};
	public static void main(String[] args) {
	    int num = 10;
	    
	}
	
	void quickSort(int []dataArr, int start, int end) {
		
		if(start >=end) {//원소가 1개
			return;
		}
		
		int key = start; 
		int i = start +1;
		int j = end;
		
		int temp;
		
		while(i <= j) {
			while(dataArr[i] <= dataArr[key]) {
				i++;
			}
		}
		
	}
	
	

}
