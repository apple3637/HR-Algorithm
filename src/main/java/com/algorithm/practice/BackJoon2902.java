
/*
 * �Է��� �� �ٷ� �̷���� �ְ�, �ִ� 100������ ���� ���ĺ� �빮��, �ҹ���, �׸��� ������ ('-', �ƽ�Ű�ڵ� 45)�θ� �̷���� �ִ�. ù ��° ���ڴ� �׻� �빮���̴�. �׸���, ������ �ڿ��� �ݵ�� �빮���̴�. �� ���� ��� ���ڴ� ��� �ҹ����̴�.

���
ù �ٿ� ª�� ���� �̸��� ����Ѵ�.

���� �Է� 1 
Knuth-Morris-Pratt
���� ��� 1 
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
