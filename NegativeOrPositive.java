package com.siva;
import java.util.Scanner;

public class NegativeOrPositive {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter The element");
		int num=in.nextInt();
		
		if(num==0)
		{
			System.out.println(num+" Is Zero");
		}
		else if(num>0)
		{
			System.out.println(num+" Is a Positive");
		}
		else
		{
			System.out.println(num+" Is a Negative");
		}

	}

}
