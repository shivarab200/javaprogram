package problem;
import java.util.*;

class ShowRoom
{
	String name;
	long mobNum;
	double price;
	double discountAmount;
	double priceAfterDisc;
	String percent;
	
	ShowRoom()
	{
		name="";
		mobNum=0;
		price=0;
		discountAmount=0;
		priceAfterDisc=0;
	}
	
	void userInput()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Customer Name : ");
		name=in.nextLine();
		System.out.println("Enter Customer Mobile Number : ");
		mobNum=in.nextLong();
		System.out.println("Enter The Amount Custemor Purchased : ");
		price=in.nextDouble();
	}
	
	void calculateFunc()
	{
		if(price<=10000)
		{
			percent="5%";
			discountAmount=(5*price)/100;
			priceAfterDisc=price-discountAmount;
		}
		else if(price>10000 && price<=20000)
		{
			percent="10%";
			discountAmount=(10*price)/100;
			priceAfterDisc=price-discountAmount;
		}
		else if(price>20000 && price<=35000)
		{
			percent="15%";
			discountAmount=(15*price)/100;
			priceAfterDisc=price-discountAmount;
		}
		else 
		{
			percent="20%";
			discountAmount=(20*price)/100;
			priceAfterDisc=price-discountAmount;
		}
	}
	
	void displayFunc()
	{
		System.out.println();
		System.out.println("Customer Name          : "+name);
		System.out.println("Customer Mobile Number : "+mobNum);
		System.out.println();
		System.out.println("Price Of the Product                    - "+price+"/-");
		System.out.println("Discount Pecentage                      - "+percent);
		System.out.println("Discount Amount                         - "+discountAmount+"/-");
		System.out.println("...........................................................");
		System.out.println("Total Price After Discount              - "+priceAfterDisc+"/-");
		System.out.println("...........................................................");
	}
	
}

public class ShowRoomMainClass {

	public static void main(String[] args) 
	{
		ShowRoom sr=new ShowRoom();
		sr.userInput();
		sr.calculateFunc();
		sr.displayFunc();
	}

}
