package com.algorithm.sorting;

public class MergeSort {
	static int[] a = new int[] {3,4,8,6,7,5,2,1};
	static int[] result = new int[a.length];
	static int count = 0;
	public static void main(String[] args) {
		
		
		int left = 0;
		int right = a.length-1;
		
		 mergeSort(left, right, a);
		
	}
	
	public static void merge(int m, int middle, int n, int[] arr) {
		System.out.println("merge");
		int i = m;
		int j = middle+1;
		int k = m;
		
		while(i <=middle && j<=n) {
			if(arr[i]<arr[j]) {
				result[k] = arr[i];			
				i++;
			}else {
				result[k]= arr[j];
				j++;
			}
			k++;
		}
		
		if(i>middle) {
			for(int t=j;t<=n;t++) {
				result[k] = arr[t];
				k++;
			}
		}else{
			for(int t=i;t<=middle;t++) {
				result[k] = arr[t];
				k++;
			}
		}
		
		
		for(int t=0;t<=n;t++) {
			arr[t]  = result[t];
		}
		
		/*
		 * for(int w : arr) { System.out.print(w+","); } System.out.println();
		 */
		
	}
	
	public static void mergeSort(int l, int r, int[] arr) {
		System.out.println("[l:"+l+",r:"+r+"]");
		int mid = 0;
		
		
		
		if(l < r) {
			count ++;
			System.out.println("count:"+count);
			mid = (l+r)/2;
			//System.out.println("mid:"+mid);
			mergeSort(l, mid, arr);
			mergeSort(mid+1,r,arr);
			merge(l, mid, r,arr);
			count--;
			System.out.println("end count:"+count);
		}
	}

}
