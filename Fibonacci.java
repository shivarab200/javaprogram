package com.siva;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n1=1;
		int n2=1;
		System.out.print("Enter the limit:");
		int limit=in.nextInt();
		int n3,s=1;
		System.out.println(n1);
		System.out.println(n1);
		
		while(s<limit-1)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			s=s+1;
		}
		
	}

}
