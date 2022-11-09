package com.siva;
import java.util.*;
public class PyramidOppDirection 
{

	public static void main(String[] args) 
	{
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter the limit");
			int n=in.nextInt();
			for(int i=n;i>=1;i--)
			{
			    for(int j=n;j>i;j--)
			    {
			        System.out.print(" ");
			    }
			    for(int j=1;j<=i;j++)
			    {
			        System.out.print(i+" ");
			    }
			    System.out.println();
			}
	}
}
