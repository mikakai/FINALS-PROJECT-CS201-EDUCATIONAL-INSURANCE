
/**
 * Write a description of class stepThree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class stepThree extends JFrame {
    private double firstCase;
    private double secondCase;
    private double thirdCase;
    private double fourthCase;
    
    private double finalCase;
    
    public stepThree(double finalOutput) {
        this.finalCase = finalCase;
        JFrame frameThree = new JFrame();
        frameThree.setTitle("Educational Insurance Calculation");
        frameThree.setBounds(250, 90, 900, 370);

        String text = "<html><p>Categorizing the Calculated Future Value of Tuition Fee</p></html>";
        JLabel title = new JLabel(text);
        title.setFont(new Font("Arial", Font.PLAIN, 25));
        title.setBounds(160, 100, 500, 50);
        frameThree.add(title);

        JButton know = new JButton("Click here to know your case!");
        know.setFont(new Font("Arial", Font.PLAIN, 15));
        know.setBounds(150, 250, 250, 50);
        frameThree.add(know);

        JButton next = new JButton("Next");
        next.setFont(new Font("Arial", Font.PLAIN, 15));
        frameThree.add(next);

        JTextArea display = new JTextArea();
        display.setFont(new Font("Arial", Font.PLAIN, 15));
        display.setBounds(90, 180, 660, 50);
        display.setLineWrap(true);
        display.setEditable(false);
        frameThree.add(display);

        //Information
        String[][] info = {
                {"Case 1", "₱2,500,000.00", "₱3,000,000.00"},
                {"Case 2", "₱3,000,000.00", "₱3,500,000.00"},
                {"Case 3", "₱3,500,000.00", "₱4,000,000.00"},
                {"Case 4", "₱4,000,000.00", "₱4,500,000.00"}
        };

        //Column Names
        String [] colNames = {"CASES", "Total Value of the product of ATF & FR", "Fixed Value to Pay"};

        JTable whole = new JTable(info, colNames);
        whole.setBounds(50, 90, 200, 300);

        JScrollPane jsp = new JScrollPane(whole);
        frameThree.add(jsp);
        frameThree.setVisible(true);

        //Know Button
        know.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(finalOutput <= 2500000.00){
                    double firstCase = 3000000.00;
                    setCaseFirst(firstCase);
                    double finalCase = firstCase;
                    setCaseFinal(finalCase);
                    String firstDisplay = "In your case, your total sum is: " + Double.toString(finalOutput) + ". You are under CASE 1 that is required to pay ₱3,000,000.00";
                    display.setText(firstDisplay);
                    display.setEditable(false);
                    next.setBounds(450, 250, 250, 50);
                } else if(finalOutput <= 3000000.00){
                    double secondCase = 3500000.00;
                    setCaseSecond(secondCase);
                    double finalCase = secondCase;
                    setCaseFinal(finalCase);
                    String secondDisplay = "In your case, your total sum is: " + Double.toString(finalOutput) + ". You are under CASE 2 that is required to pay ₱3,500,000.00";
                    display.setText(secondDisplay);
                    display.setEditable(false);
                    next.setBounds(450, 250, 250, 50);
                } else if (finalOutput <= 3500000.00){
                    double thirdCase = 4000000.00;
                    setCaseThird(thirdCase);
                    double finalCase = thirdCase;
                    setCaseFinal(finalCase);
                    String thirdDisplay = "In your case, your total sum is: " + Double.toString(finalOutput) + ". You are under CASE 3 that is required to pay ₱4,000,000.00";
                    display.setText(thirdDisplay);
                    display.setEditable(false);
                    next.setBounds(450, 250, 250, 50);
                } else if(finalOutput <= 4000000.00){
                    double fourthCase = 4500000.00;
                    setCaseFourth(fourthCase);
                    double finalCase = fourthCase;
                    setCaseFinal(finalCase);
                    String fourthDisplay = "In your case, your total sum is: " + Double.toString(finalOutput) + ". You are under CASE 4 that is required to pay ₱4,500,000.00";
                    display.setText(fourthDisplay);
                    display.setEditable(false);
                    next.setBounds(450, 250, 250, 50);
                }
            }
        });

        //Next Button moving to the next JFrame
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                frameThree.dispose();
                new tryPayment(getFinalCase());
            }
        });

        frameThree.setLayout(null);
        frameThree.setVisible(true);
        frameThree.setResizable(false);

        pack();
    }
    
    public double getFinalCase() {
        return finalCase;
    }
    
    public void setCaseFirst(double firstCase){
        this.firstCase = firstCase;
    }
    
    public void setCaseSecond(double secondCase){
        this.secondCase = secondCase;
    }
    
    public void setCaseThird(double thirdCase){
        this.thirdCase = thirdCase;
    }
    
    public void setCaseFourth(double fourthCase){
        this.fourthCase = fourthCase;
    }
    
    public double setCaseFinal(double finalCase){
        this.finalCase = finalCase;
        return finalCase;
    }
    
    public static void main(String[] args) {
        stepTwo stepTwo = new stepTwo();
        new stepThree(stepTwo.getFinalOutput());
    }
}
