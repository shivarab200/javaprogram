package oopsConcepts;
class Product
{
	int pID;
	String PName;
	float pPrice;
	Product()//constructor with default value
	{
		pID=12;
		PName="AC";
		pPrice=25000.5f;
	}
	Product(int i,String s,float f)//constructor with default value
	{
		pID=i;
		PName=s;
		pPrice=f;
	}
	void display()//constructor with argument 
	{
		System.out.println("Product ID is: "+pID);
		System.out.println("Product Name is: "+PName);
		System.out.println("Product ID is: "+pPrice);
	}
	
}

public class constructorMain {

	public static void main(String[] args) 
	{
		Product pr1=new Product();//creating object without passing any values
		System.out.println("Product ID is: "+pr1.pID);
		System.out.println("Product Name is: "+pr1.PName);
		System.out.println("Product ID is: "+pr1.pPrice);
		Product pr2=new Product(7,"Mobile",25000.32f);//creating object with passing values
		System.out.println();
		pr1.display();
		System.out.println();
		pr2.display();
	}

}
