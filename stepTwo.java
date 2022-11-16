
/**
 * Write a description of class stepTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class stepTwo extends JFrame {
    private double firstOutput;
    private double secondOutput;
    private double thirdOutput;
    private double fourthOutput;

    private double finalOutput;

    public stepTwo() {
        JFrame frameTwo = new JFrame();
        frameTwo.setTitle("Educational Insurance Calculation");
        frameTwo.setBounds(300, 90, 900, 600);

        JLabel title = new JLabel("Multiplication of the Tuition Fee & the Factor Rate");
        title.setFont(new Font("Arial", Font.PLAIN, 25));
        title.setSize(600, 20);
        title.setLocation(50, 30);
        frameTwo.add(title);

        JLabel year = new JLabel("Year Level");
        year.setFont(new Font("Arial", Font.PLAIN, 20));
        year.setSize(100, 20);
        year.setLocation(100, 100);
        frameTwo.add(year);

        JLabel first = new JLabel("Freshman");
        first.setFont(new Font("Arial", Font.PLAIN, 20));
        first.setSize(100, 20);
        first.setLocation(100, 150);
        frameTwo.add(first);

        JLabel second = new JLabel("Sophomore");
        second.setFont(new Font("Arial", Font.PLAIN, 20));
        second.setSize(120, 20);
        second.setLocation(100, 200);
        frameTwo.add(second);

        JLabel third = new JLabel("Junior");
        third.setFont(new Font("Arial", Font.PLAIN, 20));
        third.setSize(100, 20);
        third.setLocation(100, 250);
        frameTwo.add(third);

        JLabel fourth = new JLabel("Senior");
        fourth.setFont(new Font("Arial", Font.PLAIN, 20));
        fourth.setSize(100, 20);
        fourth.setLocation(100, 300);
        frameTwo.add(fourth);

        String text = "<html><p>Annual Tuition Fee</p></html>";
        JLabel tuition = new JLabel(text);
        tuition.setFont(new Font("Arial", Font.PLAIN, 18));
        tuition.setSize(100,50);
        tuition.setLocation(220, 90);
        frameTwo.add(tuition);

        JTextField userFirst = new JTextField();
        userFirst.setFont(new Font("Arial", Font.PLAIN, 20));
        userFirst.setSize(100, 20);
        userFirst.setLocation(220, 150);
        frameTwo.add(userFirst);

        JTextField userSecond = new JTextField();
        userSecond.setFont(new Font("Arial", Font.PLAIN, 20));
        userSecond.setSize(100, 20);
        userSecond.setLocation(220, 200);
        frameTwo.add(userSecond);

        JTextField userThird = new JTextField();
        userThird.setFont(new Font("Arial", Font.PLAIN, 20));
        userThird.setSize(100, 20);
        userThird.setLocation(220, 250);
        frameTwo.add(userThird);

        JTextField userFourth = new JTextField();
        userFourth.setFont(new Font("Arial", Font.PLAIN, 20));
        userFourth.setSize(100, 20);
        userFourth.setLocation(220, 300);
        frameTwo.add(userFourth);

        String textTwo = "<html><p>Factor Rate (10%)</p></html>";
        JLabel factor = new JLabel(textTwo);
        factor.setFont(new Font("Arial", Font.PLAIN, 18));
        factor.setSize(100, 50);
        factor.setLocation(340, 90);
        frameTwo.add(factor);

        JTextArea firstRate = new JTextArea("6.12");
        firstRate.setFont(new Font("Arial", Font.PLAIN, 20));
        firstRate.setSize(100, 20);
        firstRate.setLocation(340, 150);
        firstRate.setEditable(false);
        frameTwo.add(firstRate);

        JTextArea secondRate = new JTextArea("6.73");
        secondRate.setFont(new Font("Arial", Font.PLAIN, 20));
        secondRate.setSize(100, 20);
        secondRate.setLocation(340, 200);
        secondRate.setEditable(false);
        frameTwo.add(secondRate);

        JTextArea thirdRate = new JTextArea("7.40");
        thirdRate.setFont(new Font("Arial", Font.PLAIN, 20));
        thirdRate.setSize(100, 20);
        thirdRate.setLocation(340, 250);
        thirdRate.setEditable(false);
        frameTwo.add(thirdRate);

        JTextArea fourthRate = new JTextArea("8.14");
        fourthRate.setFont(new Font("Arial", Font.PLAIN, 20));
        fourthRate.setSize(100, 20);
        fourthRate.setLocation(340, 300);
        fourthRate.setEditable(false);
        frameTwo.add(fourthRate);

        JTextArea display = new JTextArea();
        display.setFont(new Font("Arial", Font.PLAIN, 15));
        display.setSize(360, 400);
        display.setLocation(500, 100);
        display.setLineWrap(true);
        display.setEditable(false);
        frameTwo.add(display);

        JButton compute = new JButton("Compute");
        compute.setFont(new Font("Arial", Font.PLAIN, 15));
        compute.setSize(100, 20);
        compute.setLocation(100, 450);
        frameTwo.add(compute);

        JButton next = new JButton("Next");
        next.setFont(new Font("Arial", Font.PLAIN, 15));
        frameTwo.add(next);

        frameTwo.getContentPane().setBackground(new java.awt.Color(255, 204, 204));
        next.setBackground(Color.WHITE);
        compute.setBackground(Color.WHITE);

        // compute button
        compute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // get input values and compute
                double firstOutput = Double.parseDouble(userFirst.getText()) * Double.parseDouble(firstRate.getText());
                double secondOutput = Double.parseDouble(userSecond.getText()) * Double.parseDouble(secondRate.getText());
                double thirdOutput = Double.parseDouble(userThird.getText()) * Double.parseDouble(thirdRate.getText());
                double fourthOutput = Double.parseDouble(userFourth.getText()) * Double.parseDouble(fourthRate.getText());

                setFirstOutput(firstOutput);
                setSecondOutput(secondOutput);
                setThirdOutput(thirdOutput);
                setFourthOutput(fourthOutput);

                double finalOutput = computeTuition(firstOutput, secondOutput, thirdOutput, fourthOutput);

                setFinalOutput(finalOutput);

                String description = "The calculations for your educational insurance are listed below." + "The rates given are fixed factor rates, provided by the guide issued by a SunLife Advisor.";
                String caption = "Here are your following results!" + "\n";
                String firstData = "First Year - Freshman: " + String.format("%.2f", firstOutput) + "\n";
                String secondData = "Second Year - Sophomore: " + String.format("%.2f", secondOutput) + "\n";
                String thirdData = "Third Year - Junior: " + String.format("%.2f", thirdOutput) + "\n";
                String fourthData = "Fourth Year - Senior: " + String.format("%.2f", fourthOutput)+ "\n";
                String finalSay = "The future value of your child's tuition fee: " + String.format("%.2f", finalOutput);

                display.setText(description + "\n" + caption + "\n" + firstData + "\n" + secondData + "\n" + thirdData + "\n" + fourthData + "\n" + finalSay + "\n");
                display.setEditable(false);
                next.setSize(100, 20);
                next.setLocation(220, 450);
            }
        });

        // next button moving to the next JFrame
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frameTwo.dispose();
                new stepThree(getFinalOutput());
            }
        });

        frameTwo.setLayout(null);
        frameTwo.setVisible(true);
        frameTwo.setResizable(false);

        pack();
    }

    public double getFinalOutput() {
        return finalOutput;
    }

    public void setFirstOutput(double firstOutput) {
        this.firstOutput = firstOutput;
    }

    public void setSecondOutput(double secondOutput) {
        this.secondOutput = secondOutput;
    }

    public void setThirdOutput(double thirdOutput) {
        this.thirdOutput = thirdOutput;
    }

    public void setFourthOutput(double fourthOutput) {
        this.fourthOutput = fourthOutput;
    }

    public void setFinalOutput(double finalOutput) {
        this.finalOutput = finalOutput;
    }

    public double computeTuition(double freshman, double sophomore, double junior, double senior) {
        return freshman + sophomore + junior + senior;
    }

    public static void main(String[] args) {
        new stepTwo();
    }
}
