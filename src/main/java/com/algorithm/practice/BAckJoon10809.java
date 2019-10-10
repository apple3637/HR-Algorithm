
/*
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

출력
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

예제 입력 1 
baekjoon
예제 출력 1 
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 * */
package com.algorithm.practice;
import java.io.IOException;
import java.util.Scanner;

public class BAckJoon10809 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] array_str = str.toCharArray();
		int[] result     = new int[26];
		
		int ascii = 0;
		int index = 0;
		
		for(int i = 0; i<result.length;i++) {
			//초기화
			result[i] = -1;
		}
		
		//주어진 문자열에 해당하는 위치의 값을 바꿔준다 
		while (index < str.length()) {
			// 위치 체크
			ascii = (int) array_str[index];

			// 이미 존재할 경우 건너뛰기
			if (result[ascii - 97] == -1) {
				result[ascii - 97] = index;

			} 
			index++;
		}
		
		for(int a : result) {
			System.out.print(a+" ");
		}

	}

}
