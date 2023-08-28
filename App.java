import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App 
{
  public static void main(String[] args) throws Exception 
  {
    JFrame frame = new JFrame();

    frame.setTitle("Book store management");
    frame.setSize(600, 400);
    frame.setVisible(true);


    JMenuBar menuBar = new JMenuBar();
    //JMenu Train = new JMenu("Train");
   // JMenuItem addTrain = new JMenuItem("Avialable");

    //Train.add(addTrain);

   // menuBar.add(Train);
    frame.setJMenuBar(menuBar);

    JMenu booking = new JMenu("Bookstoremanagement");
    JMenuItem addbooking = new JMenuItem("Add Books");
    JMenuItem removebooking = new JMenuItem("Add Customer");
    JMenuItem updatebooking = new JMenuItem("Sales Books");
    

    booking.add(addbooking);
    booking.add(removebooking);
    booking.add(updatebooking);


    menuBar.add(booking);

    
    addbooking.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       new addbook();
      }
        });

         removebooking.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       new addCustomer();
      }
        });

        updatebooking.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       new SelesBook();
      }
        });

  }
}