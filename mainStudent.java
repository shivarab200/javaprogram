package oopsConcepts;
import java.util.*;

class Student
{
	String name;
	int stId;
	String stDept;
	float stFees;
	
	void acceptData()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Student Name");
		name=in.nextLine();
		System.out.println("Enter the Student ID");
		stId=in.nextInt();
		System.out.println("Enter the Student Department");
		stDept=in.next();
		System.out.println("Enter the Student Fees");
		stFees=in.nextFloat();
	}
	void display()
	{
		System.out.println("Student Name       : "+name);
		System.out.println("Student ID         : "+stId);
		System.out.println("Student Department : "+stDept);
		System.out.println("Student Fees       : "+stFees);
	}
}

public class mainStudent {

	public static void main(String[] args) 
	{
		Student st1=new Student();
		Student st2=new Student();
		
		st1.acceptData();
		System.out.println();
		st2.acceptData();
		System.out.println();
		System.out.println();
		st1.display();
		System.out.println();
		st2.display();
		
	}

}
