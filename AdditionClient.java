import java.rmi.*;
import java.net.*;
import java.util.*;

public class AdditionClient
{
  public static void main(String args[])
   {
    try{
	String url="rmi://localhost/Addition";
        Addition1 obj=(Addition1)Naming.lookup(url);
        System.out.println("Enter First Number");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Enter Second Number");
       int n2=sc.nextInt(); 
	System.out.println("Addtion"+obj.add(n1,n2));

    }

   catch(Exception e)
{
   System.out.println(e);
}

  }
  

}
