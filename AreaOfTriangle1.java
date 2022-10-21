package area;
import java.util.*;

public class AreaOfTriangle {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of 1/2 :");
		float half=in.nextFloat();
		System.out.println("Enter the Length :");
		int len=in.nextInt();
		System.out.println("Enter the Breadth :");
		int br=in.nextInt();
		
		float Area=half*(br*len);
		
		System.out.println("Area of triangle size of "+len+" Length and "+br+" Breadth is "+Area);
	}
}
