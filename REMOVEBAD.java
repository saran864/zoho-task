/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner (System.in);
	int T=sc.nextInt();

     while(T!=0)
	{
	    int n=sc.nextInt();
	 	int a[]=new int[n];
	 	int b[]=new int[n+1];
	 	for(int i=0;i<n;i++)
	 	{
	 	    a[i]=sc.nextInt();
	 	    b[a[i]]++;
	 	}
	 	Arrays.sort(b);
	 	System.out.println(n-b[n]);
	    
	    
	    
	  T--;  
	}
	}
}
