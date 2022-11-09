package com.siva;

public class ArrayException {

	public static void main(String[] args) 
	{
		int[] ar=new int[4];
		System.out.println("Before array assigning value in array");
		try {
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		//ar[4]=5; //will shows error message when we put this line
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("Before array assigning value in array "+ar[ar.length-1]);
	}

}
