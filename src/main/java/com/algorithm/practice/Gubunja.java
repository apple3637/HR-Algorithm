package com.algorithm.practice;

public class Gubunja {

	public static void main(String[] args) {
		String str1 = "사과,바나나,배,딸기";
		String[] arr = str1.split(",");
		
		for(String a : arr) {
			System.out.println(a);
		}
	}

}
