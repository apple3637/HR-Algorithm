package com.algorithm.sorting;

import java.util.Scanner;

/*
 * 0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.
���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ���� ���� ū ���� 6210�Դϴ�.
0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * */

public class FindMaxNum {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int size = sc.nextInt();
		String[] arr = new String[size];
		int[] figuredArr = new int[size];
		
		//int maxnum =0;
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.next();
		}
		
		
		for(int i=0; i<arr.length;i++) {
			int convertingInt =Integer.parseInt(arr[i]);
			int tempNum = 0;
			
			if(convertingInt<11) {
				tempNum = convertingInt * 100 ;
				figuredArr[i] = tempNum;
			}else if(convertingInt < 111) {
				tempNum = convertingInt * 10;
				figuredArr[i] = tempNum;
			}else {
				figuredArr[i] = tempNum;
			}
			
			for(int j= 0; j<arr.length;j++) {
			//	if(maxnum < figuredArr[j]) {
				//	maxnum = figuredArr[j];
				}				
			}
		}
		

	}

