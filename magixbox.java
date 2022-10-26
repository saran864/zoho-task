package flames;

public class square {
  
	public static void main(String[] args) {
		
		int square [][]=new int [3][3];
		   int check[]={1,2,3,4,5,6,7,8,9};
		   int i,j,k;
		   System.out.println("Row possibility");
		   for(i=0;i<9;i++)
		   {
			   for(j=i+1;j<check.length;j++)
			   {
				   for(k=j+1;k<check.length;k++)
				   {     
					   if((check[i]+check[j]+check[k])==15)
					   {
						   
						   if((check[i]!=check[j]&&check[i]!=check[k]&&check[j]!=check[k]&&check[i]!=check[k] ))
						   {
							   square[i][0]=check[i];
							   square[i][1]=check[j];
							   square[i][2]=check[k];
							  
							   System.out.println(square[i][0]+" "+square[i][1]+" "+square[i][2]); 
							}
						   
						   }
						 
					   }
				   }
			   }
		   System.out.println("Column possibility");
		   for(i=0;i<9;i++)
		   {
			   for(j=i+1;j<check.length;j++)
			   {
				   for(k=j+1;k<check.length;k++)
				   {     
					   if((check[i]+check[j]+check[k])==15)
					   {
						   
						   if((check[i]!=check[j]&&check[i]!=check[k]&&check[j]!=check[k]&&check[i]!=check[k] ))
						   {
							   square [0][i]=check[i];
							   square [1][i]=check[j];
							   square [2][i]=check[k];
							  
							   System.out.println(square[0][i]+" "+square[1][i]+" "+square[2][i]); 
							}
						   
						   }
						 
					   }
				   }
			   }
		   }
		   
		 

	   
	   
	   
	
	
	
	
}
