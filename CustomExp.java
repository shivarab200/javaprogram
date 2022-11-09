package com.siva;
class PersonAge extends Exception{ //here PersonAge class behaves like Arithmetic
	public PersonAge(String s) 
	{
		super(s);
	}
}
class Vote{
	void checkAge(int a) {
		try 
		{
			if(a<18) throw new PersonAge("Age less than 18, so not eligible for vote");
		}
		catch(PersonAge e) 
		{
			e.printStackTrace();
		}
	}
}

public class CustomExp {

	public static void main(String[] args) 
	{
		Vote v=new Vote();
		v.checkAge(12);
		
	}

}
