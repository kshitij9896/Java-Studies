import java.io.*;
import java.util.*;

class LCM
{

public static void main(String args[])
{
     int n1,n2;  
     System.out.println("\n********Program To LCM Find LCM of Two Numbers.*******");
     System.out.println("Enter Two Numbers...");
     Scanner sc=new Scanner(System.in);
     n1=sc.nextInt();
     n2=sc.nextInt();


 int minNumber;
 minNumber = (n1>n2) ? n1:n2;

      int i=0;

 do
 {
    if(minNumber%n1 == 0 && minNumber%n2 == 0)
	{

          System.out.println("The LCM of Two numbers is : " +minNumber);
          break;
         }

 }while(i<minNumber) ;
 ++minNumber;

}
}
