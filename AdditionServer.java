import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

interface Addition1 extends Remote
{
int add(int x,int y)throws RemoteException;
}

class Addition extends UnicastRemoteObject implements Addition1
{
Addition()throws RemoteException
{
 System.out.println("Server Started");

}
public int add(int x,int y)
{
  
 return(x+y);
}
}

public class AdditionServer
{

public static void main(String args[])
{

 try{

     Addition obj=new Addition();
     Naming.rebind("rmi://localhost/Addition",obj);

}

catch(Exception e)
{
  System.out.println(e);
}

}



}