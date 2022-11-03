package oopsConcepts;
class Polymorphism{
	  void display(){
	    System.out.println("No argument function");
	  }
	void display(int i){
	    System.out.println("one  argument function of type int");
	 }
	void display(float i){
	    System.out.println("one  argument function of type float");
	 }
	void display(double i){
	    System.out.println("one  argument function of type double");
	 }

	void display(int i, int j){
	   System.out.println("Two argument function of type int");
	}

	void display(float i, float j){
	   System.out.println("Two argument function of type float");
	}
	void display(double i, double j){
	   System.out.println("Two argument function of type double");
	}
}

public class FuncOverloading {

	public static void main(String[] args) 
	{
		Polymorphism ob=new Polymorphism();
		ob.display();//no argument function
		ob.display(45);
		ob.display(78.5f);
		ob.display(564.3);
		ob.display(7,56.4f);
		ob.display(89.4f,89);
		ob.display(5,8);
		ob.display(45.3f, 98.7f);
		ob.display(56.3,76.6);
	}

}

