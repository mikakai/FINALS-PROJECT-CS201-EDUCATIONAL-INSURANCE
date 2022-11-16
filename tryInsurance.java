
/**
 * Write a description of class tryInsurance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class tryInsurance extends JFrame 
{
    private String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "Jan", "Feb", "Mar", "Apr",
            "May", "June", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1983", "1984", "1985", "1986",
            "1987", "1988", "1989", "1990", 
            "1991", "1992", "1993", "1994",
            "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019", "2020", "2021", "2022", };
            
    public tryInsurance()
    {
        JFrame frameReg = new JFrame();
        frameReg.setTitle("Registration Form");
        frameReg.setBounds(300, 90, 900, 600);
        frameReg.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel title = new JLabel("ASSESSING THE USER");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(500, 30);
        title.setLocation(300, 30);
        frameReg.add(title);
        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(30, 100);
        frameReg.add(name);
        
        JTextField userName = new JTextField();
        userName.setFont(new Font("Arial", Font.PLAIN, 15));
        userName.setSize(200, 20);
        userName.setLocation(200, 100);
        frameReg.add(userName);
        
        JLabel age = new JLabel("Age: ");
        age.setFont(new Font("Arial", Font.PLAIN, 20));
        age.setSize(200, 20);
        age.setLocation(30, 150);
        frameReg.add(age);
        
        JTextField userAge = new JTextField();
        userAge.setFont(new Font("Arial", Font.PLAIN, 15));
        userAge.setSize(200, 20);
        userAge.setLocation(200, 150);
        frameReg.add(userAge);
        
        userAge.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char a = e.getKeyChar();
                if ( ((a < '0') || (a > '9')) && (a != KeyEvent.VK_BACK_SPACE)) {
         e.consume();  // ignore event
      }
    }
});
        
        JLabel sex = new JLabel("Sex: ");
        sex.setFont(new Font("Arial", Font.PLAIN, 20));
        sex.setSize(100, 20);
        sex.setLocation(30, 200);
        frameReg.add(sex);
        
        JRadioButton userMale = new JRadioButton("Male");
        userMale.setFont(new Font("Arial", Font.PLAIN, 15));
        userMale.setSelected(true);
        userMale.setSize(75, 20);
        userMale.setLocation(225, 200);
        frameReg.add(userMale);
        
        JRadioButton userFemale = new JRadioButton("Female");
        userFemale.setFont(new Font("Arial", Font.PLAIN, 15));
        userFemale.setSelected(false);
        userFemale.setSize(80, 20);
        userFemale.setLocation(300, 200);
        frameReg.add(userFemale);
        
        ButtonGroup gender = new ButtonGroup();
        gender.add(userMale);
        gender.add(userFemale);
        
        JLabel birth = new JLabel("Date Of Birth: ");
        birth.setFont(new Font("Arial", Font.PLAIN, 20));
        birth.setSize(400, 20);
        birth.setLocation(30, 250);
        frameReg.add(birth);
        
        JComboBox date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(215, 250);
        frameReg.add(date);
        
        JComboBox month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(265, 250);
        frameReg.add(month);
        
        JComboBox year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(325, 250);
        frameReg.add(year);
        
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setSize(400, 20);
        email.setLocation(30, 300);
        frameReg.add(email);
        
        JTextField userEmail = new JTextField();
        userEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        userEmail.setSize(200, 20);
        userEmail.setLocation(200, 300);
        frameReg.add(userEmail);
        
        JLabel contact = new JLabel("Contact Number : ");
        contact.setFont(new Font("Arial", Font.PLAIN, 20));
        contact.setSize(300,20);
        contact.setLocation(30,350);
        frameReg.add(contact);
        
        JTextField userContact = new JTextField();
        userContact.setFont(new Font("Arial", Font.PLAIN, 15));
        userContact.setSize(200,20);
        userContact.setLocation(200,350);
        frameReg.add(userContact);
        
        userContact.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char a = e.getKeyChar();
                if ( ((a < '0') || (a > '9')) && (a != KeyEvent.VK_BACK_SPACE)) {
         e.consume();  // ignore event
      }
    }
});
        
        JCheckBox check = new JCheckBox("All information was filled out.");
        check.setFont(new Font("Arial", Font.PLAIN, 15));
        check.setSize(250, 20);
        check.setLocation(200, 400);
        frameReg.add(check);
        
        JTextArea display = new JTextArea();
        display.setFont(new Font("Arial", Font.PLAIN, 15));
        display.setSize(300, 400);
        display.setLocation(500, 100);
        display.setLineWrap(true);
        display.setEditable(false);
        frameReg.add(display);
        
        JLabel success = new JLabel("");
        success.setFont(new Font("Arial", Font.PLAIN, 20));
        success.setSize(500, 25);
        success.setLocation(100, 500);
        frameReg.add(success);
 
        JTextArea fail = new JTextArea();
        fail.setFont(new Font("Arial", Font.PLAIN, 15));
        fail.setSize(200, 75);
        fail.setLocation(580, 175);
        fail.setLineWrap(true);
        frameReg.add(fail);
        
        userFemale.setBackground(new java.awt.Color(255, 204, 204));
        userMale.setBackground(new java.awt.Color(255, 204, 204));
        JButton submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(100, 20);
        submit.setLocation(180, 450);
        frameReg.add(submit);
        
        JButton reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(300, 450);
        frameReg.add(reset);
        
        JButton next = new JButton("Next");
        next.setFont(new Font("Arial", Font.PLAIN, 15));
        frameReg.add(next);
        
        frameReg.getContentPane().setBackground(new java.awt.Color(255, 204, 204));
        next.setBackground(Color.WHITE);
        reset.setBackground(Color.WHITE);
        submit.setBackground(Color.WHITE);
        check.setBackground(new java.awt.Color(255, 204, 204));
        
        //DESIGN
        frameReg.getContentPane().setBackground(new java.awt.Color(255, 204, 204));
        next.setBackground(Color.WHITE);
        reset.setBackground(Color.WHITE);
        submit.setBackground(Color.WHITE);
        check.setBackground(new java.awt.Color(255, 204, 204));
        userFemale.setBackground(new java.awt.Color(255, 204, 204));
        userMale.setBackground(new java.awt.Color(255, 204, 204));
        
        //Submit Button
        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (check.isSelected()){
                        String firstData;
                        String data
                        = "Name : "
                          + userName.getText() + "\n"
                          + "\n" + "Age : "
                          + userAge.getText() + "\n";
                    if (userMale.isSelected())
                        firstData = "Gender : Male"
                                + "\n";
                    else
                        firstData = "Gender : Female"
                                + "\n";
                    String secondData
                        = "Date of Birth : "
                          + (String)date.getSelectedItem()
                          + "/" + (String)month.getSelectedItem()
                          + "/" + (String)year.getSelectedItem()
                          + "\n";
     
                    String thirdData = "Email Address : " + userEmail.getText() + "\n";
                    String fourthData = "Contact Number : " + userContact.getText();
                    display.setText(data + "\n" + firstData + "\n" + secondData + "\n" + thirdData + "\n" + fourthData + "\n" );
                    display.setEditable(false);
                    success.setText("Fill-out form registered!");
                    success.setLocation(200,500);
                    next.setSize(100, 20);
                    next.setLocation(750, 520);
                }
                
                else {
                    display.setText("");
                    fail.setText("");
                    next.setSize(0,0);
                    next.setLocation(0, 0);
                    success.setText("Please check the button");  
                }
                }
            });
        //Reset Button
        reset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String def = "";
                userName.setText(def);
                userEmail.setText(def);
                userAge.setText(def);
                success.setText(def);
                display.setText(def);
                contact.setText(def);
                check.setSelected(false);
                date.setSelectedIndex(0);
                month.setSelectedIndex(0);
                year.setSelectedIndex(0);
                fail.setText(def);
                next.setSize(0,0);
                next.setLocation(0, 0);
                
            }
        });
        //Next Button moving to the next JFrame
        next.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                frameReg.dispose();
                new stepTwo();
            }
        });
        
        frameReg.setLayout(null);
        frameReg.setVisible(true);
        frameReg.setResizable(false);
        
        pack();
    }
    
    public static void main(String[] args)
    {
        new tryInsurance();
    }
        
}
    
    
