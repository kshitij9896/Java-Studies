package Bank;

public class Bank1
 {
    public  double balance=250000;
   
  public void withdraw(double b)

    {
    if(balance<0)
    {
      System.out.println("\n Insufficient Balance:");
    }
   else
    {
        balance=balance-b;
        System.out.println("\n Current Balance is"+balance);
      }
}

    public void deposite(double b)
     {
        balance=balance+b; 
      System.out.println("\n Current Balance is:"+balance);

    }

     }

    