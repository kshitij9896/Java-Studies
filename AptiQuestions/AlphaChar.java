import java.io.*;
import java.util.*;

class AlphaChar
{
  public static void main(String args[])
	{
		int a,b,i,k,count=0;
		a = 48;
		b=57;
		k=0;
		int j=0;
                String st[]=new String[100];
		System.out.println("Enter Any String");
		Scanner in = new Scanner(System.in);
		st=in.nextLine();

		

		
	while(a>=b)
	{
		for(i=0;i<=k;i++)
		{
			if(st[i] == "a")
			{
			 j= j+(st[i] - '0');
			}
		} a++;
	}
 System.out.println("The Addition of All aplhanumeric is"+ j);	
	

}
}   