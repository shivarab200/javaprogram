package problem;
import java.util.*;

public class OddOrEvenUsingSwitch {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=in.nextInt();
		int b=a%2;
		
		switch(b)
		{
		case 0:
			System.out.println(a+" is Even Number");
			break;
		case 1:
			System.out.println(a+" is Odd Number");
			break;
		}
	}

}
