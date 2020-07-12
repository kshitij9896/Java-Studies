//program for abstract class

import java.io.*;

abstract class Shape
 {
   abstract void area(double a,double b);
}

class Rectangle extends Shape
{
  void area(double a,double b)
   {
    System.out.println("\n Area of Rectangle is: "+(a*b));
   }
}

 class Traingle extends Shape
 {
   void area(double a,double b)
    {
      System.out.println("\n Area of Traingle is: "+(0.5*a*b));
     }
}

class Test3
{
  public static void main(String args[])
    {
       Shape s;
       Rectangle r=new Rectangle();
       Traingle t=new Traingle();
       s=r;
       s.area(3,4);
       s=t;
       s.area(5,6.2);
   }
}
 


     

 