package datatypes;

public class ArithmeticOperations {

	public static void main(String[] args) {
		float num1,num2,ans;
		num1=15.2f;
		num2=16.2f;
		
		//Addition (+)
		ans=num1+num2;
		System.out.println("The ans of Adding "+num1+" And "+num2+" is "+ans);
		
		//Subtract (-)
		ans=num1-num2;
		System.out.println("The ans of Subtracting "+num1+" And "+num2+" is "+ans);
		
		//Multiplication (*)
		ans=num1*num2;
		System.out.println("The ans of Multiplying "+num1+" And "+num2+" is "+ans);
		
		//Divition (/)
		ans=num1/num2;
		System.out.println("Getting cotient of "+num1+" And "+num2+" is "+ans);
		
		//Modulo (%)
		ans=num1 % num2;
		System.out.println("Getting reminder of "+num1+" And "+num2+" is "+ans); 

	}

}
