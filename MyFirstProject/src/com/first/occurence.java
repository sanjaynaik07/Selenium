package com.first;

public class occurence {

	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[]{ 1,2,1};


		for(int j=0;j<a.length;j++)
		{
			count=0;
		     for(int i=j+1;i<a.length;i++)
		     {
			

		         if( a[j]==a[i])
		          {
			      count++;
		          }
		        
		       
		      }
		     
		     System.out.println(a[j]+"--"+count);
		
         }
}
}