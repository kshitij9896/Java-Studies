ss//program to find LCM of two no using cmd.buffered reader,scanner
import java.io.*;
import java.util.*;

class LCM
 {
 void get()
{
 
           int ch=1,lcm;
      System.out.println("\n program to find LCM of two no using cmd,buffered reader,scanner");
          int n1,n2;
    System.out.println("\n Enter Two numbers:"); 
      Scanner sc=new Scanner(System.in);
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
                              Scanner sc=new Scanner(System.in);  
			         n1=sc.nextInt(args[0]);
       				  n2=sc.nextInt(args[1]);

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

 class LCM2 extends LCM
   {
     public static void main(String args[])
      {
           LCM2 l=new LCM2();
                l.get();   
      }
 }
 
         
