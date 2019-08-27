package com.algorithm.sorting;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class MarkandToys {

	// Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

        int budget = k;
    	int maxCount = 0;
    	int sum =0;
    	
    	prices = sort(prices,budget);
    	
    	for(int i=0; i<prices.length;i++) 
    	{
    		if(sum+prices[i]<budget) {
    			sum += prices[i];
    			maxCount = i+1;
    		}else {
    			break;
    		}    		
    	}
    	//System.out.println(maxCount);
    	return maxCount;

    }
    
    private static int[] sort(int[] arr, int total) 
    {
    	int temp = 0;
    	int tempSum = 0;
    	
    	for(int i=0;i<arr.length;i++) {
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[i]>arr[j]) {
    				temp = arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    		tempSum += arr[i];
    		if(tempSum > total) {
    			break;
    		}
    	}
    	
    	//for(int a: arr) {
    	//	System.out.print(a+",");
    	//}
    	//System.out.println();
    	return arr;
    }
    private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
	}
	

}
