package com.siva;
import java.util.*;

class Exp1 extends Exception//custom exception class 1
{
	Exp1(String msg)
	{
		super(msg);
	}
}
class Exp2 extends Exception//custom exception class 2
{
	Exp2(String msg)
	{
		super(msg);
	}
}


class Banking//Class to do banking 
{
	private int depos;//deposit variable
	private float bal=10000;//default balance
	private int withd;//withdraw variable
	private float calc;
	public Banking()//default constructor
	{
		depos=0;
		withd=0;
		calc=bal;//assigning balance value in calculation variable
	}
	public void balance()//method to check balance
	{
		System.out.println("Your Account Balance is "+calc);
	}
	public void deposit(int dep)//method to perform deposit the amount
	{
		try
		{
			if(dep%100!=0)throw new Exp1("Invalid Amount");
		}
		catch(Exp1 e)
		{
			e.printStackTrace();
		}
		if(dep%100==0)
		{
			System.out.println("Your Amount Rs."+dep+" has been Added to Your Account");
			calc+=dep;
			System.out.println("Your Account Balance is "+calc);
			System.out.println("Successful Transaction");
			
		}
		else
		{
			System.out.println("Enter Valid Amount");
			System.out.println("Transaction Failed");
		}
		
	}
	public void withdraw(int wtd)//method to perform withdraw the amount
	{
		try
		{
			if(wtd>calc)throw new Exp1("Insufficient Balance");
			if(wtd%100!=0 || wtd%500!=0)throw new Exp2("Invalid Amount");
		}
		catch(Exp1 e)
		{
			e.printStackTrace();
		} catch (Exp2 e) {
			
			e.printStackTrace();
		}
		if(wtd<calc && wtd%100==0 && wtd%500==0)
		{
			System.out.println("Don't forget to Collect Cash and Card");
			System.out.println("Your Withdraw Amount is Rs."+wtd);
			calc-=wtd;
			System.out.println("Your Account Balance is "+calc);
			System.out.println("Successful Transaction");
		}
		else
		{
			System.out.println("Enter Valid Amount");
			System.out.println("Transaction Failed");
		}
		
	}
	
}

public class ATMprocessExp {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Banking b=new Banking();
		int flag=0;
		while(flag!=1)//loop will run until flag value becomes 1
		{
			System.out.println("***********Choose Your Opetion***********");
			System.out.println("           1.To Check Balance");
			System.out.println("           2.To Deposite Amount");
			System.out.println("           3.To Withdraw Amount");
			System.out.println("           4.Exit");
			System.out.println();
			
			int ch=in.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("You Decided to Check Your A/C Balance");
				b.balance();
				break;
			case 2:
				System.out.println("Enter The Amount You Have to Deposit");
				System.out.println("Insert Only 100's,200's,500's (or) 2000's");
				int dep=in.nextInt();
				b.deposit(dep);
				break;
			case 3:
				System.out.println("You Selected Withdrwal");
				System.out.println("Available Only 500's,2000's Enter as Acceptable Amount");
				int wtd=in.nextInt();
				b.withdraw(wtd);
				break;
			case 4:
				flag=1;
				break;
			}
	}
		System.out.println("Thank You...!");
}
}
