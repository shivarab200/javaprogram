package oopsConcepts;
//Different blocks in java
public class Blocks {
		static {
			System.out.println("static block will execute before the main");
		}
		{
		    System.out.println("Annonymous block will execute before constructor call");	
		}
		Blocks(){
			System.out.println("Constructor block will execute on Object creation");
		}
		
		public static void main(String[] args) {
			System.out.println("Main method");
			Blocks ob=new Blocks();
		}
	}

