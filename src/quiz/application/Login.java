package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
 
    JButton rules,back;
    JTextField tfname;
    JLabel heading,name2;
    
    Login() {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        // ////??new label   

        name2 = new JLabel(" ");
        name2.setBounds(810, 170, 300, 20);
        name2.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
        name2.setForeground(new Color(255, 0, 0));
        add(name2);


        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Start");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            if(tfname.getText().equals("") || tfname.getText().equals(" ")) {
                name2.setText("Please Enter Your name");

            }else{
                String name = tfname.getText();
                setVisible(false);
                new Welcome(name);   
            }
        
        } else if (ae.getSource() == back) {
        int n = JOptionPane.showConfirmDialog(this,"Do You want to Exit","Simple Minds",JOptionPane.YES_NO_OPTION);

            if(n==JOptionPane.YES_OPTION){  
                setVisible(false);  
            }
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
