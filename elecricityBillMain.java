package problem;
import java.util.*;
class elecricityBill
{
	int unit;
	double total;
	
	void userInput()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Units Consumed :");
		unit=in.nextInt();
	}
	
	void calculate()
	{
		if(unit<=100)
		{
			total=unit*1.25;
		}
		else if(unit>100 && unit<=200)
		{
			total=unit*1.50;
		}
		else if(unit>200)
		{
			total=unit*1.80;
		}
	}
	
	void Display()
	{
		System.out.println("Your Elecricity Bill Amount for unit of "+unit+" is Rs."+total+"/-");
	}
}

public class elecricityBillMain {

	public static void main(String[] args) 
	{
		elecricityBill eb=new elecricityBill();
		
		eb.userInput();
		eb.calculate();
		eb.Display();

	}

}
