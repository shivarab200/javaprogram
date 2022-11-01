package com.siva;
import java.util.*;

public class FActorialOfNum {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=in.nextInt();
		double fact=1;
		while(n>=1)
		{
			fact=fact*n;
			n=n-1;
		}
		System.out.println(fact);
	}

}
