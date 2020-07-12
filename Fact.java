import java.applet.*;
import java.awt.*;

public class Fact extends Applet
  {
      TextField text1;
        public void init()
         {
            text1=new TextField(10);
               add(text1);
            text1.setText("0");
          }

  public void paint(Graphics g)
  {

    int x=0;
    String s1;
    Label lbl1=new Label("Enter any number");
     lbl1.setBounds(20,40,100,20);
       try
           {
             s1=text1.getText();
             x=Integer.parseInt(s1);
             }

      catch(Exception e)
  {
}

     int fact=1;

    for(int i=1;i<=x;i++)
    {

          fact=fact*i;
     }


   String s=" "+String.valueOf(fact);
   Label lbl =new Label("The Factorial is");
    g.drawString(s,100,90);
   
    add(lbl);
    lbl.setBounds(50,50,100,20);
     }
  
   public boolean action(Event event,Object object)
   {
      repaint();
       return true;
   }
}

/*
<applet code="Fact.class" width=300 height=200>
</applet>
*/




