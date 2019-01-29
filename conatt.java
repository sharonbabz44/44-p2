//Name: BARBARA SHARON OMUKHANGO
//REG. NO. CIS-1-2544-2/2016

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class conatt extends JFrame implements ActionListener
   {
      //declare the variables for the components
      JPanel panel1,panel2,panel3,panel4;
      JLabel reg, time;
      JTextField field1,field2;
      JButton record;
      JComboBox courses, purpose;
      JRadioButton male, female;
      JMenuBar bar;
      JMenu flag, help;
      JMenuItem needsCounseling, followUp, exit;
      DefaultTableModel model;
      JTable details;
      
      //constructor where the GUI layout is defined
      conatt()
         {
            setTitle("Consultation Hours");
            setSize(900,900);
            setLayout(new GridLayout(4,1));
            
            //create string array for the courses
            String pursuit[]={"BBIT", "BCIS","DCIS", "DBIT"};
            //create string array for purpose
            String reason[]={"Missing marks", "Clas Attendance", "Research Projects", "Internship", "Technical skills"};
            
            //create objects  for each component
            panel1=new JPanel();
            panel2=new JPanel();
            panel3=new JPanel();
            panel4=new JPanel();
            
            //assign courses and pupose to drop down menu
            courses=new JComboBox(pursuit);
            purpose=new JComboBox(reason);
            
            reg=new JLabel("REGISTRATION NUMBER");
            time=new JLabel("CONSULTATION TIME");
            
            field1=new JTextField();
            field2=new JTextField();
            
            record=new JButton("RECORD");
            
            male=new JRadioButton("Male");
            female=new JRadioButton("Female");
            
            bar=new JMenuBar();
            flag=new JMenu("FLAG");
            help=new JMenu("HELP");
            needsCounseling=new JMenuItem("Counseling");
            followUp=new JMenuItem("Follow Up");
            exit=new JMenuItem("Exit Window");
            
            //create table
            model=new DefaultTableModel();
            details=new JTable(model);
            
            model.addColumn("Reg. No");
            model.addColumn("Course");
            model.addColumn("Purpose");
            model.addColumn("Time");
            
            //Assign Layouts to panels
            panel1.setLayout(new GridLayout(3,1));
            panel2.setLayout(new FlowLayout());
            panel3.setLayout(new GridLayout(2,1));
            panel4.setLayout(new FlowLayout());
            
            JScrollPane sp=new JScrollPane(details);
            
            //Group the radio buttons
            ButtonGroup group=new ButtonGroup();
            group.add(male);
            group.add(female);
             
            //Add Components to panels
            panel1.add(reg);
            panel1.add(field1);
            panel1.add(male);
            panel1.add(female);
            
            panel2.add(courses);
            panel2.add(purpose);
            
            panel3.add(time);
            panel3.add(field2);
            panel3.add(record);
            
            panel4.add(sp);
            // add panels to frame
            add(panel1);
            add(panel2);
            add(panel3);
            add(panel4);
            
            //Register listener to combo Boxes,buttons and menus
            courses.addActionListener(this);
            purpose.addActionListener(this);
            
            needsCounseling.addActionListener(this);
            followUp.addActionListener(this);
            
            male.addActionListener(this);
            female.addActionListener(this);
            
            record.addActionListener(this);
            exit.addActionListener(this);
            
            //add menu and menu items
            flag.add(needsCounseling);
            flag.add(followUp);
            help.add(exit);
            bar.add(flag);
            bar.add(help);
            setJMenuBar(bar);
            
            //set the frame visible           
            setVisible(true);        
                         
            WindowListener wl=new ClosingWindow();
            addWindowListener(wl);
            
         }
         
            public void actionPerformed(ActionEvent ae)
              {
               //fetch the string value from the fields
               String fd=field1.getText();
               String t1=field2.getText();
               
                //fetch the selected course from the 2 combo boxes
                String unit=(String) courses.getSelectedItem();
               String purp=(String) purpose.getSelectedItem();
               

               if(ae.getSource()==record)
                  {
                    //populating the table
                    model.addRow(new String[]{fd,unit,purp,t1});
                  }
               if (ae.getSource()==needsCounseling)
                   {
                    JOptionPane.showMessageDialog(null, "This student needs to see a counselor ASAP");
                   } 
               if (ae.getSource()==followUp)
                   {
                    JOptionPane.showMessageDialog(null, " You better do a follow up on this one");
                   }
               if (ae.getSource()==exit)
                  {
                    System.exit(0);
                  }      
               if (ae.getSource()==male)
                  {
                   JOptionPane.showMessageDialog(null, "This student is male");
                  } 
               if (ae.getSource()==female)
                  {
                   JOptionPane.showMessageDialog(null, "This student is female");
                  }
              }
              
            private class ClosingWindow extends WindowAdapter
               {
                  public void windowClosing(WindowEvent e)
                     {
                        windowoption();
                     } 
               }
            
            public void windowoption()
               {
                  int response=JOptionPane.showConfirmDialog(getContentPane(), "Are you ure you want to exit?", "confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (response==JOptionPane.NO_OPTION)
                     {
                       //No event
                     }
                     else if (response==JOptionPane.YES_OPTION)
                      {
                        System.exit(0); //window closes
                      }
                     else if(response==JOptionPane.CLOSED_OPTION)
                      {
                        //No event
                      }
               }
             
            public static void main(String arg[])
               {
               
               new conatt();
               }
                  
                 
   }