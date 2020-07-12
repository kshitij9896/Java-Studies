//program to implement stack and queue
import java.util.*;

class Demo
 {
   void StackDemo()
     {
            Stack s=new Stack();
            System.out.println("\n\t Adding Elements in the Stack:"+s.push(10));
            System.out.println("\n\t Adding Elements in the Stack:"+s.push(12));
            System.out.println("\n\t Adding Elements in the Stack:"+s.push(14));
            System.out.println("\n\t All Elements in the Stack:"+s);
            System.out.println("\n\t First element in the Stack "+s.peek());
            System.out.println("\n\t Deleting element from stack:"+s.pop());
            System.out.println("\n\t Deleting element from stack:"+s.pop());
            System.out.println("\n\t All Elements in the Stack:"+s);
            System.out.println("\n\t Checking The Stack List is Empty or not:"+s.empty());
            System.out.println("\n\t Searching for an element in the Stack:"+s.search(14));
        
            Iterator i=s.iterator();
              while(i.hasNext())
               {
                 System.out.println("\n\t All elements in the Stack: "+i.next());
               }
     }
    
        void queueDemo()
        {
           Queue q=new LinkedList();

             for(int i=0;i<5;i++)
             {
                q.offer(i);
             }
            
           System.out.println("\n\t Elements of Queue:"+q);
           System.out.println("\n\t Removed Elements of Queue is:"+q.remove());
           System.out.println("\n\t Elements of Queue is:"+q);
           System.out.println("\n\t Head Element of Queue is:"+q.peek());
           System.out.println("\n\t Size of Queue is:"+q.size());
          
    }
}


 class StackQueue
 {
   public static void main(String args[])
      {
         int ch=1;
          Scanner sc=new Scanner(System.in);
          System.out.println("\n Program to demonstrate Queue and Stack:");
          while(ch!=0)
           {
             System.out.println("\n1.Stack Implementation using Linked List");
             System.out.println("\n2.Queue Implementation using Linked List");
             System.out.println("\n Enter Your Choice:");
             ch=sc.nextInt();
             
            switch(ch)
                {
                   case 1:
                            Demo d=new Demo();
                                 d.StackDemo();
                                   break;
                   case 2:
                            Demo d1=new Demo();
                                  d1.queueDemo();
                                   break;

                  default:
                            System.out.println("Invalid Choice");
                    }
       }
 }
}



 

             