package com.algorithm.practice;

import java.util.HashMap;
import java.util.Iterator;

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
		
		int max = 0;
		String keyname = "";
		
		String s1= "penpineapple";
		String s2 ="applepen";
		
		arr1 = s1.toCharArray();
		arr2 = s2.toCharArray();
		String st1="";
		String st2 ="";
		
		for(int i=0; i<s1.length();i++) {
			for(int j=0; j<i;j++) {
				 st1 = st1+arr1[j];
				 st2 = st2+arr2[j];
			}
			//map1.put(st1, !map1.get(st1).equals(null)?map1.get(st1)+1:0);
			//map1.put(st2, !map1.get(st2).equals(null)?map2.get(st2)+1:0);
			
			map1.put(st1, 1);
			map1.put(st2, 1);
			
			System.out.println(st1+","+map1.get(st1));
			
			st1="";
			st2="";
		}
		
		for( String key : map1.keySet() )
		{ 
			if(map1.get(key) == map2.get(key)) {
				result.put(key, result.get(key)+1);
				if(max<result.get(key)) {
					keyname = key;
					max=result.get(key);
				}
			}
		}
		
		return keyname;
	}

}
