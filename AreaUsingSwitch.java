package problem;
import java.util.*;

class Area
{
	float half;
	float pi;
	Area()//default constructor
	{
		half=0.5f;
		pi=3.14f;		
	}
	
	void rectangle(int len,int bre)
	{
		int area=len*bre;
		System.out.println("Area of Rectangle is :"+area);
	}
	void square(int side)
	{
		int area=side*side;
		System.out.println("Area of Square is :"+area);
	}
	void circle(int rad)
	{
		Float area=pi*(rad*rad);
		System.out.println("Area of Circle is :"+area);
	}
	void triangle(int len,int bre)
	{
		float area=half*(len*bre);
		System.out.println("Area of Triangle is :"+area);
	}
	
}

public class AreaUsingSwitch {

	public static void main(String[] args) 
	{
		int len,bre,side,rad;
		Scanner in=new Scanner(System.in);
		System.out.println("**************Enter the Option**************");
		System.out.println("             1.Area of Rectangle");
		System.out.println("             2.Area of Square");
		System.out.println("             3.Area of Circle");
		System.out.println("             4.Area of Triangle");
		int a=in.nextInt();
		Area ar=new Area();
		
		switch(a)
		{
		case 1:
			System.out.println("Enter Length & Breadth for Rectangle : ");
			len=in.nextInt();
			bre=in.nextInt();
			ar.rectangle(len,bre);//function calling with parameter
			break;
		case 2:
			System.out.println("Enter Sides for Square : ");
			side=in.nextInt();
			ar.square(side);
			break;
		case 3:
			System.out.println("Enter Radius for Circle : ");
			rad=in.nextInt();
			ar.circle(rad);
			break;
		case 4:
			System.out.println("Enter Length & Breadth for Triangle : ");
			len=in.nextInt();
			bre=in.nextInt();
			ar.triangle(len,bre);
			break;
		}
	}

}
