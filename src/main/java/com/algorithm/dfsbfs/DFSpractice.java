package com.algorithm.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DFSpractice {

	
	static boolean[] visit;
	static int[][] arr;
	//static ArrayList<Integer> dfs;
	static int pNum=0;
	static int lNum = 0;
	static int startNum=0;
	
	static BufferedReader bf; 
	static StringTokenizer st;
	
	static int x,y;
	/*
	 
	 예제 입력
	 4 5 1
	 1 2
	 1 3
	 1 4
	 2 4
	 3 4
	 
	 예제 출력 
	 
	 1 2 4 3
	 
	 */
	public static void main(String[] args) throws IOException {
		
		//입력 버퍼 스트림 생성
		bf = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(bf.readLine());
		
		
		pNum =Integer.parseInt(st.nextToken());
		lNum = Integer.parseInt(st.nextToken());
		startNum = Integer.parseInt(st.nextToken());
		
		// visit 배열과 그래프 배열 초기화! for문이 1부터 돌거기 때문에 길이는 +1해주어야함
		visit = new boolean[pNum+1];
		arr = new int[pNum+1][pNum+1];
		
		for(int i=1;i<=arr.length;i++) {
			st = new StringTokenizer(bf.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			//해당 2차원 배열의 값을 1로 체크 
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		dfs(startNum);
	}
	
	public static void dfs(int node) {
		
		//노드를 방문 처리
		visit[node] = true;
		//최초 방문 처리 한 것 부터 차례대로 나옴.
		System.out.print(node+" ");
		
		
		for(int i=1;i<=pNum;i++) {
			// 해당 노드에 연결된 값들을 검색하면서 노드가 존재하면서 방문하지 않은 것이 있는지 체크
			if(arr[node][i] == 1 && visit[i] == false) {
				//방문하지 않는 노드깂을 기준으로 다시 검색 -재귀
				dfs(i);
			}
		}
		
	}

}
