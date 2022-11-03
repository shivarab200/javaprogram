package problem;

import java.util.Scanner;

public class MaximOfArr {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				{
					max=arr[i];
				}
			
		}
		System.out.println(max);
	}

}
