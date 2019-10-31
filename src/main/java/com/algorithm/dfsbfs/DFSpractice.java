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
	 
	 ���� �Է�
	 4 5 1
	 1 2
	 1 3
	 1 4
	 2 4
	 3 4
	 
	 ���� ��� 
	 
	 1 2 4 3
	 
	 */
	public static void main(String[] args) throws IOException {
		
		//�Է� ���� ��Ʈ�� ����
		bf = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(bf.readLine());
		
		
		pNum =Integer.parseInt(st.nextToken());
		lNum = Integer.parseInt(st.nextToken());
		startNum = Integer.parseInt(st.nextToken());
		
		// visit �迭�� �׷��� �迭 �ʱ�ȭ! for���� 1���� ���ű� ������ ���̴� +1���־����
		visit = new boolean[pNum+1];
		arr = new int[pNum+1][pNum+1];
		
		for(int i=1;i<=arr.length;i++) {
			st = new StringTokenizer(bf.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			//�ش� 2���� �迭�� ���� 1�� üũ 
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		dfs(startNum);
	}
	
	public static void dfs(int node) {
		
		//��带 �湮 ó��
		visit[node] = true;
		//���� �湮 ó�� �� �� ���� ���ʴ�� ����.
		System.out.print(node+" ");
		
		
		for(int i=1;i<=pNum;i++) {
			// �ش� ��忡 ����� ������ �˻��ϸ鼭 ��尡 �����ϸ鼭 �湮���� ���� ���� �ִ��� üũ
			if(arr[node][i] == 1 && visit[i] == false) {
				//�湮���� �ʴ� ��僄�� �������� �ٽ� �˻� -���
				dfs(i);
			}
		}
		
	}

}
