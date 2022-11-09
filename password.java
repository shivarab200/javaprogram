package com.siva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Check
{
	private String username;
	private String password;
	public Check()
	{
		
	}
	
	public void input() throws IOException,NullPointerException,NumberFormatException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		System.out.println("Enter the user name");
		username=bf.readLine();
		System.out.println("Enter the Password");
		password=bf.readLine();
	}
	public void validate() throws NumberFormatException, NullPointerException, IOException 
	{
		int count=3;
		int flag=0;
		while(flag!=1)
		{
			
			if(username.equals("Siva123")&& password.equals("Siva1234"))
			{
				System.out.println("Valid user");
				flag=1;
			}
			else
			{
				System.out.println("Invalid Username or Password");
				count--;
				if(count==0)
				{
					flag=1;
					System.out.println("Your Account has Blocked.Try after 24 hours or Contact Helpline");
				}
				System.out.println("You Can try "+count+" more times");
				System.out.println("Try again");
				System.out.println();
				input();
				
			}
		}
		
	}
}

public class password {

	public static void main(String[] args) throws NullPointerException, IOException
	{
		System.out.println("*****Login******");
		Check c=new Check();
		c.input();
		c.validate();
	}

}
