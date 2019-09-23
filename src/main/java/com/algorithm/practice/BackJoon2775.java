

/*
 첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다. (1 <= k <= 14, 1 <= n <= 14)

출력
각각의 Test case에 대해서 해당 집에 거주민 수를 출력하라.

예제 입력 1 
2
1
3
2
3
예제 출력 1 
6
10
 * */
package com.algorithm.practice;

import java.io.IOException;
import java.util.Scanner;

public class BackJoon2775 {

	int result = 0;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int loop = sc.nextInt();		
		int[][] arr = new int[15][15];
		
		for(int i=0; i<15;i++) {
			arr[i][0] =1;
			arr[0][i] = 1+i;
		}
		
		while(loop>0) {
			//long beforeTime = System.currentTimeMillis();
			for(int i=1; i<15;i++) {
				for(int j=1; j<15;j++) {
					arr[i][j] = arr[i][j-1]+arr[i-1][j];
					//System.out.print(arr[i][j]+",");
				}
			}
			
			int floor = sc.nextInt();
			int room = sc.nextInt();
			
			System.out.println(arr[floor][room-1]);
			//long afterTime = System.currentTimeMillis();
			//System.out.println((afterTime-beforeTime)/1000);
			loop--;
		}
	}

}
