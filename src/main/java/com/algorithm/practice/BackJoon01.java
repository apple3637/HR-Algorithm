package com.algorithm.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon01 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=testcase ; i++) {
			String line = bf.readLine();
			StringTokenizer st = new StringTokenizer(line,"");
			
			while(st.hasMoreTokens()) {
				sb.append("출력할내용");	
			}	
		}
		System.out.println(sb);
	}
	

}
