import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
    
    public class addbook extends JFrame implements ActionListener
     {
         JLabel addbook, updateLabel, ShowLabel;
         JTextField addbookTextField, updateTextField, ShowTextField;
         JButton addButton;
    
        public addbook() {
            setTitle("Add Book");
            setSize(750, 550);
            setLocation(100, 20);
            setLayout(null);
    
            addbook = new JLabel("Book Name:");
            addbook.setBounds(100, 50, 100, 20);
            add(addbook);
    
            addbookTextField = new JTextField(20);
            addbookTextField.setBounds(200, 50, 200, 20);
            add(addbookTextField);
    
            updateLabel = new JLabel("Book Page:");
            updateLabel.setBounds(100, 80, 100, 20);
            add(updateLabel);
    
            updateTextField = new JTextField(20);
            updateTextField.setBounds(200, 80, 200, 20);
            this.add(updateTextField);

             ShowLabel = new JLabel("Book Price:");
            ShowLabel.setBounds(100, 110, 100, 20);
            add(ShowLabel);
    
            ShowTextField = new JTextField(20);
            ShowTextField.setBounds(200, 110, 200, 20);
            this.add(ShowTextField);
           
            JButton submit=new JButton("SUBMIT");
            submit.setBounds(230, 150, 100, 20);
            submit.addActionListener(this);
            this.add(submit);
            setVisible(true);
        }
    public void actionPerformed(ActionEvent e)
    {
       String addbook=addbookTextField.getText();
       String update=updateTextField.getText();
       String show=ShowTextField.getText();

    
       String DB_URL = "jdbc:mysql://localhost:3306/suresh";
        String USER = "root";
        String PASS = "";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "Insert into addbook values('"+addbook+"','"+update+"','"+show+"')";
            stmt.executeUpdate(sql);
            System.out.println("Data insert  successfully...");
        } catch (Exception on) {
            on.printStackTrace();
        }
    }
        public static void main(String[] args) {
            new addbook();
        }
    }
