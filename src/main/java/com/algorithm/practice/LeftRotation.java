package com.algorithm.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeftRotation {

	 static int[] rotLeft(int[] a, int d) 
	 {
		 int temp = 0;
		 
		 
		 for(int j=0; j<d; j++) {
			 temp = a[0];
			 for(int i=0; i<a.length-1;i++)
			 {
				 a[i] = a[i+1];
			 }
			 a[a.length-1] = temp;
			 /*
			 System.out.println("");
				for(int ar : a) 
				{
					System.out.print(ar+",");
				}
				System.out.println("");*/
		 }
         
         return a;
	 }

	 private static final Scanner scanner = new Scanner(System.in);

	 public static void main(String[] args) throws IOException 
	 {
	      
	        String[] nd = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nd[0]);

	        int d = Integer.parseInt(nd[1]);

	        int[] a = new int[n];

	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }

	        int[] result = rotLeft(a, d);

	        scanner.close();
	 }
}
