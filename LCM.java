//program to find LCM of two no using cmd.buffered reader,scanner
import java.io.*;
import java.util.*;

class LCM
 {

 void get()
{        
       
            while(ch!=0)
      {
        System.out.println("\n\t 1.LCM using CMD:");
        System.out.println("\n\t 2.LCM using Buffered Reader: ");
        System.out.println("\n\t 3.LCM using Scanner:");
        System.out.println("\n\t Enter Your Chioce:");
          
             ch=sc.nextInt();
        
         switch(ch)
           {
              case 1:
                                int ch=1,lcm;
      System.out.println("\n program to find LCM of two no using cmd,buffered reader,scanner");
          int n1,n2;
    System.out.println("\n Enter Two numbers:"); 
      Scanner sc=new Scanner(System.in);  
         n1=sc.nextInt();
         n2=sc.nextInt();

                               lcm=(n1>n2)?n1:n2;
                          while(true)
                             {
                                if(lcm % n1==0 && n2 ==0)
                                   {
                                      System.out.printf("The LCM of %d and %d is",n1,n2,lcm);
                                        break;
                                     }
                                       ++lcm;
                                   }
                                         break;
                               
              case 2:     
                           lcm=(n1>n2)?n1:n2;
                          while(true)
                             {
                                if(lcm % n1==0 && n2 ==0)
                                   {
                                      System.out.printf("The LCM of %d and %d is",n1,n2,lcm);
                                        break;
                                     }
                                       ++lcm;
                                   }
                                    break;
                          
              case 3:
                          lcm=(n1>n2)?n1:n2;
                          while(true)
                             {
                                if(lcm % n1==0 && n2 ==0)
                                   {
                                      System.out.printf("The LCM of %d and %d is",n1,n2,lcm);
                                        break;
                                     }
                                       ++lcm;
                                   }
                          
                                  break;
                 
        default:
                 System.out.println("\n Invalid choice:");
            }
   }
}
} 
                        
}
 class LCM2
   {
     public static void main(String args[])
      {
             LCM2 l=new LCM2();
                  l.get();
       }
 }
 
         
