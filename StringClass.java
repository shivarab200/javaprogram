package com.siva;
import java.util.*;
public class StringClass {

	public static void main(String[] args) 
	{
		String fname="Siva";
		String lname="Balakrishnan";
		
		//length of the string
		int l1=fname.length();
		int l2=lname.length();
		
		System.out.println("Size of the First Name = "+l1);
		System.out.println("Size of the Last Name = "+l2);
		
		//identify what character is there in the given index
		System.out.println("Character at 0 in First name : "+fname.charAt(0));
		System.out.println("Character at 11 in Last name : "+lname.charAt(11));
		
		//Concatination using +
		String cat=fname+" "+lname;
		System.out.println("Concatination using '+' is : "+cat);
		
		//Concatination using concat() function
		String cat1=fname.concat(lname);
		System.out.println("Concatination using concat() is : "+cat1);
		
		//using uppercase and loweercase
		System.out.println("First name to lowercase : "+fname.toLowerCase());
		System.out.println("last name to upercase : "+lname.toUpperCase());
		
		//substring function
		System.out.println("First name substring : "+fname.substring(1,3));
		System.out.println("Last name substring : "+lname.substring(4));
		
		//equals function
		String fname1="Siva";
		System.out.println("fname is equal of fname1 or not : "+fname.equals(fname1));
		System.out.println("fname is equal of lname or not : "+fname.equals(lname));
		
		//contains function
		String line="My name is Siva";
		System.out.println("line contains fname or not : "+line.contains(fname));
		System.out.println("line contains lname or not : "+line.contains(lname));
		
		//finding index of the given character
		System.out.println("Index of first 'a' in last name : "+lname.indexOf('a'));
		System.out.println("Index of last 'a' in last name : "+lname.lastIndexOf('a'));
		
		//replace function
		System.out.println("Replacing the name in the line :"+line.replace("Siva","Shiva"));
		
		//reverse and append using stringBuffer or stringBuilder
		StringBuffer s=new StringBuffer(fname);
		System.out.println("Reverse : "+s.reverse());
		System.out.println("Append in StringBuffer : "+s.append(" New"));

	}

}
