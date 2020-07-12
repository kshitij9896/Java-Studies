//Program to implement Multilevel Inheritance
import java.io.*;
import java.util.*;

interface Person
 {

   void get();
   void disp();

 }


class Student implements Person
{
 public  void get()
   {
     System.out.println("Student Information");
  }

  public void disp()
  {   
      String name;
      String add;
      int rollno;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Student Name:");
        name=sc.nextLine();
      System.out.println("Enter Student Address:");
        add=sc.nextLine();
      System.out.println("Enter Student Roll no:");
        rollno=sc.nextInt();

      System.out.println("Student name is "+ name);
      System.out.println("Student address is "+add);
      System.out.println("Student rollno is "+rollno);

   }

}

class Employee implements Person
 {
   public  void get()
     {
       System.out.println("Employee Information");
     }

 public  void disp()
     {
    
  
      String name;
      String add;
      int empid;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Employee Name:");
        name=sc.nextLine();
      System.out.println("Enter Employee Address:");
        add=sc.nextLine();
      System.out.println("Enter Employee Id:");
        empid=sc.nextInt();

      System.out.println("Employee name is "+ name);
      System.out.println("Employee address is "+add);
      System.out.println("Employee Id is "+empid);

   }
}



class Test1
 {
    public static void main(String args[])
    {
        Student s=new Student();
        Employee e=new Employee();
                s.get();
                s.disp();
                e.get();
                e.disp();
}
}
   