//Program to find LCM of given two number

import java.io.*;
import java.util.*;
	
class LCM
{
    public static void main(String args[])
	{
		int n1,n2,minNumber;
		System.out.println("Enter Two Numbers...");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		minNumber =  n1>n2 ? n1:n2;
		for(int i=minNumber;i>=1;i++)
		{
			if((minNumber%2==0) && (minNumber%2==0))
			{
				System.out.println("The LCM of given two number is"+ minNumber);
				break;
				}
		
			++minNumber;
		}

}
}
				
	
		 