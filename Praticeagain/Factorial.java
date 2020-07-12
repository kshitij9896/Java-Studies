import java.io.*;
import java.util.*;


class Factorial
{

public static void main(String args[])
{

        System.out.println("Program To Calculate Factorial of Numbers...");
	Factorial F=new Factorial();
        F.fact();	

}

void fact()
{
System.out.println("Enter any Number...");
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();

long fact=1;

for(int i=1;i<=no;i++)
{
   fact=fact*i;

}

System.out.println("factorial Of Number is" +fact);
}



}