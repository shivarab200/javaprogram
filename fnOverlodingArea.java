package oopsConcepts;

class Areas
{
	void area(int a)
	{
		int ar=a*a;
		System.out.println("Area of Square for Sides of"+a+" is "+ar);
	}
	void area(int a,int b)
	{
		int ar=a*b;
		System.out.println("Area of Rectangle Length of"+a+" And Breadth"+b+" is "+ar);
	}
	void area(float a,float b)
	{
		float ar=(1/2)*a*b;
		System.out.println("Area of Triangle Length of"+a+" And Breadth"+b+" is "+ar);
	}
	void area(float a)
	{
		float ar=(3.14f)*a*a;
		System.out.println("Area of Circle for Sides of"+a+" is "+ar);
	}
}

public class fnOverlodingArea {

	public static void main(String[] args) 
	{
		Areas obj=new Areas();
		obj.area(4);
		obj.area(4,8);
		obj.area(12.1f,6.2f);
		obj.area(16.1f);
	}

}
