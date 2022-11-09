package com.siva;
import java.io.BufferedReader;//to read input in directly in buffer reader class
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class CompileTimeExp {

	public static void main(String[] args) throws IOException //to handle compile time exceptions
	{
		String name;
		int age;
		float sal;
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    //we can write like this also
		
		System.out.println("Enter name");
		
		name=br.readLine(); //to read string variable
		System.out.println("Enter age");
		age=Integer.parseInt(br.readLine()); //to read int variable
		System.out.println("Enter salary");
		sal=Float.parseFloat(br.readLine()); //to read float variable
		
		System.out.println("Employee Details");
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Salary="+sal);


	}

}
