package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
        
       JButton rules , back;
       JTextField tfname;
       Login()
       {
           //Login Image
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
           JLabel image = new JLabel(i1);
           image.setBounds(0,0,600,500);
           add(image);
           
           //add Heading-Simple Minds
           JLabel heading = new JLabel("Simple Minds");
           heading.setBounds(750,60,300,45);
           heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
           heading.setForeground(new Color(30,144,254));
           add(heading);
           
           //add-Enter your Name
           JLabel name = new JLabel("Enter Your Name");
           name.setBounds(810,150,300,20);
           name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
           name.setForeground(new Color(30,144,254));
           add(name);
           
           //Text Field
           tfname = new JTextField();
           tfname.setBounds(725,200,300,25);
           tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
           add(tfname);
           
           //add Button - rules
           rules = new JButton("Rules");
           rules.setBounds(735,270,120,25);
           rules.setBackground(new Color(30,144,254));
           rules.setForeground(Color.WHITE);
           rules.addActionListener(this);
           add(rules);
           
           //add Button - Back
           back = new JButton("Back");
           back.setBounds(915,270,120,25);
           back.setBackground(new Color(30,144,254));
           back.setForeground(Color.WHITE);
           back.addActionListener(this);
           add(back);
           
           setLayout(null);
           getContentPane().setBackground(new Color(31,39,49));
           setSize(1200,500);
           setLocation(150,150);
           setUndecorated(true);
           setVisible(true);
           
       }
       @Override
       public void actionPerformed(ActionEvent ae)
       {
           if(ae.getSource()== rules)
           {
               String name = tfname.getText();
               setVisible(false);
               new Rules(name);
               
           }else if(ae.getSource()== back){
               System.exit(0);
           }
       }
    
    public static void main(String [] args)
    {
        new Login();
    }
}
