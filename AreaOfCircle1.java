package area;
import java.util.*;
public class AreaOfCircle {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Value of PI(3.14): ");
		float pi=in.nextFloat();
		System.out.println("Enter the Value of Radius : ");
		int rad=in.nextInt();
		float Area;
		
		Area=pi*(rad*rad);
		System.out.println("Area of the circle for "+rad+" Radius is "+Area);
	}

}
