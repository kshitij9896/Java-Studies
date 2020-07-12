import java.io.*;
import java.util.*;

class TryCatch
{

	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("Enter Two Numbers");
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
			
		try{
			c=a/b;
			System.out.println("The Answer is "+a/b);	
	
		//System.out.println("This Block Will Raise an Exception");
		}
		catch(Exception ex)
		{
			System.out.println("\n Division by Zero for any Number is not Possible" + ex);
		}
		finally

		{
			System.out.println("This Finally Block will execute");
		}
	}
}
		