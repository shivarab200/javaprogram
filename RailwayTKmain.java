package problem;
import java.util.*;

class RailwayTicket
{
	//to declare variables as global variable..So we can use those variables anywhere within RailwayTicket class
	String name;
	String coach;
	long mobNum;
	int price;
	int total;
	
	void input()//to get input from user
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Passenger Name : ");
		name=in.nextLine();
		System.out.println("Enter Coach The Passenger prefered : ");
		System.out.println("Input must be Any of the given /First_AC,Second_AC,Third_AC,Sleeper/ ");//optional
		coach=in.nextLine();
		System.out.println("Enter Passenger Mobile Number : ");
		mobNum=in.nextLong();
		System.out.println("Enter the Amount They Payed : ");
		price=in.nextInt();
	}
	void update()//to update coach preference
	{
		if(coach.equals("First_AC"))
		{
			total=price+700;
		}
		else if(coach.equals("Second_AC"))
		{
			total=price+500;
		}
		else if(coach.equals("Third_AC"))
		{
			total=price+250;
		}
		else if(coach.equals("Sleeper"))
		{
			total=price;
		}
		else
		{
			total=0;
		}
	}
	
	void Display()//to display these informations
	{
		System.out.println(); 
		System.out.println("Passenger Name           : "+name); 
		System.out.println("Passenger Moble Number   : "+mobNum); 
		System.out.println("Passenger Prefered Coach : "+coach); 
		System.out.println("Total Amount             : "+total+"/-"); 
	}
}

public class RailwayTKmain {

	public static void main(String[] args) 
	{
		RailwayTicket RT=new RailwayTicket();//to create an object named RT for the class RailwayTicket
		//To call the functions
		RT.input();
		RT.update();
		RT.Display();
		
	}

}
