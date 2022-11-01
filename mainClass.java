package oopsConcepts;
import java.util.*;

class Employee
{
	String name;
	int empId;
	String empDept;
	static float empSalary;
	static String cname;
	static
	{
		cname="EduBridge India Pvt.Ltd";
		empSalary=50000.2f;
	}
	
	void inputFunc()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Employee Name");
		name=in.nextLine();
		System.out.println("Enter the Employee ID");
		empId=in.nextInt();
		System.out.println("Enter the Employee Department");
		empDept=in.next();
		/*System.out.println("Enter the Employee Salary");
		empSalary=in.nextFloat();*/
	}
	void displayFunc()
	{
		System.out.println("Employee Name       : "+name);
		System.out.println("Employee ID         : "+empId);
		System.out.println("Employee Department : "+empDept);
		System.out.println("Employee Salary     : "+empSalary);
		System.out.println("Commpany name       : "+cname);
	}
}

public class mainClass {

	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		emp1.inputFunc();
		System.out.println();
		emp2.inputFunc();
		System.out.println();
		emp3.inputFunc();
		System.out.println();
		System.out.println();
		
		emp1.displayFunc();
		System.out.println();
		System.out.println();
		emp2.displayFunc();
		System.out.println();
		System.out.println();
		emp3.displayFunc();
		
		
	}

}
