import java.io.*;
import java.util.*;


class ArithmaticCal
{

int add(int a,int b)
{
	return (a+b);
}

int sub(int a,int b)
{
	return (a-b);
}

int mul(int a,int b)
{

	return (a*b);
}
int div(int a,int b)
{
   
	return (a/b);
}

public static void main(String args[])
    {
  		int n1,n2;
	
	int choice = 1;
   	ArithmaticCal A = new ArithmaticCal();
   	System.out.println("\n\t\t\t\t\t\t Program for arithamtic operations...");
   	Scanner sc=new Scanner(System.in);




   

  while(choice!=0)
	{
System.out.println("\n\t\t\t\t\t\t\t******* Calculator ********");
System.out.println("\n\t\t\t\t\t\t\t 1.Addition");
 System.out.println("\n\t\t\t\t\t\t\t 2.Subtraction");
 System.out.println("\n\t\t\t\t\t\t\t 3.Multiplication");
 System.out.println("\n\t\t\t\t\t\t\t 4.Divison");
      System.out.println("\n Enter 1st Number....");
 	        n1 = sc.nextInt();
     System.out.println("\n Enter 2nd Number...");
     	        n2 = sc.nextInt();


      System.out.println("\n Enter Your Choice");
    
         choice = sc.nextInt(); 
  

	   switch(choice)
		{

 	  	default:
        	            System.out.println("\n Wrong Choice!!!!Please Enter again");
                                        break; 


      		 case 1:        
                                  
   				System.out.println("\n Addition is " + A.add(n1,n2));
   					break;
     
    		  case 2:
    		            	 System.out.println("\n Subtraction is " + A.sub(n1,n2));
    					break;

	          case 3:
	            	        System.out.println("\n Multiplication is " + A.mul(n1,n2));
		   		         break;	

	          case 4: 
                                    System.out.println("\n Division is " + A.div(n1,n2));
	        			  break;
      		


	}
     }




   }

}