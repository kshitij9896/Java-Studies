//program to implement applet

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class DemoApplet extends Applet
{
  public void init()
  {
  Label lbl = new Label("Enter Your Name:");
  TextField txt=new TextField(8);
    add(lbl);
    add(txt); 
  lbl.setBounds(10,10,100,20);
  txt.setBounds(10,20,100,40);
}

public void paint(Graphics g)
 {
 }


}
/*
<applet code="DemoApplet.class" width=350 height=350>
</applet>
*/
  
