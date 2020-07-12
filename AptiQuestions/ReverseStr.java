import java.io.*;
import java.util.*;

class ReverseStr
{
  public static void main(String args[])
	{
		String reverse="";
		System.out.println("\n Enter Any String....");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			 reverse = reverse +  str.charAt(i);	
		
		}
				
		
	  System.out.println("The Reverse of Given String is "+ reverse);
	
	}
}		