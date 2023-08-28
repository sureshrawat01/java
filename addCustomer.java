import java.awt.event.*;
import java.sql.Connection;
import java.sql.*;

import javax.swing.*;


    
     class addCustomer extends JFrame implements ActionListener
     {
         JLabel name, code;
         JTextField nameTextField, codeTextField;
         JButton submit;
    
         addCustomer() {
            setTitle("Add Customer");
            setSize(750, 550);  
            setLocation(100, 20);
            setLayout(null);
    
            name = new JLabel("Name:");
            name.setBounds(100, 50, 200, 20);
            add(name);
    
            nameTextField = new JTextField(20);
            nameTextField.setBounds(250, 50, 200, 20);
            add(nameTextField);
    
            code = new JLabel("Code:");
            code.setBounds(100, 80, 200, 20);
            add(code);
    
            codeTextField = new JTextField(20);
            codeTextField.setBounds(250, 80, 200, 20);
            this.add(codeTextField);

             submit=new JButton("SUBMIT");
            submit.setBounds(290, 150, 100, 20);
            submit.addActionListener(this);
            this.add(submit);
            setVisible(true);
        }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==submit)
        {
            String name=nameTextField.getText();
            String code=codeTextField.getText();

             String DB_URL = "jdbc:mysql://localhost:3306/suresh";
        String USER = "root";
        String PASS = "";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "Insert into customer values('"+name+"','"+code+"')";
            stmt.executeUpdate(sql);
            System.out.println("Data insert  successfully...");
        } catch (Exception on) {
            on.printStackTrace();
        }
        }
    }
        public static void main(String[] args) {
            new addCustomer();
        }
    }
