package com.siva;
import java.util.*;
public class ArmstrongNum {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		while(n!=0) 
		{
			System.out.println("Enter the num:");
			int num=in.nextInt();
			int temp=num;
			int rem;
			int add=0;
			while(temp!=0)
			{
				rem=temp%10;
				add=add+(rem*rem*rem);
				temp/=10;
			}
			System.out.println(add);
			if(add==num)
			{
				System.out.println(num+" is an Armstrong");
			}
			else
			{
				System.out.println(num+" is not an Armstrong");
			}
			n--;
		}
	}

}
