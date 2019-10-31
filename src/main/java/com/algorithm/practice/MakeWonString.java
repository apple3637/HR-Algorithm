package com.algorithm.practice;

import java.util.Scanner;

public class MakeWonString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		String  num = Integer.toString(sc.nextInt());
		char [] arr = new char[num.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = num.charAt(i);
		}

		String result = "";
		int lastIdx = arr.length-1; 
				
		
		// # method 1 
		for(int i=0; i<arr.length;i++) {
			if(arr.length>3 && (lastIdx-i) != 0) {
				if((i+1)%3 == 0) {
					result = "," + arr[lastIdx-i]+ result;
				}
				else {
					result = arr[lastIdx-i]+result;
				}
			}else {
				result = arr[lastIdx-i]+result;
			}	
		}
		System.out.println("method 1 : \\"+result);
		
		result = "";
		// # method 2
		for(int i=arr.length-1 ; i>=0; i--) {
			if(arr.length>3) {
				if(i%3 == 0 && i!=0) {
					result = ","+arr[i] + result;
				}
				else {
					result = arr[i]+result;
				}
			}else {
				result = arr[i]+result;
			}
		}
		System.out.println("method 2 : \\"+result);
	}

}
