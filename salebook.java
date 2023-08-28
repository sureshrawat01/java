import java.awt.event.*;

import javax.swing.*;
import java.sql.*;

    
     class SelesBook extends JFrame implements ActionListener
     {
         JLabel sales, salesAllLabel, viewsbooksLabel;
         JTextField salesBookTextField, salesAllTextField, viewsbooksTextField;
         JButton addButton;
    
         SelesBook() {
            setTitle("Seles Book");
            setSize(750, 550);
            setLocation(100, 20);
            setLayout(null);
    
            sales = new JLabel("Sales Books:");
            sales.setBounds(100, 50, 200, 20);
            add(sales);
    
            salesBookTextField = new JTextField(20);
            salesBookTextField.setBounds(250, 50, 200, 20);
            add(salesBookTextField);
    
            salesAllLabel = new JLabel("Puchase Books:");
            salesAllLabel.setBounds(100, 80, 200, 20);
            add(salesAllLabel);
    
            salesAllTextField = new JTextField(20);
            salesAllTextField.setBounds(250, 80, 200, 20);
            this.add(salesAllTextField);

            viewsbooksLabel = new JLabel("Views All Book:");
             viewsbooksLabel.setBounds(100, 110, 200, 20);
            add( viewsbooksLabel);
    
             viewsbooksTextField = new JTextField(20);
             viewsbooksTextField.setBounds(250, 110, 200, 20);
            this.add( viewsbooksTextField);
           
            JButton submit=new JButton("SUBMIT");
            submit.setBounds(230, 150, 100, 20);
            submit.addActionListener(this);
            this.add(submit);
            setVisible(true);
        }
    
        public void actionPerformed(ActionEvent e)
        {
            String salesBook=salesBookTextField.getText();
            String salesAllBook=salesAllTextField.getText();
            String viewBook=viewsbooksTextField.getText();

       String DB_URL = "jdbc:mysql://localhost:3306/suresh";
        String USER = "root";
        String PASS = "";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "Insert into salesbook values('"+salesBook+"','"+salesAllBook+"','"+viewBook+"')";
            stmt.executeUpdate(sql);
            System.out.println("Data insert  successfully...");
        } catch (Exception on) {
            on.printStackTrace();
        }
        }
        public static void main(String[] args) {
            new SelesBook();
        }
    }
