
/**
 * Write a description of class funFacts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;                    
import java.awt.event.*;                    
import javax.swing.*;
                            
public class funFacts extends JFrame {                    
    //Label
    JLabel firstTexts = new JLabel("DID YOU KNOW?");
    String textTwo = "<html><p>You most likely require more coverage than you realize and it's less expensive you think!</p></html>";
    JLabel midTexts = new JLabel(textTwo);

    String text = "<html><p>Almost half of those who have life insurance say they need more or are unsure if they have enough coverage. So, how much is too much? Experts frequently recommend purchasing seven to ten times your yearly income in life insurance, although the appropriate amount varies by individual. Our term life calculator can assist you in estimating your requirements.As far as fascinating life insurance stats go, this one is up there: On average, consumers overestimate the cost of life insurance by 300%. In actuality, a healthy 30-year-old woman can start paying $27 per month for a 30-year, $250,000 term life insurance policy from Fidelity Life. (FidelityLife, 2022)The Virtual Educational Insurance Advisor (VEIA) is an educational insurancecombined with a life insurance, to ensure that the child’s education and client’s health is financially secured. This virtual calculator will assist you in calculating your child’s college fund, so you could estimate how much you can pay and save for your loved ones. This is helpful as it will guide you along the way to a life of being insured. For the equation, the average annual increase in tuition fees in the Philippines is 10%, which is twice the inflation rate (Moneymax, 2020). This serves as a basis for the constant value of the factor rate.txt</p></html>";
    JLabel secondTexts = new JLabel(text,SwingConstants.CENTER);              
    
    //creating instance of JButton                     
    JButton exitButton = new JButton("OK");
                     
    public funFacts() {                                          
        JFrame frameTwo=new JFrame();
        frameTwo.setTitle("FUN FACT");
        frameTwo.setBounds(500, 200, 1000, 300);

        //x axis, y axis, width, height & fonts   
        firstTexts.setBounds(30,20,500,20);
        midTexts.setBounds(50,50,500,50);
        secondTexts.setBounds(70,100,470,270);
        exitButton.setBounds(200,390,150,40);
        
        //fonts
        firstTexts.setFont(new Font("Arial", Font.BOLD, 20));
        midTexts.setFont(new Font("Arial", Font.BOLD, 15));
        secondTexts.setFont(new Font("Arial", Font.PLAIN, 13));
        
                            
        //adding content in JFrame
        frameTwo.add(firstTexts);
        frameTwo.add(midTexts);
        frameTwo.add(secondTexts);    
        frameTwo.add(exitButton);                                        
                                                            
        //Frame size                                          
        frameTwo.setSize(600,500);                    
        frameTwo.setLayout(null);                   
        frameTwo.setVisible(true);
        
        //design - color
        frameTwo.setVisible(true);;
        exitButton.setBackground(Color.WHITE);
        frameTwo.getContentPane().setBackground(new java.awt.Color(255, 204, 204));
        frameTwo.setLayout(null);
        frameTwo.setVisible(true);
        frameTwo.setResizable(false);  
        
        //EVENT EXIT                    
        exitButton.addActionListener(new ActionListener(){                    
            public void actionPerformed(ActionEvent e){                    
                exitButtonActionPerformed(e);
            }                    
        });                    
    }
    
    private void exitButtonActionPerformed(ActionEvent e){                    
            JFrame f;                    
            f=new JFrame();                    
            System.exit(0);
                        
        }                    
                       
    public static void main(String[] args) {                    
        new funFacts();    
    }                    
}
