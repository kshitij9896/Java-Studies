import java.io.*;
import java.util.*;

class EvenOdd

{

int no;

public static void main(String args[])

{

 System.out.println("Enter Any Number To check Even or Odd");
 int no=Integer.parseInt(args[0]);
 EvenOdd s=new EvenOdd();
  s.evenodd();



}



void evenodd()
{

if(no%2==0)
{
System.out.println("The Number is Odd...");

}
else
{

System.out.println("The Number is Even");

}



}

}