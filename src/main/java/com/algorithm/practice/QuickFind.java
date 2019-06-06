package com.algorithm.practice;

import java.util.Scanner;

public class QuickFind {

	public static int[] id;
	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     QuickFind qf = new QuickFind(N);
     
     while(sc != null) 
     {
    	 int p = sc.nextInt();
    	 int q = sc.nextInt();
    	 if(!qf.connected(p, q)) 
    	 {
    		 qf.union(p, q);
    		 System.out.println(p+" "+q);
    		 for(int a : id) 
    		 {
    			 System.out.print("["+a+"]");
    		 }
    		 System.out.println();
    	 }
     }
     
	}
	//Quick Find 초기화
	public QuickFind(int n) 
	{
		id = new int[n];
		for(int i=0; i<n;i++) 
		{
			id[i] = i;
		}
	}
	
	//연결체크
	public boolean connected (int p, int q) 
	{
		return id[p] == id[q];
	}
	
	//합치기
	public void union(int p, int q) 
	{
		int pvalue = id[p];
		int qvalue = id[q];
		
		for(int i=0; i<id.length;i++) 
		{
			if(id[i] == pvalue) 
			{
				id[i]=qvalue;
				System.out.println(id[i]+" , "+pvalue+"->"+qvalue);
			}
		}
	}

}
