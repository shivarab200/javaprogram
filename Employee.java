package problem;
import java.util.*;
public class Employee {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String ename=in.nextLine();
		System.out.println("Enter Your department :");
		String edept=in.nextLine();
		System.out.println("Enter Your Age :");
		int eage=in.nextInt();
		System.out.println("Enter Your Salary :");
		float esalary=in.nextFloat();
		System.out.println("Enter Your Salary/Year :");
		float eyearsalary=in.nextFloat();
		
		System.out.println("Employee Name is     : "+ename);
		System.out.println("Employee Age  is     : "+eage);
		System.out.println("Employee Salary is   : "+esalary);
		System.out.println("Employee Dept. is    : "+edept);
		System.out.println("Employee Salary/Y is : "+eyearsalary);
	}

}
