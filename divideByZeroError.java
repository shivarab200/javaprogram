package com.siva;

public class divideByZeroError {

	public static void main(String[] args) 
	{
		int a=3;
		int b=0;
		int div=0;
		
		System.out.println("Before division");
		try {
		div=a/b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("After division ="+div);
	}

}
