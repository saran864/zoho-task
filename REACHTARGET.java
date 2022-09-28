/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
     int T=sc.nextInt();
     int n=T*2,i;
     int a[]=new int[n];
     
       if(T>=1&&T<=10)
       {
       for(i=0;i<n;i++)
       a[i]=sc.nextInt();
       for( i=0;i<n;i+=2)
        System.out.println(a[i]-a[i+1]);
           
       }
       
	}
	}

