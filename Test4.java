//program to implement Interface

interface Shape
{
    float pi=3.14f;
   void area();
   void disp();
}

class Rectangle implements Shape
{
   public void area()
    {
      float a=5,b=6.2f;
      System.out.println("\n Area of Rectangle is:"+(a*b));
   }

  public void disp()
   {
      System.out.println("\n Display of rectangle");
   }
}

class Circle implements Shape
{
   public void area()
   {
    float r=5;
    System.out.println("\n Area of Circle is"+(pi*r*r));
  }

  public void disp()
  {
   System.out.println("\n Display of Circle");
  }
}

class Test4 
{ 

 public static void main(String args[])
  {
     Rectangle r=new Rectangle();
     Circle c=new Circle();
            r.area();
            r.disp();
            c.area();
            c.disp();
  }
}
   
  