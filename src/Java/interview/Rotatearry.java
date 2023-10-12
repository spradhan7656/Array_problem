package Java.interview;

import java.util.*;
public class Rotatearry 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of arry");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the data");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the no.of rotation");
		int k=sc.nextInt();
		
		
		
		approch1(arr,k);
		System.out.println("\n");
		approch2(arr,k);
		System.out.println("\n");
		approch3(arr,k);
		
	}
	public static void approch1(int arr[],int k)
	{
		if(k>arr.length)
		{
			k=k%arr.length;
		}
		int result[]=new int [arr.length];
		for(int i=0;i<k;i++)
		{
			result[i]=arr[arr.length-k+i];
		}
		int j=0;
		for(int i=k;i<arr.length;i++)
		{
			result[i]=arr[j];
			j++;
		}
		//System.arraycopy(result,0,arr,0,arr.length);
		for(int i:result)
		{
			System.out.print(i+" ");
		}
		//time =O(n)
		//space=O(n)
		//Intermediate rotate
	}
	public static void approch2(int []arr,int k)
	{
		for(int i=0;i<k;i++)
		{
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	//time=O(n*k)
	//space=O(1)
	//Bubble Rotate
	public static void approch3(int []arr,int order)
	{
		if (arr == null || arr.length==0 || order < 0) 
		{
			throw new IllegalArgumentException("Illegal argument!");
			}
				if(order > arr.length)
				{
					order = order %arr.length;
				}
				int a = arr.length - order;
				reverse(arr, 0, a-1);
				reverse(arr, a, arr.length-1);
				reverse(arr, 0, arr.length-1);
				for(int i:arr)
					System.out.println(i+" ");
			}
			
	
			public static void reverse(int[] arr, int left, int right)
			{
				if(arr == null || arr.length == 1)
				return;
				while(left < right)
				{
					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left++;
					right--;
				}
			}
//			Can we do this in O(1) space and in O(n) time? The following solution does.
//					Assuming we are given 1,2,3,4,5,6 and order 2. The basic idea is:
//					1. Divide the array two parts: 1,2,3,4 and 5, 6
//					2. Reverse first part: 4,3,2,1,5,6
//					3. Reverse second part: 4,3,2,1,6,5
//					4. Reverse the whole array: 5,6,1,2,3,4
			
}
