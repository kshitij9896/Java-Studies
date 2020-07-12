//Program to find greatest common divisor of two numbers

import java.io.*;
import java.util.*;

class GCD
{
	public static void main(String args[])
	{
		int n1,n2,small;
		System.out.println("Enter Two Numbers...");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		small = n1>n2 ? n1:n2;
		
		for(int i=small;i>=1;i--)
		{
			if((n1%i ==0) && (n2%i ==0))
			{
				System.out.println("GCD of given two number is " + small);
				break;
			}
		}
}
}
	
		
		
