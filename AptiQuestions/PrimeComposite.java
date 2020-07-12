import java.io.*;
import java.util.*;

class PrimeComposite
{
	public static void main(String args[])
	{
		int flag=0,i,no;
		
		System.out.println("Enter Any Number...");
		Scanner sc= new Scanner(System.in);
		no = sc.nextInt();
		
		for(i=2;i<no/2;i++)
		{
			if(no%2==0)
			{
				flag=1;
				break;
			}
			
		}

	if(flag==1)
	{
		System.out.println("This is an Composite Number.." + no);
	}
	else
	{
		System.out.println("This is an Prime Number..."+ no);
	}

}
}
	