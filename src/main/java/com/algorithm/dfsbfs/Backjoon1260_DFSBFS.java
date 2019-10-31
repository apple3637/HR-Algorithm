package com.algorithm.dfsbfs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 
 �޸� ���̱� ���ؼ� �� �� : �ʿ���� ���� ����. 
 static �� �������� �ʿ��� ������ �Ҵ�.
 boolean üũ �迭�� �ϳ��� ������ ��ü�� ���� �����ؼ� ���.
 ��ĳ�� close������.
 
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
		
		//dfs �迭 �ʱ�ȭ
		dfsGraph = new int[nodeNum+1][nodeNum+1];
		graph    = new ArrayList[nodeNum+1];
		
		//bfs �迭 ����
		for(int i=1;i<=nodeNum;i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		// �׷��� �ʱ�ȭ
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
		
		//�迭 ����
		for(int n = 1; n<graph.length;n++) {
			Collections.sort(graph[n]);			
		}
		
		//�湮 �迭 �ʱ�ȭ
		visit = new boolean[nodeNum+1];
		//���
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
