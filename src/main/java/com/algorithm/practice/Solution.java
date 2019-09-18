package com.algorithm.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		
		System.out.println(solution());

	}
	
	
	static public String solution() {
		
		char[] arr1 = new char[100];
		char[] arr2 = new char[100];
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		HashMap<String,Integer> map2 = new HashMap<String,Integer>();
		HashMap<String,Integer> result = new HashMap<String,Integer>();
		
		String keyname = "";
		
		String s1= "penpineapple";
		String s2 ="applepen";
		
		for(int i=0; i<s1.length();i++) {
			String temp = "";
			for(int j=i;j<s1.length();j++) {
				map1.put(temp+s1.substring(i,j+1),(j+1-i));	
				System.out.println(temp+s1.substring(i,j+1));
			}
		}
		for(int i=0; i<s2.length();i++) {
			String temp = "";
			
			for(int j=i;j<s2.length();j++) {
				String compareStr = temp+s2.substring(i,j+1);
				System.out.println(compareStr);
				if(map1.containsKey(compareStr)) {
					System.out.println(compareStr+","+(map1.get(compareStr)));
					map1.put(compareStr, map1.get(compareStr));
				}
			}
		}	
		
		//value 로 정렬해서 제일큰 value 가진 단어 출력 

		
		return keyname;
	}

}
