//program to create Multiple threds

import java.util.*;

class Even extends Thread
{
   int a,b;
   Even(int n1,int n2)
     {
         a=n1;
         b=n2;
     }
 
  
  public void run()
 {
    try
      {
 
          System.out.println("The Even Numbers are:\n");
              for(int i=a;i<=b;i++)
              {
                   if(i%2==0)
                    {

                          System.out.println(i);
                     }
                 }
   }


 catch(Exception e)
 {
     System.out.println(e);
  }
 }
}
 

class Odd extends Thread
 {
   int a,b;
     Odd(int n1,int n2)
      {
          a=n1;
          b=n2;
       }

       public void run()
        {
          try
            {
              System.out.println("\n The Odd Numbers are:");
               for(int i=a;i<=b;i++)
                 {
                    if(i%2!=0)
                       {
                           System.out.println(i);
                        }
                   }
               }
 catch(Exception ex)
 {
   System.out.println(ex);
 }

}
}

 

class EvenOdd
{
  public static void main(String args[])
    {
       int no1,no2;
        System.out.println("\n Program to display Eveb odd in the given range:");
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter The Upper Limit:");
          no2=sc.nextInt();
        System.out.println("\n Enter The Lower Limit:");
          no1=sc.nextInt();
         Even e=new Even(no1,no2);
              e.start();
         Odd o=new Odd(no1,no2);
              o.start();
    }
}
       