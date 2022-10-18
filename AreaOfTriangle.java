package datatypes;

public class AreaOfTriangle {

	public static void main(String[] args) 
	{
		int len;
		int bre;
		
		//Assign values
		
		len=4;
		bre=6;
		float half=0.5f;
		
		//finding area
		float Area=half*(len*bre);
		
		//printing the area
		System.out.println("The area of the triangle for size of "+len+" length "+bre+" breadth is "+Area);
		

	}

}
