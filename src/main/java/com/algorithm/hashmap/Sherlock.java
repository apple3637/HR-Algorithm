package com.algorithm.hashmap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Sherlock {


	static int anagramCnt = 0;
	 // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {

    	anagramCnt = 0;
    	char[] arr = new char[s.length()];
    	arr = s.toCharArray();
    	int[] alphArr = new int[26];
    	
    	int forCnt = s.length()/2 +1;
    	
    	int len = 1;
    	
    	for(int i=0;i<arr.length;i++) 
    	{
    		int index = (int)arr[i]-97;
    		alphArr[index] = alphArr[index]+1; // a,b,b,a,c [2,2,1,0,0,,,]
    	}
    	
    	for(int i=0; i<=forCnt; i++) //전체길이 절반돌기...
    	{
    		for(int j = 0;j<s.length();j++) // 기준
    		{
    			for(int k = j+1; k<s.length();k++) // 나머지배열 
    			{
    				if(k+len <= s.length()) 
        			{
        				countAnaminus(s.substring(j,j+len), s.substring(k,k+len),len);
            		}	
    			}
    		}
    		len++;
    	}
    	return anagramCnt;
    }
    
    static boolean countAnaminus(String n, String m, int len) {
    	//System.out.println("[n:"+n+", m:"+m+", len:"+len+"]");
    	
    	char[] tempArr1 = new char[len];
    	char[] tempArr2 = new char[len];
    	
    	int[] tempArr1_num = new int[26];
    	int[] tempArr2_num = new int[26];
    	
    	tempArr1 = n.toCharArray();
    	tempArr2 = m.toCharArray();
    	int flag = 0;
    	
    	for(int i=0; i<len;i++) 
    	{
    		int idx1 = (int)tempArr1[i]-97;
    		int idx2 = (int)tempArr2[i]-97;
    		
    		tempArr1_num[idx1] = tempArr1_num[idx1] +1; 
    		tempArr2_num[idx2] = tempArr2_num[idx2] +1; 
    		
    	}
    	
        for(int i=0; i<26; i++) 
        {
    		if(tempArr1_num[i] != tempArr2_num[i]) 
    		{
    			return false;
    		}
    		else if(tempArr1_num[i] !=0 &&  tempArr1_num[i] == tempArr2_num[i]) 
    		{ 
    			//System.out.println("arr1num["+i+"]:"+tempArr1_num[i]+" , arr2num["+i+"]:"+tempArr2_num[i]);
    			flag = 1;	
    		}
        }
        if(flag == 1) 
        {
            anagramCnt = anagramCnt +1;   	  
        }
    	
    	
    	return true;
    };
    
    static void checkAna(String ori, String subs, int length) 
    {
    	char[] oriArr = new char[ori.length()];
    	char[] subArr = new char[subs.length()];
    	
    	oriArr = ori.toCharArray();
    	subArr = subs.toCharArray();
    	int count = 0;
    	Arrays.sort(oriArr);
    	Arrays.sort(subArr);
    	
    	for(char a: oriArr) 
    	{
    		System.out.print(a+",");
    	}
    	System.out.println("");
    	/*
    	if(Arrays.equals(oriArr,subArr)) 
    	{
    		System.out.println("equal");
    		count++;
    	}
    	else 
    	{
    		System.out.println("no");
    	}
    	System.out.println("count:"+count);
    	*/
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);
            System.out.println(result);
        }
        scanner.close();
    }

}
