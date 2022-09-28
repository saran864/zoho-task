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
	int T =sc.nextInt(),check,i;
	if(T>=1&&T<=1000)
	while(T!=0)
	{
	    int a=sc.nextInt();
	   for(i=1;i<=40;i++)
	   {
	       check=i*25;
	       if(check>=a)
	      { System.out.println(i);
	      break;
	       }
	   }
	    T--;
	}

	}
}
