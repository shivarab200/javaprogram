package area;
import java.util.*;
public class AreaOfRectangle {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Length :");
		int len=in.nextInt();
		System.out.println("Enter the Breadth :");
		int br=in.nextInt();
		
		int Area=len*br;
		System.out.println("Area of the Rectangle length of "+len+"And Breadth of "+br+" is "+Area);
	}

}
