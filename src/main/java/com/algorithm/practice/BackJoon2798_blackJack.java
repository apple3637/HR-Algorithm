package com.algorithm.practice;



import java.io.IOException;
import java.util.Scanner;


public class BackJoon2798_blackJack {
	
	private static int[] cards;
	private static int n;
	private static int m;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		cards = new int[n];
		
		for(int i=0; i<n; i++) {
			cards[i] = scan.nextInt();
		}
		System.out.println(solution(0,0,0));
	} 

	private static int solution(int sum, int idx, int cnt) {
		if(cnt == 3) {
			return sum>m?0:sum;
			
		}
		if(idx >=n) {
			return 0;
		}
		int max =0;
		for(int i=idx;i<n;i++) {
			max = Math.max(max,  solution(sum+cards[i], i+1,cnt+1));
		}
		return max;
		
	}
}
