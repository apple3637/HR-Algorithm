package com.algorithm.dfsbfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFSpractice {

	static int num =7;
	static boolean [] visit ;
	static ArrayList<Integer>[] graph ;
	static ArrayList<Integer> bfs;
	
	static BufferedReader br = null;
	static BufferedWriter bw = null;
	static StringTokenizer st;
	

	static int pNum = 0;
	static int lNum = 0;
	static int startNum =0;
	
	static int x,y =0;
	
	static Queue<Integer> Q;
	
	/*
	 
	 �Է� ����
     4 5 1
	 1 2
	 1 3
	 1 4
	 2 4
	 3 4
	 
	 ��� �� 
	 1 2 3 4 
	 
	 * */
	
	public static void main(String[] args) throws IOException {
		
		// �Է� ���� ����
		br = new BufferedReader(new InputStreamReader(System.in));
		
		// ��Ʈ�� ��ũ�������� ���� �Է� (���ڸ� Ư�� ������ �������� �и��� ��ü) nextToken���� �ϳ��� ������ ��.
		st = new StringTokenizer(br.readLine());
		graph = new ArrayList[8];
		
		/*
		 
		4(��������) 5(��������) 1(������)
		1 2
		1 3
		1 4
		2 4
		3 4
		
		*/
		
		
		pNum = Integer.parseInt(st.nextToken());
		lNum = Integer.parseInt(st.nextToken());
		startNum = Integer.parseInt(st.nextToken());
		
		//�迭�� �˾ƺ��� ���� 1 ���� ���� 
		for(int i=1; i<=lNum ; i++) {
			//�׷��� �迭�� ArrayList ����
			graph[i] = new ArrayList<Integer>();
		}
		
		//�׷��� ���
		for(int i=0; i<lNum;i++) {
			//�׷��� ������ �о���� ���ؼ� ���پ� �ҷ����̱�
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			//�ش� ������ ����� ������ add �Լ��� ����ؼ� �־��ش�.
			//���⼺�� ���� ������ �־��� ������ ���������� �ٲ㼭 �־���� �Ѵ�.
			graph[x].add(y);
			graph[y].add(x);
		}
		
		//������ ArrayList �� sort���ش�
		for(int i=1;i<=lNum;i++) {
			Collections.sort(graph[i]);
		}
		
		//Ž�� ����~
		bfs(startNum);
		
		for(int i=0;i<bfs.size();i++) {
			System.out.println(bfs.get(i)+" ");
		}
		
	}
	
	public static void bfs(int start) {
		
		//ť�� linked list �� ����
		Q = new LinkedList<Integer>();
		
		//�������� ���� ť�� �־���
		Q.add(start);
		bfs = new ArrayList<Integer>();
		
		visit = new boolean[8];
		
		//�������� ť�� �־����ϱ� �湮�� ������ ǥ��
		visit[start] = true;
		
		//ť�� �������� ����
		while(!Q.isEmpty()) {
			//ť�� �ִ°� ������ bfs ��̷� ����
			int q = Q.poll();
			bfs.add(q);
			
			//ť�� ����� ArrayList �� Ž���ϸ鼭 �湮���� ���� ��带 Q����Ʈ�� �־��ְ� �湮ó��
			for(int i:graph[q]) {
				if(!visit[i]) {
					Q.add(i);
					visit[i]= true;
				}
			}
		}
	}

}
