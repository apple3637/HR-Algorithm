package com.algorithm.practice;

import java.util.Scanner;

public class Fibonacci {

	
	static int[] arr = new int[45];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
			
		int result = 0;
		
		result = finonacci(num);
		System.out.println(result);
	}
	
	static public int finonacci(int n) {
		//System.out.println(arr[n]);
		if(n == 1) return 1;
		if(n == 2) return 1;
		if(arr[n] != 0) return arr[n];
		
		return arr[n] =  finonacci(n-1) + finonacci(n-2);
		
	}

}
