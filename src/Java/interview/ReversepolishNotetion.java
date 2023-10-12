package Java.interview;

import java.util.*;
public class ReversepolishNotetion 
{
	public static void main(String[] args)
	{
		System.out.println("enter the element");
		String s[]=new String[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			s[i]=sc.next.CharAt(0);
		}
		evaluationRPN(s);
		
	}
	
	public static void evaluationRPN(String[] s)
	{
		for(String s2:s) {
			System.out.println(s2);
			
		}
	}
}
