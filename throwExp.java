package com.siva;

public class throwExp {

	public static void main(String[] args) 
	{
		int a=10,b=0,c=0;
		System.out.println("Before division");
		try {
			if(b==0) throw new ArithmeticException("Divide by zero error");//we can create our own message as error message
		}catch(ArithmeticException e) {
			e.printStackTrace();
			String s="Shiva";
			
		}

	}

}
