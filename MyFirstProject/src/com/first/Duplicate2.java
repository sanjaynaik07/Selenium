package com.first;

public class Duplicate2 {
   
	
	static int [] temp =new int[20];
	static int count=0;
	static int indi=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[]{ 1,2,3,4,5,6,7,7};



		for(int j=0;j<=a.length;j++)
		{
		for(int i=j+1;i<a.length;i++)
		{

		if( a[j]==a[i])
		{
		int f=temparray( a[j],count);

		if(f==1)
		count=count+1;
		break;
		}
		}

		if(j==a.length)
		{
		print();

		}

		}

		}

		private static void print() {
		// TODO Auto-generated method stub


		for(int i=0;i<count;i++) {

		System.out.println(temp[i]);
		}
		}

		private static int temparray(int num, int count) {
		

		indi=0;
		for(int j=0;j<=count;j++)
		{
		boolean t=true;
		for(int i=0;i<=count;i++ )
		{
		if(temp[i]==num)
		{
		t=false;

		}

		}

		if(t==true)
		{


		temp[count]=num;
		indi=1;
		}


		}

		return indi;






		


		}


}






