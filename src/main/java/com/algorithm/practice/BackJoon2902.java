
/*
 * 입력은 한 줄로 이루어져 있고, 최대 100글자의 영어 알파벳 대문자, 소문자, 그리고 하이픈 ('-', 아스키코드 45)로만 이루어져 있다. 첫 번째 글자는 항상 대문자이다. 그리고, 하이픈 뒤에는 반드시 대문자이다. 그 외의 모든 문자는 모두 소문자이다.

출력
첫 줄에 짧은 형태 이름을 출력한다.

예제 입력 1 
Knuth-Morris-Pratt
예제 출력 1 
KMP
 * */
package com.algorithm.practice;
import java.io.IOException;
import java.util.Scanner;

public class BackJoon2902 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		String[] arr = input.split("-");
		String result = "";
		
		
		for(int i=0; i<arr.length;i++) {
			char[] temparr = arr[i].toCharArray();
			result += temparr[0];
		}
		
		System.out.println(result);
		
	}

}
