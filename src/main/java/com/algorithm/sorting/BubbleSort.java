package com.algorithm.sorting;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;  


public class BubbleSort {

	public static int count = 0;
	 // Complete the countSwaps function below.
    static void countSwaps(int[] a) {

    	for(int i=0; i<a.length; i++) 
    	{
    		for(int j=0 ; j<a.length-1;j++) 
    		{
    			if(a[j]>a[j+1]) 
    			{
    				int temp = a[j];
    				a[j] = a[j+1];
    				a[j+1] = temp;
    				count ++;
    			}
    		}
    	}
    	
    	System.out.println("Array is sorted in "+count+" swaps." );
    	System.out.println("First Element: "+a[0]);
    	System.out.println("Last Element: "+a[a.length-1]);

    }

    private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		 int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] a = new int[n];

	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }

	        countSwaps(a);

	        scanner.close();
	}

}
