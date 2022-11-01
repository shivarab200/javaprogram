package problem;
import java.util.*;

public class CalculaterUsingSwitch {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("_________________INSTRUCTION_________________");
		System.out.println();
		System.out.println("             Enter Your Choice");
		System.out.println();
		System.out.println("               1.Addition");
		System.out.println("               2.Subtraction");
		System.out.println("               3.Division");
		System.out.println("               4.Multiplication");
		System.out.println("               5.Modulo Division");
		System.out.println();
		System.out.println();
		int choice=in.nextInt();
		System.out.println("Enter Two Numbers :");
		int n1=in.nextInt();
		int n2=in.nextInt();
		int ans;
		switch(choice)
		{
		case 1:
			System.out.println("You Selected Addition");
			ans=n1+n2;
			System.out.println("Addition of "+n1+" And "+n2+" is "+ans);
			break;
		case 2:
			System.out.println("You Selected Subtraction");
			ans=n1-n2;
			System.out.println("Subtraction of "+n1+" And "+n2+" is "+ans);
			break;
		case 3:
			System.out.println("You Selected Division");
			if(n2!=0)
			{
				ans=n1/n2;
				System.out.println("Quatient of "+n1+" And "+n2+" is "+ans);
			}
			else
			{
				System.out.println("Zero Division Error...!");
			}
			break;
		case 4:
			System.out.println("You Selected Multiplication");
			ans=n1*n2;
			System.out.println("Multiplication of "+n1+" And "+n2+" is "+ans);
			break;
		case 5:
			System.out.println("You Selected Modulo");
			if(n2!=0)
			{
				ans=n1%n2;
				System.out.println("Reminder of "+n1+" And "+n2+" is "+ans);
			}
			else
				System.out.println("Zero Division Error...!");
			break;
		default :
			System.out.println("Invalid Input...!");
		}
	}

}
