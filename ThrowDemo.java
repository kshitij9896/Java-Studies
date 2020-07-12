//program to create user defined exceptions

import java.util.*;

class MyException extends Exception
{
   MyException(String s)
    {
         super(s);
     }
}

class ThrowDemo
 {
    public static void main(String args[])
      {
           int wt;
           System.out.println("\n\t Enter Your Weight:");
           Scanner sc=new Scanner(System.in);
            wt=sc.nextInt();
            
          try
           {
              if(wt<50)
                 {
                      throw new MyException("You can not donate blood:");
                  
                    }
              else
               {
                 System.out.println("\n\t Welcome to Blood Bank");
                }
           
            }
  
        catch(MyException e)
          {
             System.out.println(e);
           }
}
}
    