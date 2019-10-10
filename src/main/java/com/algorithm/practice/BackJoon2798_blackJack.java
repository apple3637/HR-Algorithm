package com.algorithm.practice;


/*
 * 한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.

김정인 버젼의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.

이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.

N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.

입력
첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는다.

합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.

출력
첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.

예제 입력 1 
5 21
5 6 7 8 9
예제 출력 1 
21
 * */
import java.io.IOException;
import java.util.Scanner;


public class BackJoon2798_blackJack {

	private static int[] cards;
	private static int N;
	private static int M;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		cards = new int[N];
		
		for(int i=0; i<N;i++) {
			cards[i]= sc.nextInt();
		}
		
		System.out.println(solution(0,0,0));
	}
	
	private static int solution(int sum, int idx, int cnt) {
		System.out.println("cnt:"+cnt);
		if(cnt == 3) {
			return sum >M?0:sum;
		}
		if(idx >= N) {
			return 0;
		}
		int max =0;
		for(int i=idx; i<N;i++) {
			System.out.println("[sum:"+sum+",value:"+cards[i]+",i:"+i+",cnt:"+cnt+"]");
			System.out.println("sulotion("+(sum+cards[i])+","+(i+1)+","+(cnt+1)+")");
			max = Math.max(max, solution(sum+cards[i],i+1,cnt+1));
			System.out.println("max:"+max);
		}
		return max;
	}

}
