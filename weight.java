package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Weighted {
public static void main(String[] args) {
  String s="aaabbbcccdddd";
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Limit");
  int m=sc.nextInt();
  List <Integer> query=new ArrayList();
  for(int i=0;i<m;i++)
  {
	  query.add(sc.nextInt());
  }
  System.out.println(query);
	//char c[]=s.toCharArray();
	int n=s.length();//13
	System.out.println(n);
Map<Character,Integer> alphabets =new HashMap<>();
Set <Integer>   myQuery=new HashSet<>();
	int subs=1;
	for(char prev='a';prev<='z';prev++)
	{
		alphabets.put(prev,subs++);
		
		
	}
	System.out.println(alphabets);
	for(int i=0;i<s.length();i++)
	{
		for(Entry<Character,Integer> entry:alphabets.entrySet())
		{
			if(s.charAt(i)==entry.getKey())
			{   
			     
				
				
			     
			}
		}
	}
	
	System.out.println(myQuery);
	
//	System.out.println(Arrays.asList(alphabets)); // method 1
//	System.out.println(Collections.singletonList(alphabets)); // method 2
//	System.out.println(Arrays.toString(alphabets.entrySet().toArray())); 
	
	
	
	
	
  
  
  
}
}
