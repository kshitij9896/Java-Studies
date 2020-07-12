import java.io.*;
import java.util.*;

class Palindrome
{

  public static void main(String args[])
{
	int number,rev_integer=0,digit;
	System.out.println("Enter A Number");
	Scanner sc= new Scanner(System.in);
	number=sc.nextInt();
	int n = number;

        do{
		digit = number%10;
		rev_integer = (rev_integer * 10) + digit;
		number = number/10;
	}while(number!=0);
	
	
	if(n==rev_integer)
	{
		System.out.println("This is an palindrome Number...");
	}
	else
	{
		System.out.println("This is not an palindrome number...");
	}
}
}
			