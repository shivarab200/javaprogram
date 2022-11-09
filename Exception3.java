package com.siva;
//combined exception
public class Exception3 {

	public static void main(String[] args) 
	{
		int a=5,b=0,ans=0;
		int[] ar=new int[3];
		System.out.println("After Exception ");
		try//it will handle first error occurs
		{
			ans=a/b;
			ar[4]=5;
		}
		catch(Exception e)//if we want both error put separate try and catch block
		{
			e.printStackTrace();
		}
		System.out.println("After Dividing "+ans);
		System.out.println("After assigning value in array ");
	}

}
