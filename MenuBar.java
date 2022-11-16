
/**
 * Write a description of class MenuBar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;                    
import java.awt.event.*;                    
import javax.swing.*;                    
                     
public class MenuBar extends JFrame {                    
    //Label
    JLabel caption = new JLabel("Choose ONE among what would you like to do next:");                    
                        
    //creating instance of JButton                     
    JButton optionOne = new JButton("Fun Fact about Insurance"); 
    JButton optionTwo = new JButton("Calculate an another Educational Insurance");
    JButton optionThree = new JButton("Restart the Program");
    JButton optionFour = new JButton("About us as VEIA");
    JButton optionFive = new JButton("Exit");
                        
    public MenuBar() {                    
        //JFrame content = new JFrame("Menu Bar");//creating instance of JFrame                      
        JFrame myframe=new JFrame();
        myframe.setTitle("MENU BAR");
        myframe.setBounds(520, 200, 1000, 300);
        
        //x axis, y axis, width, height    
        caption.setBounds(40,13,350,40);
        optionOne.setBounds(40, 50, 350, 40);    
        optionTwo.setBounds(40, 100, 350, 40);
        optionThree.setBounds(40, 150, 350, 40);
        optionFour.setBounds(40,200,350,40);
        optionFive.setBounds(140,250,150,40);
                            
        //adding content in JFrame
        myframe.add(caption);
        myframe.add(optionOne);    
        myframe.add(optionTwo);
        myframe.add(optionThree);
        myframe.add(optionFour);
        myframe.add(optionFive);  
        
                                        
        //DESIGN
        myframe.getContentPane().setBackground(new java.awt.Color(255, 204, 204));
        optionOne.setBackground(Color.WHITE);
        optionTwo.setBackground(Color.WHITE);
        optionThree.setBackground(Color.WHITE);
        optionFour.setBackground(Color.WHITE);
        optionFive.setBackground(Color.WHITE);
        
        //Frame size                                          
        myframe.setSize(450,350);                    
        myframe.setLayout(null);                    
        myframe.setVisible(true);
        myframe.setResizable(false);
        
        //EVENT FUN FACT
        optionOne.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                myframe.dispose();
                new funFacts();
            }
        });
        
        //EVENT TRY AGAIN
        optionTwo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                myframe.dispose();
                new stepTwo();
            }
        });
        //EVENT RESTART
        optionThree.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                myframe.dispose();
                new tryInsurance();
            }
        });
        //EVENT ABOUT
        optionFour.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                myframe.dispose();
                new AboutVeia();
            }
        });
        //EVENT EXIT                    
        optionFive.addActionListener(new ActionListener(){                    
            public void actionPerformed(ActionEvent e){                    
                exitButtonActionPerformed(e);
            }                    
        });                    
    }

    private void exitButtonActionPerformed(ActionEvent e){                    
            JFrame f;                    
            f=new JFrame();                    
            JOptionPane.showMessageDialog(f,"Thank you for using the program!");
            System.exit(0);
                        
        }                    
                     
    public static void main(String[] args) {                    
        new MenuBar();    
    }                    
}
