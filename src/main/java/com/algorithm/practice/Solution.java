package com.algorithm.practice;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		//System.out.println(solution());
		solution();
	}
	
	
	static public void solution() {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		int max = 0;
		String keyname = "";
		
		String s1= sc.next();
		String s2 =sc.next();
		
		
		for(int i=0; i<s1.length();i++) {
			for(int j=i+1; j<=s1.length();j++) {
				 map1.put(s1.substring(i,j), (j+1-i));
			}
		}

		for(int i=0; i<s2.length();i++) {
			for(int j=i+1; j<=s2.length();j++) {
				if(map1.containsKey(s2.substring(i, j)) && max<map1.get(s2.substring(i,j))) {
					keyname = s2.substring(i,j);
					max = map1.get(s2.substring(i,j));
				}
			}
		}
	System.out.println(keyname);
	}

}
