package com.algorithm.practice;


/*
 * �ѱ� �ְ��� ���� ��� �������� ���ο� ���� ��Ģ�� ����� ���, â���̿� �����Ϸ��� �Ѵ�.

������ ������ ���迡�� �� ī�忡�� ���� ������ ���� �ִ�. �� ����, ������ N���� ī�带 ��� ���ڰ� ���̵��� �ٴڿ� ���´�. �׷� �Ŀ� ������ ���� M�� ũ�� ��ģ��.

���� �÷��̾�� ���ѵ� �ð� �ȿ� N���� ī�� �߿��� 3���� ī�带 ���� �Ѵ�. ���� ���� �����̱� ������, �÷��̾ �� ī���� ���� M�� ���� �����鼭 M�� �ִ��� ������ ������ �Ѵ�.

N���� ī�忡 ���� �ִ� ���ڰ� �־����� ��, M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ���� ����Ͻÿ�.

�Է�
ù° �ٿ� ī���� ���� N(3 �� N �� 100)�� M(10 �� M �� 300,000)�� �־�����. ��° �ٿ��� ī�忡 ���� �ִ� ���� �־�����, �� ���� 100,000�� ���� �ʴ´�.

���� M�� ���� �ʴ� ī�� 3���� ã�� �� �ִ� ��츸 �Է����� �־�����.

���
ù° �ٿ� M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ����Ѵ�.

���� �Է� 1 
5 21
5 6 7 8 9
���� ��� 1 
21
 * */
import java.io.IOException;
import java.util.Scanner;


public class BackJoon2798_blackJack {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		int max = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		
		for(int i=0; i<n;i++) {
			for(int j=i;j<n-2;j++) {
				if(j<n && j+2 <= n) {
					int sum = arr[i]+arr[j+1]+arr[j+2];
					//System.out.println(sum);
					if(max<sum && sum <=m) max = sum;
					
					sum =0;
				}
			}
		}
		System.out.println(max);
	}
	
	public static void sort (int[] a) {
		int[] temp = new int[a.length];
		temp = a;
		for(int i=0; i<temp.length;i++) {
			for(int j=i; j<temp.length-1;j++) {
				if(a[i]<a[j+1]) {
					int tempInt = a[i];
					a[i] = a[j+1];
					a[j+1] = tempInt;
				}
			}
		}	
	}

}
