package com.siva;

import java.util.*;

public class RightAnglePatternWithCount {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter The Limit");
		int n=in.nextInt();
		int temp=n;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}
