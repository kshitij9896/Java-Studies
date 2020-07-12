//program to implement likedlist and hash set

import java.util.*;

class Demo
{
   void linkedDemo()
    {
       LinkedList<String>l=new LinkedList<String>();
       l.add("ab");
       System.out.println("\n\t Elements of Linked List is:"+l);
       l.addFirst("cd");
       System.out.println("\n\t Add First Elements of LinkedList is"+l);
       l.add(0,"ef");
       System.out.println("\n\tAdd elements of 0th position:"+l);
       l.addLast("gh");
       System.out.println("\n\tAdd Last elements of linked list"+l);
       l.remove("cd");
       System.out.println("\n\tRemoving specified elements of linked list"+l);
       l.removeLast();
       System.out.println("\n\tRemoving Last elements of Linked list"+l);
       System.out.println("\n\tElements of specified position "+l.get(0));
       ListIterator lt=l.listIterator();
       System.out.println("\n\t Elements of Linked list are:\n");
       System.out.println("\t\t\t\t");
       while(lt.hasNext())
        { 
           System.out.println(" "+lt.next());
          }

        System.out.println("\n\t");  
        System.out.println("\n\t Previous Elements of linked lists are:\n");
        System.out.println("\t\t\t\t");
         while(lt.hasPrevious())
           {
               System.out.println(" "+lt.previous());
              }

         System.out.println("\n\t");
   }



  void hash()
  {

         HashSet s=new HashSet();
                s.add("j");
          System.out.println("\n\t Adding First elements in Hashset:"+s);    
                     s.add("i");
          System.out.println("\n\t Adding Second elements in Hashset:"+s); 
                     s.add("t");
          System.out.println("\n\t Adding Third elements in Hashset:"+s);
                     s.add("i");
         System.out.println("\n\t Adding fourth elements in Hashset:"+s);
                      s.add("h");
         System.out.println("\n\t Adding Fifth elements in Hashset:"+s);
                      s.add("s");
         System.out.println("\n\t Adding SecondLast elements in Hashset:"+s);
                     s.add("K");
         System.out.println("\n\t Adding Last elements in Hashset:"+s);
         System.out.println("\n\t Total length of elements in Hashset:"+(s.size()));
                 Iterator l=s.iterator();
                while(l.hasNext())
               {       
                  System.out.println(l.next());
                    }

  }
}

class LinkHash
{

   public static void main(String args[])
        {
           int ch=1;
           Scanner sc=new Scanner(System.in);
           System.out.println("");
           while(ch!=0)
            {

                System.out.println("\n 1.Linked List Implementation");
                System.out.println("\n 2.Hash Set class implementation");
                 System.out.println("\n Enter Your Choice:");  
                          ch=sc.nextInt();
        
                switch(ch)
                      {


                         case 1:
                                  Demo d=new Demo();
                                  d.linkedDemo();
                                   break;
                         case 2:
                                  Demo d1=new Demo();
                                  d1.hash();
                                  break;
                        default:
                                  System.out.println("\n Invalid choice");
                           }
                }
 }
}
   
   
