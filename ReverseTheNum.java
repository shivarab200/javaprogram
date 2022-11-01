package com.siva;
import java.util.*;
public class ReverseTheNum {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=in.nextInt();
		int temp=n;
		int rev=0;
		int rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp/=10;
		}
		System.out.print("Reverse of the "+n+" is "+rev);
	}

}
