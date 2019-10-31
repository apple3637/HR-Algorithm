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
	 
	 입력 예제
     4 5 1
	 1 2
	 1 3
	 1 4
	 2 4
	 3 4
	 
	 출력 예 
	 1 2 3 4 
	 
	 * */
	
	public static void main(String[] args) throws IOException {
		
		// 입력 버퍼 생성
		br = new BufferedReader(new InputStreamReader(System.in));
		
		// 스트링 토크나이저로 한줄 입력 (문자를 특정 구분자 기준으로 분리한 객체) nextToken으로 하나씩 꺼내서 씀.
		st = new StringTokenizer(br.readLine());
		graph = new ArrayList[8];
		
		/*
		 
		4(정점갯수) 5(간선갯수) 1(시작점)
		1 2
		1 3
		1 4
		2 4
		3 4
		
		*/
		
		
		pNum = Integer.parseInt(st.nextToken());
		lNum = Integer.parseInt(st.nextToken());
		startNum = Integer.parseInt(st.nextToken());
		
		//배열은 알아보기 쉽게 1 부터 돈다 
		for(int i=1; i<=lNum ; i++) {
			//그래프 배열에 ArrayList 생성
			graph[i] = new ArrayList<Integer>();
		}
		
		//그래프 담기
		for(int i=0; i<lNum;i++) {
			//그래프 연결자 읽어오기 위해서 한줄씩 불러들이기
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			//해당 정점에 연결된 정점을 add 함수를 사용해서 넣어준다.
			//방향성이 없기 때문에 넣어준 정점의 관점에서도 바꿔서 넣어줘야 한다.
			graph[x].add(y);
			graph[y].add(x);
		}
		
		//각각의 ArrayList 를 sort해준다
		for(int i=1;i<=lNum;i++) {
			Collections.sort(graph[i]);
		}
		
		//탐색 시작~
		bfs(startNum);
		
		for(int i=0;i<bfs.size();i++) {
			System.out.println(bfs.get(i)+" ");
		}
		
	}
	
	public static void bfs(int start) {
		
		//큐는 linked list 로 구현
		Q = new LinkedList<Integer>();
		
		//시작점을 먼저 큐에 넣어줌
		Q.add(start);
		bfs = new ArrayList<Integer>();
		
		visit = new boolean[8];
		
		//시작점을 큐에 넣었으니까 방문한 것으로 표시
		visit[start] = true;
		
		//큐가 빌때까지 진행
		while(!Q.isEmpty()) {
			//큐에 있는걸 꺼내서 bfs 어레이로 담음
			int q = Q.poll();
			bfs.add(q);
			
			//큐와 연결된 ArrayList 를 탐색하면서 방문하지 않은 노드를 Q리스트에 넣어주고 방문처리
			for(int i:graph[q]) {
				if(!visit[i]) {
					Q.add(i);
					visit[i]= true;
				}
			}
		}
	}

}
