//Barbara Omukhango
//CIS-1-2544-2/2016

//importing frameworks from Java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assignment extends JFrame implements ActionListener
  {
  JLabel l1,l2,l3;
  JButton b1;
  JTextField txt1,txt2,txt3;
  
  //Creation of constructor
  Assignment()
  {
  l1=new JLabel("First Number");
  l2=new JLabel("Second Number");
  l3=new JLabel("Answer goes here");
  b1=new JButton("Calculate");
  
  txt1=new JTextField(10);
  txt2=new JTextField(10);
  txt3=new JTextField(10);
  
  add(l1);
  add(txt1);
  add(l2);
  add(txt2);
  add(l3);
  add(txt3);

  add(b1);
  
  b1.addActionListener(this);
  
  setSize(200,200);
  setLayout(new FlowLayout());
  
  }
  //implementation of active Listener
   public void actionPerfomed(ActionEvent ae)
     {
      float a,b,sum;
      if (ae.getSource()==b1)
       {
        a=Float.parseFloat(txt1.getText());
        b=Float.parseFloat(txt2.getText());
        sum=a+b;
        txt3.setText(String.valueOf(sum));
        
       }
    }
    
    public static void main(String[]args)
    { 
      Assignment a=new Assignment();
      a.setVisible(true);
      a.setLocation(300,300);
    }
 }