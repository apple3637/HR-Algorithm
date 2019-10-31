package com.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Backjoon9012_VPS {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		while(n-->0) {
			Stack<Character> stack = new Stack<Character>();
			String str = bf.readLine();
			boolean isVPS = true;
			
			for(int i=0; i<str.length();i++) {
				// ( 이면 넣고 )이면 pop 해서 확인!
				if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
					stack.push(str.charAt(i));
					System.out.println(stack.peek());
				}else if(str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
					if(stack.isEmpty()) {
						isVPS = false;
						break;
					}else {
						System.out.println(stack.peek());
						stack.pop();
						
					}
				}
			}
			
			//비어있지 않으면 false
			if(!stack.isEmpty()) isVPS = false;
			
			if(isVPS == false) System.out.println("NO");
			if(isVPS == true) System.out.println("YES");
		}
		
	}
	
}
