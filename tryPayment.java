
/**
 * Write a description of class tryPayment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tryPayment extends JFrame
{
    public tryPayment(double finalCase) {
        JFrame framePay = new JFrame();
        framePay.setTitle("Payment Form");
        framePay.setBounds(250, 90, 900, 370);
        framePay.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel please = new JLabel("How would you like to pay for this educational insurance?");
        please.setFont(new Font("Arial", Font.PLAIN, 20));
        please.setBounds(40,13,1000,40);
        framePay.add(please);
        
        JCheckBox monthly = new JCheckBox("Monthly Payment");
        monthly.setFont(new Font("Arial", Font.PLAIN, 15));
        monthly.setBounds(40, 50, 250, 40);
        framePay.add(monthly);
        
        JCheckBox anually = new JCheckBox("Annually Payment");
        anually.setFont(new Font("Arial", Font.PLAIN, 15));
        anually.setBounds(40, 100, 250, 40);
        framePay.add(anually);

        JCheckBox full = new JCheckBox("Full Payment");
        full.setFont(new Font("Arial", Font.PLAIN, 15));
        full.setBounds(40, 150, 250, 40);
        framePay.add(full);
       
        JCheckBox quarterly = new JCheckBox("Quarterly Payment");
        quarterly.setFont(new Font("Arial", Font.PLAIN, 15));
        quarterly.setBounds(40,200,250,40);
        framePay.add(quarterly);
        
        JButton submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setBounds(40, 250, 100, 40);
        framePay.add(submit);
        
        JButton next = new JButton("Next");
        next.setFont(new Font("Arial", Font.PLAIN, 15));
        framePay.add(next);
        
        ButtonGroup all = new ButtonGroup();
        all.add(monthly);
        all.add(anually);
        all.add(full);
        all.add(quarterly);
        
        JTextArea display = new JTextArea();
        display.setFont(new Font("Arial", Font.PLAIN, 15));
        display.setSize(500, 200);
        display.setLocation(350, 80);
        display.setLineWrap(true);
        display.setEditable(false);
        framePay.add(display);
        
        
        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String buwan = "MONTHLY payment!";
                String taon = "ANNUALLY payment!";
                String buo = "FULL payment!";
                String apat = "QUARTERLY payment!";
                
                if (monthly.isSelected()){
                    String description = "Mode of Payment: " + buwan + " (every month)" + " \n";
                    String equation = "Equation: ((User's Case / 19 Years) / 12 Months) = Amount to Pay!" + " \n";
                    String quote = "Saving the future by ensuring the present." + " \n";
                    display.setText(description + " \n" + equation + "\n" + quote);
                    display.setEditable(false);
                    next.setBounds(150, 250, 100, 40);
                } else if (anually.isSelected()){
                    String description = "Mode of Payment: " + taon + " (every year)" + " \n";
                    String equation = "Equation: (User's Case / 19 Years) = Amount to Pay!" + " \n";
                    String quote = "Saving the future by ensuring the present." + " \n";
                    display.setText(description + " \n" + equation + "\n" + quote);
                    display.setEditable(false); 
                    next.setBounds(150, 250, 100, 40);
                } else if (full.isSelected()){
                    String description = "Mode of Payment: " + buo + " (fully paid)" + " \n";
                    String equation = "Equation: (User's Case / 1 Year) = Amount to Pay!" + " \n";
                    String quote = "Saving the future by ensuring the present." + " \n";
                    display.setText(description + " \n" + equation + "\n" + quote);
                    display.setEditable(false);
                    next.setBounds(150, 250, 100, 40);
                } else if (quarterly.isSelected()){
                    String description = "Mode of Payment: " + apat + " (every four months)" + " \n";
                    String equation = "Equation: ((User's Case / 19 Years) / 4 Months) = Amount to Pay!" + " \n";
                    String quote = "Saving the future by ensuring the present." + " \n";
                    display.setText(description + " \n" + equation + "\n" + quote);
                    display.setEditable(false);
                    next.setBounds(150, 250, 100, 40);
                    
                }   
            }
        });
        
        next.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               JOptionPane.showMessageDialog(null, "Thank you for choosing VEIA Services! " + " \n " + "You will now move on the Menu Bar!");
               framePay.dispose();
               new MenuBar(); 
               
            }
        });
        
        framePay.getContentPane().setBackground(new java.awt.Color(255, 204, 204));
        monthly.setBackground(new java.awt.Color(255, 204, 204));
        full.setBackground(new java.awt.Color(255, 204, 204));
        quarterly.setBackground(new java.awt.Color(255, 204, 204));
        anually.setBackground(new java.awt.Color(255, 204, 204));
        
        framePay.setLayout(null);
        framePay.setVisible(true);
        framePay.setResizable(false);
        
        pack();
        
    }
    
    public static void main(String[] args) {
        stepThree stepThree = new stepThree(3000000);
        new tryPayment(stepThree.getFinalCase());
    }
}

