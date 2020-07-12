//Program for abstract class

import java.io.*;


abstract class Mobile
 {
   abstract void company();
    abstract void camera();
    abstract void price();
 }

 class Sony extends Mobile
 {
  
   void company() 
   {
       System.out.println("Sony Mobiles");
       System.out.println("Model name: Sony Experia XZ2");
   }
   
  void camera()  
    {

      System.out.println("Camera Specification");
      System.out.println("Camera Main Type: 19 MP");
      System.out.println("Front camera :16mp");
      System.out.println("Flash Suppourt: YES");
   }


  void price()
 {
   System.out.println("Price:49,000");
  }

}
  class Asus extends Mobile
  {
      void company() 
   {
       System.out.println("Asus Mobiles");
       System.out.println("Model name: Asus Zenfone Max Pro M1");
   }
   
  void camera()  
    {

      System.out.println("Camera Specification");
      System.out.println("Camera Main Type: 16+5 Dual");
      System.out.println("Front camera : 16 mp");
      System.out.println("Flash Suppourt: YES");
   }


  void price()
 {
   System.out.println("Price:15,000");
  }


}


class Mobile2
{
   public static void main(String args[])
    {
       Sony s=new Sony();
       Asus a=new Asus();
       s.company();
       s.camera();
       s.price();
       a.company();
       a.camera();
       a.price();
  }
}
           