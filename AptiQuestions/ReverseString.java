//program to implement reverse of a given no using simple class

import java.io.*;
import java.util.*;

class ReverseString
{
  public static void main(String args[])
   {
     int num;
     System.out.println("\n Enter number to be reversed:");
      Scanner sc=new Scanner(System.in);
       num=sc.nextInt();     
     int rev=0;
     int rem;
        System.out.println("\n Program to display Reverse of a given no");
        System.out.println("\n The number to be reversed is :"+num);
        while(num!=0)
         {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
           }

  System.out.println("The Reverse of a given No is:"+rev);
  }
}
 