package array;
import java.util.*;
public class ArrayDeepCopy {

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,};
		int[] arr1=arr.clone();
		
		System.out.println("Elements of clone array: ");
		System.out.println(arr1[0]+","+arr1[1]+","+arr1[2]+","+arr1[3]+","+arr1[4]);

    }
}
