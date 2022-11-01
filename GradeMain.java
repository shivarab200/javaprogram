package problem;
import java.util.*;
class Grade
{
	int mark;
	
	void userInput()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Marks(B/W 0 to 100):");
		mark=in.nextInt();
	}
	void evaluate()
	{
		if(mark>=90 && mark<=100)
		{
			System.out.println("Grade A");
		}
		else if(mark>=70 && mark<=89)
		{
			System.out.println("Grade B");
		}
		else if(mark>=40 && mark<=69)
		{
			System.out.println("Grade C");
		}
		else if(mark>=0 && mark<=39)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Invalid Input...!");
		}
		
	}
}

public class GradeMain 
{

	public static void main(String[] args) 
	{
		Grade g=new Grade();
		g.userInput();
		g.evaluate();
	}

}
