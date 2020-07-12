//program to implement method overloading

class Over
{
   int n1,n2;
  void get(int x)
   {
      n1=x;
    }
   
   void get(int x,int y)
  {
    n1=x;
    n2=y;
  }

   public static void main(String args[])
    {
      System.out.println("\n Program to implement Method Overloading:");
      Over o=new Over();
           o.get(5);
      System.out.println("\n The First Value is:"+o.n1);
      o.get(5,10);
      System.out.println("\n The First and Second values are=:"+o.n1+" "+o.cn2);
}
}