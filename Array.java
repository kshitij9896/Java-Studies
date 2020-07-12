//program to display maximum no in agiven array

import java.util.*;

class Array
{
  public static void main(String args[])
   {
     int n,i,maximum;
     System.out.println("Program to display Maximum no in a given array:");
     Scanner sc=new Scanner(System.in);
     System.out.println("\n Enter The size of an array:");
     n=sc.nextInt();
     int a[]=new int[n];
    System.out.println("\n Enter Array Elements:");
  for(i=0;i<n;i++)
   {
      a[i]=sc.nextInt();
   }

   maximum=a[0];
  for(i=0;i<n;i++)
   {
        if(maximum<a[i])
        { 
          maximum=a[i];
         }
   }

  System.out.println("\n Array Elements are:");
  for(i=0;i<n;i++)
   {
    System.out.println(" "+a[i]);
   }
  System.out.println("\n Maximum value of an element is:"+maximum);
 }
}

  