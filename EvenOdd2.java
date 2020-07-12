import java.util.*;

class EvenOdd2

{

int no;
public static void main(String args[])
{

System.out.println("Program for even odd...");
System.out.println("Enter Any Number...");
int no=Integer.parseInt(args[0]);
EvenOdd2 e=new EvenOdd2();
e.check();



}

void check()
{

if(no%2==0)
{
System.out.println("This is Odd number");


}
else
{

System.out.println("this no is even");
}


}








}