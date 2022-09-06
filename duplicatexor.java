import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int a[]={1,1,2,3,4,5,7,5,3,2,3},k;
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=i+1;j<a.length;j++)
	        {
	          k=a[i]^a[j];
	         if(k==0) 
	        {
	            a[j]=' ';
	        }
	        }
	        if(a[i]!=' ')
	        System.out.print(a[i]);
	    }
	}
}