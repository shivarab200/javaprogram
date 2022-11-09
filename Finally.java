package com.siva;
//multiple catch and finally block
public class Finally {

	public static void main(String[] args) 
	{
		int a=10,b=2,c=0;
		int ar[]=new int[4];
		System.out.println("Before division");
		System.out.println("Array assignment");
		try {
		c=a/b;
		ar[3]=90;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();//catch will execute only when exception occurs
		}
		finally {
			System.out.println("Finally block will execute always");
			//we use finally block for closing resources
			
		}
		System.out.println("After division");
		System.out.println("after array assignment");

	}

}
