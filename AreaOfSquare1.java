package area;
import java.util.*;
public class AreaOfSquare {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Sides of the Square :");
		int sides=in.nextInt();
		int Area=sides*sides;
		
		System.out.println("Area of the Square :"+Area);
	}
}
