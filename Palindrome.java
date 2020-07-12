//program to check string is palindrome or not

import java.util.*;

class Palindrome
{
  public static void main(String args[])
   {
      String a,reverse="";
      Scanner sc=new Scanner(System.in);
      System.out.println("\n Enter a String to check it is Palindrome or not:");
       a=sc.nextLine();
      int length=a.length();
      for(int i=length-1;i>=0;i--)
       {
          reverse=reverse+a.charAt(i);
       }
 
       if(a.equals(reverse))
        {
          System.out.println("\n Entered String is Palindrome:");
        }
        
       else
         {
            System.out.println("\n Entered String is not a Palindrome:");

        }

  }
}
   