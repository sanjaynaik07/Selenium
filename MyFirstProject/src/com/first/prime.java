package com.first;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=4;
		int count =0;
		
		for(int k=2;k<=i/2;k++)
		{
			int m=i%k;
			
			if (m==0)
			{
				count++;
				break;
			}
		}
		
			
			if(count==0)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("not prime");
		}
		
	}
}

