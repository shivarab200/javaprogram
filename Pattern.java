package com.siva;
import java.util.*;
public class Pattern {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(int k=0;k<3;k++)
		{
		    int a=in.nextInt();
			int temp=a;
			for(int i=1;i<=a;i++)
			{
		    	
			    for(int j=temp;j>i;j--)
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
