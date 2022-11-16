
/**
 * Write a description of class aboutVEIA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;                    
import java.awt.event.*;                    
import javax.swing.*;
                 
                     
public class AboutVeia extends JFrame {                    
    //Label
    JLabel firstTexts = new JLabel("Welcome to Virtual Educational Insurance Advisor (VEIA)!");
    String text = "<html><p>The Virtual Educational Insurance Advisor (VEIA) is an educational insurancecombined with a life insurance, to ensure that the child’s education and client’s health is financially secured. This virtual calculator will assist you in calculating your child’s college fund, so you could estimate how much you can pay and save for your loved ones. This is helpful as it will guide you along the way to a life of being insured. For the equation, the average annual increase in tuition fees in the Philippines is 10%, which is twice the inflation rate (Moneymax, 2020). This serves as a basis for the constant value of the factor rate.txt</p></html>";
    JLabel secondTexts = new JLabel(text,SwingConstants.CENTER);              
    
    //creating instance of JButton                     
    JButton exitButton = new JButton("OK");
                     
    public AboutVeia() {                                          
        JFrame frameTwo=new JFrame();
        frameTwo.setTitle("About Us");
        frameTwo.setBounds(520, 200, 1000, 300);

        //x axis, y axis, width, height & fonts   
        firstTexts.setBounds(30,10,500,20);
        secondTexts.setBounds(70,20,350,270);
        exitButton.setBounds(170,290,150,40);
        
        //fonts
        firstTexts.setFont(new Font("Arial", Font.BOLD, 15));
        secondTexts.setFont(new Font("Arial", Font.PLAIN, 15));
                            
        //adding content in JFrame
        frameTwo.add(firstTexts);
        frameTwo.add(secondTexts);    
        frameTwo.add(exitButton);                                        
                                                            
        //Frame size                                          
        frameTwo.setSize(500,400);                    
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
        new AboutVeia();    
    }                    
}
