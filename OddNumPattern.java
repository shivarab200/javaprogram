package com.siva;

import java.util.Scanner;

public class OddNumPattern {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		 System.out.println("Enter the limit");
			int n=in.nextInt();
			for(int i=1;i<=n;i++)
			{
			    if(i%2!=0)
			    {
			    	for(int j=n;j>i;j--)
				    {
				        System.out.print(" ");
				    }
				    for(int j=1;j<=i;j++)
				    {
				        System.out.print("* ");
				    }
				    System.out.println();
			    }
			}
	}

}
