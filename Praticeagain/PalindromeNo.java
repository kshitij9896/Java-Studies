import java.util.*;
class PalindromeNo
{

public static void main(String args[])
{

int num,rev_integer = 0,reminder;

System.out.println("Enter Any Number check its is palindrome or not");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();

while(num!=0)

{

   reminder=num % 10;
   rev_integer = rev_integer * 10 + reminder;
   num /=10;
   

}


if(num==rev_integer){

System.out.println("Entered Number: "+ rev_integer +"  is not a Palindrome Number");
}
else{
System.out.println("Entered Number "+ rev_integer +" is Palindrome no");

}

}





}