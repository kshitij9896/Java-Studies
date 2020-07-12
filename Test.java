import java.io.*;
import java.util.*;

class A
{
  public void show()
   {
     System.out.println("I am inside A"); 
   }
  }

class B extends A
{
  public void show()
   {
     System.out.println("I am Inside B");
    }
}

class C extends A
{
  public void show()
   {
      System.out.println("I am Inside C");
   }
}

class Test
{
  public static void main(String args[])
   {
     A obj;
     B obj1=new B();
     obj=obj1;
     obj1.show();
     A obj3=new A();
       obj3.show();
     C obj2=new C();
     obj=obj2;
     obj.show();
   }
}
         