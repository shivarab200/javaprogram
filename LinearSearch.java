package problem;
import java.util.*;
class LinearSR
{
	int at;
	int el;
	int lm;
	int[] arr;
	
	void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Limit:");
		lm=in.nextInt();
		arr=new int[lm];
		System.out.print("Enter array Elements:");
		for(int i=0;i<lm;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter element to Search:");
		el=in.nextInt();
	}
	void search()
	{
		for(int i=0;i<lm;i++)
		{
			if(arr[i]==el)
			{
				at=i;
				break;
			}
		}
	}
	void display()
	{
		if(at==0)
		{
			System.out.println("Element "+el+" is not found");
		}
		else
		{
			System.out.println("Successful Search");
			System.out.println("Element "+el+" is found at "+at);
		}
	}
	
}
public class LinearSearch {

	public static void main(String[] args) 
	{
		LinearSR lns=new LinearSR();
		lns.input();
		lns.search();
		lns.display();
	}

}
