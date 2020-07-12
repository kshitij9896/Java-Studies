//Using this keyword

public class Example
{

   private int x;             //instace variable 
  public Example(int x)        //local variable

    {

       this.x=x;
    }

   public void show()
   {
     int x=21;                       //local variable
     System.out.println(this.x);
   }

public static void main(String args[])
 {
       Example e=new Example(10);
               e.show();
}
}


//This keyword is used for to use the same value of the instace variable not the local variable
//ina above code the x in the constructor is local variable and the private variable is the instance vraible