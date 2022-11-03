package problem;

import java.util.Scanner;

public class MinOfTheArr {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
				{
					min=arr[i];
				}
			
		}
		System.out.println(min);
	}

}
