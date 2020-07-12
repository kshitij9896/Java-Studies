
import java.util.*;

class Palindrome
{
  public static void main(String args[])
   {
     String a,reverse="";
      Scanner in=new Scanner(System.in);

System.out.println("Enter a String to check if it is a palindrome");
a=in.nextLine();

int length = a.length();

for(int i=length-1;i>=0;i--)
{
reverse=reverse+a.charAt(i);

}
if(a.equals(reverse))
  {
  System.out.println("Entered String is a Palindrome.");
  }
else
  {
  System.out.println("Entered String is not a Palindrome");
  }


} 
} 