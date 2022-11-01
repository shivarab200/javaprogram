package com.siva;

import java.util.Scanner;

class largestNum
{
	int a,b,c;
	
	void inputFunction()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		a=in.nextInt();
		System.out.println("Enter the Number 2: ");
		b=in.nextInt();
		System.out.println("Enter the Number 3: ");
		c=in.nextInt();
	}
	void findLargest() 
	{
		if(a==b && a==c)
		{
			System.out.println("All the values are same."+a+" Is a value...");
		}
		else if(a>b && a>c)
		{
			System.out.println(a+" Is a greatest among "+a+" , "+b+" , "+c);
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" Is a greatest among "+a+" , "+b+" , "+c);
		}
		else
		{
			System.out.println(c+" Is a greatest among "+a+" , "+b+" , "+c);
		}
	}
}

public class LargestOfThreeNum {

	public static void main(String[] args) 
	{
		largestNum ln=new largestNum();
		ln.inputFunction();
		ln.findLargest();
	}

}
