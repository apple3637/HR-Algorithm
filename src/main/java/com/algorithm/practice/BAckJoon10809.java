
/*
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.

���
������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ����Ѵ�.

����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ�̴�.

���� �Է� 1 
baekjoon
���� ��� 1 
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 * */
package com.algorithm.practice;
import java.io.IOException;
import java.util.Scanner;

public class BAckJoon10809 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] array_str = str.toCharArray();
		int[] result     = new int[26];
		
		int ascii = 0;
		int index = 0;
		
		for(int i = 0; i<result.length;i++) {
			//�ʱ�ȭ
			result[i] = -1;
		}
		
		//�־��� ���ڿ��� �ش��ϴ� ��ġ�� ���� �ٲ��ش� 
		while (index < str.length()) {
			// ��ġ üũ
			ascii = (int) array_str[index];

			// �̹� ������ ��� �ǳʶٱ�
			if (result[ascii - 97] == -1) {
				result[ascii - 97] = index;

			} 
			index++;
		}
		
		for(int a : result) {
			System.out.print(a+" ");
		}

	}

}
