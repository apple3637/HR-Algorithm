package com.algorithm.practice;

import java.util.Collections;
import java.util.HashMap;
<<<<<<< HEAD
import java.util.Scanner;
=======
import java.util.Iterator;
import java.util.Set;
>>>>>>> branch 'master' of https://github.com/apple3637/HR-Algorithm.git

public class Solution {

	public static void main(String[] args) {
		
		//System.out.println(solution());
		solution();
	}
	
	
	static public void solution() {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		String keyname = "";
		
		String s1= sc.next();
		String s2 =sc.next();
		
<<<<<<< HEAD
		
=======
>>>>>>> branch 'master' of https://github.com/apple3637/HR-Algorithm.git
		for(int i=0; i<s1.length();i++) {
<<<<<<< HEAD
			for(int j=i+1; j<=s1.length();j++) {
				 map1.put(s1.substring(i,j), (j+1-i));
=======
			String temp = "";
			for(int j=i;j<s1.length();j++) {
				map1.put(temp+s1.substring(i,j+1),(j+1-i));	
				System.out.println(temp+s1.substring(i,j+1));
>>>>>>> branch 'master' of https://github.com/apple3637/HR-Algorithm.git
			}
		}
<<<<<<< HEAD

		for(int i=0; i<s2.length();i++) {
			for(int j=i+1; j<=s2.length();j++) {
				if(map1.containsKey(s2.substring(i, j)) && max<map1.get(s2.substring(i,j))) {
					keyname = s2.substring(i,j);
					max = map1.get(s2.substring(i,j));
=======
		for(int i=0; i<s2.length();i++) {
			String temp = "";
			
			for(int j=i;j<s2.length();j++) {
				String compareStr = temp+s2.substring(i,j+1);
				System.out.println(compareStr);
				if(map1.containsKey(compareStr)) {
					System.out.println(compareStr+","+(map1.get(compareStr)));
					map1.put(compareStr, map1.get(compareStr));
>>>>>>> branch 'master' of https://github.com/apple3637/HR-Algorithm.git
				}
			}
<<<<<<< HEAD
		}
	System.out.println(keyname);
=======
		}	
		
		//value 로 정렬해서 제일큰 value 가진 단어 출력 

		
		return keyname;
>>>>>>> branch 'master' of https://github.com/apple3637/HR-Algorithm.git
	}

}
