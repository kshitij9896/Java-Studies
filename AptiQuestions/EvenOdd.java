import java.io.*;
import java.util.*;

class EvenOdd
 {
    void evenodd(int n)
	{
             if(n%2==0)
              {
                  System.out.println("This is an even Number "+ n);
   		}
		else
		{
			System.out.println("This is an odd Number..." +n);
		}
	    }

      public static void main(String args[])
	{
		
		int a;
		EvenOdd e= new EvenOdd();
		System.out.println("Enter A number...");
		Scanner sc=new Scanner(System.in);
		a = sc.nextInt();
		
		e.evenodd(a);
	
	}
}