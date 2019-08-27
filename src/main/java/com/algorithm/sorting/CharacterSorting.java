package com.algorithm.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class CharacterSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arr = new String[num];
		HashSet<String> set = new HashSet<String>();
		
		for(int i = 0; i<num; i++) {
			//arr[i] = sc.next();
			set.add(sc.next());
		}
		
		ArrayList<String> list = new ArrayList<String>(set);
		
		Collections.sort(list, new Comparator<String>() {
			public int compare(String v1, String v2) {
				if(v1.length()>v2.length())
					return 1;
				if(v1.length()<v2.length())
					return -1;
				else 
					return v1.compareTo(v2);
			}
		});
		
		for(String s: list) {
			System.out.println(s);
		}
		sc.close();
	}

}
