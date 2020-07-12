//program to implement single inheritance

class First
 {
    void data()
     {
     System.out.println("Inside First class");
     }
  }

class Second extends First
 {
   void get()
   {
      super.data();
      
    System.out.println("Inside Second class");
}
public static void main(String args[])
  {
     Second s=new Second();
            s.get();
  }
}
    