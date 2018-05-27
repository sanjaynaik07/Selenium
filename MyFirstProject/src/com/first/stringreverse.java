package com.first;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="SaS";
		
		String rev="";
		
		int i=a.length();
		System.out.println(i);
		
		for(i=a.length()-1; i>=0;i--)
		{
		
			rev=rev+a.charAt(i);
			
		}
		
		System.out.println(rev);
		
		
		if(rev==a)
		{
			System.out.println("palindrome");
		}
			
		else 
		{
			System.out.println("not palindrome");
		}
	}

	
}
