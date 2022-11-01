package com.siva;
import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the vale :");
		int a=in.nextInt();
		if(a==0)
		{
			System.out.println(a+" is an Zero");
		}
		else if(a%2==0)
		{
			System.out.println(a+" is an Even number");
		}
		
		else
		{
			System.out.println(a+" is an Odd number");
		}

	}

}
