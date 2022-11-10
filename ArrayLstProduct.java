package com.siva;
import java.util.*;
class Product
{
	int ProdID;
	String ProdName;
	float ProdPrice;
	public Product(int prodID, String prodName, float prodPrice) 
	{
		super();
		ProdID = prodID;
		ProdName = prodName;
		ProdPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Product [ProdID=" + ProdID + ", ProdName=" + ProdName + ", ProdPrice=" + ProdPrice + "]";
	}
	
	
}
public class ArrayLstProduct {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		ArrayList<Product> lst=new ArrayList<>();
		System.out.println("Enter The Limit");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter ID");
			int a=in.nextInt();
			System.out.println("Enter Product Name");
			String s=in.next();
			System.out.println("Enter The Price");
			float f=in.nextFloat();
			Product pr=new Product(a,s,f);
			lst.add(pr);
		}
		
		Iterator<Product> it=lst.iterator();
		System.out.println("ID\tNAME\tPRICE");
		while(it.hasNext())
		{
			Product ob=it.next();
			System.out.println(ob.ProdID+"\t"+ob.ProdName+"\t"+ob.ProdPrice);
		}
	}

}
