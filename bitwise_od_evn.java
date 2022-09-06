import java.util.*;
class oddoreven
{   
public static void main (String args[])
   {  
   Scanner sc=new Scanner (System.in);
   int a=sc.nextInt();
    //using & to find odd or even
	int b=a&1;
	System.out.println( b==1? "odd":"even");//otherwise b=0 is even
	// using | to find odd or even
	int c=a|1;
	System.out.println( c==a ? "odd":"even");//otherwise a+1 is even
	// using ^ to find odd or even
    int d=a^1;
	System.out.println( d==a-1? "Odd":"even");//otherwise  a+1 is even
   
   }
   }