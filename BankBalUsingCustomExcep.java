package com.siva;
import java.util.*;
class Bank extends Exception
{
	Bank(String s)
	{
		super(s);
	}
}

class BankBalance
{
	private int balance;
	public BankBalance()
	{
		balance=5000;
	}
	
	public void withdraw(int amount)
	{
		try
		{
			if(amount>balance)throw new Bank("Insufficient Bank Balance");
			
		}
		catch(Bank e)
		{
			e.printStackTrace();
		}
		if(balance>amount)
		{
			System.out.println("Debited Amount");
			System.out.println("Rs."+amount+"/-");
			System.out.println();
			System.out.println();
			int avail=balance-amount;
			System.out.println("Your Available is Rs."+avail);
			System.out.println();
			System.out.println();
			System.out.println("Transaction Completed Successfully");
			System.out.println();
			System.out.println();
			System.out.println("Thank You...!");
		}
		else 
		{
			System.out.println("Transaction Failed");
		}
	}
}
public class BankBalUsingCustomExcep {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("*** Available only 500's,2000's ***");
		System.out.println("Enter Your Withdraw Amount");
		int a=in.nextInt();
		BankBalance bb=new BankBalance();
		bb.withdraw(a);
	}

}
