import java.io.*;
import java.util.*;

interface Bank
 {

     String Bname="Bank of Maharashtra";
     String actype="saving";
     String location="kop";
    int IFSC=1223;
     public void get();
     public void show();
  }

interface Customer
{
  double no=0;
  void data();
  void disp();
 }


class Account implements Bank,Customer
 {
    public void get()
     {
       System.out.println("Bank Details are");
      }

      public void show()
       {
          System.out.println("Bank Name" +Bname);
          System.out.println("Account Type" +actype);
          System.out.println("Locality of Bank "+location);
          System.out.println("IFSC code of bank:"+IFSC);
     }
     public void data()
     {
        System.out.println("");
        System.out.println("Person Details are:");
   }

   public void disp()
  {
      String nm;
      String add;
      double no;
          Scanner sc=new Scanner(System.in);

     System.out.println("Enter Name:");
          nm=sc.nextLine();
     System.out.println("Enter add:");
             add=sc.nextLine();   
          System.out.println("Enter Acno:");
          no=sc.nextDouble();
               
                         

      System.out.println("Ac no:"+no);
      System.out.println("Name of the Account Holder:"+nm);
      System.out.println("Address:"+add);
   }

}
class Acc
{
   public static void main(String args[])
   {
    Account ac=new Account();
         ac.get();
         ac.show();
         ac.data();
         ac.disp();
}
 }   
  