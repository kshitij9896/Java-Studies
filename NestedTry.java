//program to demonstrate nested try block

import java.io.*;

class NestedTry
 {
  public static void main(String args[])
    {
      try 
         {
            int x[]=new int[2];
            System.out.println("This is an Exception...");
            //   x[5]=5;
             
           try
              {
                  int d=0;
                  int a=100/d;
                  //System.out.println("\n This block will not execute:");
              }
       
            catch (ArrayIndexOutOfBoundsException ex)
              {
                      System.out.println(ex);
                }
  }
         
            catch(ArithmeticException ex)
              {
                 System.out.println(ex);
            }
 
         finally
           {
              System.out.println("This block will always Executes:");
             }
 }
 }
