package com.algorithm.hashmap;
import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {

	 // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

	    HashMap <String,Integer> map = new HashMap<String,Integer>();
	    HashMap <String, Integer> count = new HashMap<String,Integer>();
	 
	    
	    for(String strMap : magazine) 
	    {
	    	if(map.containsKey(strMap)) 
	    	{
	    	   map.put(strMap, map.get(strMap)+1);	
	    	}
	    	else 
	    	{
	    		map.put(strMap,0);
	    	}
	    }
	    
	    for(String strNote : note) 
	    {
	    	if(count.containsKey(strNote)) 
	    	{
	    		count.put(strNote, count.get(strNote)+1);	
	    	}
	    	else 
	    	{
	    		count.put(strNote,0);
	    	}
	    }
	    
	    for(String strNote : note) 
	    {
	    	if(!map.containsKey(strNote)) 
	    	{
	    		System.out.println("No");
	    		return;
	    	}
	    	
	    	if(map.get(strNote)<count.get(strNote)) 
	    	{
	    		System.out.println("No");
	    		return;
	    	}
	    }
	    System.out.println("Yes");
	    
	    return;    
    }

    private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		 String[] mn = scanner.nextLine().split(" ");

	        int m = Integer.parseInt(mn[0]);

	        int n = Integer.parseInt(mn[1]);

	        String[] magazine = new String[m];

	        String[] magazineItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < m; i++) {
	            String magazineItem = magazineItems[i];
	            magazine[i] = magazineItem;
	        }

	        String[] note = new String[n];

	        String[] noteItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            String noteItem = noteItems[i];
	            note[i] = noteItem;
	        }

	        checkMagazine(magazine, note);

	        scanner.close();
	}

}
