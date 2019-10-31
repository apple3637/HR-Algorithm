package com.algorithm.dfsbfs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 
 메모리 줄이기 위해서 한 일 : 필요없는 변수 제거. 
 static 은 전역으로 필요한 변수만 할당.
 boolean 체크 배열은 하나의 변수에 객체를 새로 생성해서 사용.
 스캐너 close시켜줌.
 
 */

public class Backjoon1260_DFSBFS {
	
	//common
	static int nodeNum;
	
	//dfs
	static boolean [] visit;
	static int[][] dfsGraph;
	
	//bfs
	static ArrayList<Integer> [] graph;
	static Queue<Integer> Q;
	
	public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		nodeNum = sc.nextInt();
		int lineNum = sc.nextInt();
		int startNum = sc.nextInt();
		
		//dfs 배열 초기화
		dfsGraph = new int[nodeNum+1][nodeNum+1];
		graph    = new ArrayList[nodeNum+1];
		
		//bfs 배열 생성
		for(int i=1;i<=nodeNum;i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		// 그래프 초기화
		for(int i=1;i<=lineNum;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			//dfs
			dfsGraph[x][y] = 1;
			dfsGraph[y][x] = 1;
			
			//bfs
			graph[x].add(y);
			graph[y].add(x);
		}
		
		//배열 정렬
		for(int n = 1; n<graph.length;n++) {
			Collections.sort(graph[n]);			
		}
		
		//방문 배열 초기화
		visit = new boolean[nodeNum+1];
		//출력
		getDfs(startNum);
		System.out.println();
		
		visit = new boolean[nodeNum+1];
		getBfs(startNum);
		
		sc.close();
	}
	
	public static void getDfs(int node) {
		visit[node] = true;
		System.out.print(node + " ");
		
		for(int i=1;i<=nodeNum;i++) {
			if(dfsGraph[node][i] == 1 && visit[i] == false) {
				getDfs(i);
			}
		}
	}
	
	public static void getBfs(int node) {
		visit[node]=true;
		Q = new LinkedList<Integer>();
		Q.offer(node);
		
		int temp;
		while(!Q.isEmpty()) {
			temp = Q.poll();
			System.out.print(temp +" ");
			
			for(int n:graph[temp]) {
				if(visit[n] == false) {
					Q.offer(n);
					visit[n] = true;
				}
			}
		}
		
		
	}
	
	
}
