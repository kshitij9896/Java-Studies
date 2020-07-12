//program to implement Vector and Hash Table class
import java.util.*;

class Demo
 {
   void vector()
      {
         Vector v=new Vector(20);
          v.addElement(10);  //adding firsts
          v.add(12);
          v.add(14);
          v.addElement(8);    //last element
          v.removeElementAt(2); //deleting element
          System.out.println("\n All Elements are:");
          System.out.println(v);
          System.out.println("\n The First Elements is:"+v.firstElement());
          System.out.println("\n The Last Elements is"+v.lastElement());
          System.out.println("\n The Total Capacity:"+v.capacity());
          System.out.println("\n All Elements are:\n");

           Iterator i=v.iterator();
             while(i.hasNext())
              {
                 System.out.println(i.next());
                }
          }
  
    void hash()
     {
          Hashtable<Integer,String> h=new Hashtable<Integer,String>();
                  h.put(1,"Kshitij");
                  h.put(2,"Kiran");
                  h.put(3,"Tejas");
                  h.put(4,"Omkar");
              System.out.println("\n All Elements are:"+h);
              System.out.println("\n Getting Third Element"+h.get(3));
              System.out.println("\n Removing an element:"+h.remove(1));
               System.out.println("\n Contain Key Elements Value:"+h.containsKey(2)); //checking 2nd position 

              System.out.println("\n The Remaining Elements are....");
                for(Map.Entry m:h.entrySet()) 
                  {
                      System.out.println(m.getKey()+" "+m.getValue());
                    }
   }
}

class HashVector
  {
      public static void main(String args[])
         {
            int ch=1;
            Scanner sc=new Scanner(System.in);
            while(ch!=0) 
             {
               
                System.out.println("\n 1.Vector Class Implemtation");
                System.out.println("\n 2.Hash Table Implementation");
                System.out.println("\n Enter Your Chioce:");
                     ch=sc.nextInt();
             
              switch(ch)
                  {
                        case 1:
                                Demo d=new Demo();
                                   d.vector();
                                    break;
                 
                          case 2:
                                Demo d1=new Demo();
                                   d1.hash();
                                    break;
                        default:
                                  System.out.println("\n Invalid Choice");
       }
 }
 }
}

 
                       
    
                 
                     
           