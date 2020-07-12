import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class EmpApplet extends Applet implements ActionListener
{
   Label lbl_name,lbl_address,lbl_gender,lbl_skills,lbl_post,lbl_status;
   TextField txt_name;
   TextArea txt_address;
   CheckboxGroup cg_gender;
   Checkbox male,female,cb_asp,cb_java,cb_js;
   Choice ch_designation;
   Button btn_submit,btn_clear;


   public void init()
  {
     lbl_name= new Label("Name:");
     lbl_address =new Label("Address:");
     lbl_gender =new Label("Gender:");
     lbl_skills =new Label("Skills");
     lbl_post =new Label("Designation");
     lbl_status= new Label();
     txt_name=new TextField(10);
     txt_address =new TextArea(3,10);
     cg_gender =new CheckboxGroup();
     male = new Checkbox("Male",cg_gender,false);
    female=new Checkbox("Female",cg_gender,false);
    
     cb_asp=new Checkbox("Asp.net");
     cb_java=new Checkbox("java");
     cb_js=new Checkbox("JavaScript");
     ch_designation=new Choice();
     ch_designation.add("Project Manager");
     ch_designation.add("Developer");
     ch_designation.add("Tester");
     btn_submit=new Button("Submit");
     btn_clear=new Button("clear");
      setLayout(null);
      add(lbl_name);
      add(lbl_address);
      add(txt_name);
      add(txt_address);
      add(lbl_gender);
      add(male);
      add(female);
      add(lbl_skills);
      add(cb_java);
      add(cb_js);
      add(cb_asp);
      add(lbl_post);
      add(ch_designation);
     add(lbl_status);
   lbl_name.setBounds(10,10,100,20);
   lbl_address.setBounds(10,40,100,20);
   lbl_gender.setBounds(10,90,100,20);
   lbl_skills.setBounds(10,120,100,20);
   lbl_post.setBounds(10,190,100,20);
   txt_name.setBounds(120,10,150,20);
   txt_address.setBounds(120,40,150,40);
    male.setBounds(120,90,60,20);
    female.setBounds(180,90,100,20);
    cb_asp.setBounds(120,120,100,20);
    cb_java.setBounds(120,140,100,20);
    cb_js.setBounds(120,160,100,20);
    ch_designation.setBounds(120,190,120,20);
    btn_submit.setBounds(120,220,80,25);
    btn_clear.setBounds(210,220,80,25);
    btn_submit.addActionListener(this);
    btn_clear.addActionListener(this);
    Color c=new Color(11,137,11);
    lbl_status.setBounds(120,250,180,20);
    lbl_status.setForeground(c);
    add(btn_submit);
    add(btn_clear);
}


public void paint(Graphics g)
 {
    }

public void actionPerformed(ActionEvent e)
  {
    String s=" ";
    if(e.getSource()==btn_submit)
    lbl_status.setText("Record Submitted Successfully");
    else if(e.getSource()==btn_clear)
      {
         lbl_status.setText("");
         txt_name.setText("");
         txt_address.setText(s);
        // lbl_gender.setState(false);
         male.setState(false);
         female.setState(false);
   }

 repaint();
}

}

/*
<applet code="EmpApplet.class" width="350" height="350">
</applet>
*/
      
        