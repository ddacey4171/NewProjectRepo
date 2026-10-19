import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class RunnerTwo implements ActionListener {


    JTextField num1Feald;
    JTextField num2Feald;
    JLabel anser;
    JButton subtractButton;
    JButton addButton;
    JButton multiplyButton;
    JButton divideButton;
    JButton modButton;
    static Scanner myScanner = new Scanner(System.in);


    public static double add(int var, int var2) {
        return var + var2;
    }


    public static double subtract(int var, int var2) {
        return var - var2;
    }


    public static double multiply(int var, int var2) {
        return var * var2;
    }


    public static double divide(int var, int var2) {
        return (double) var / var2;
    }


    public static double mod(int var, int var2) {
        return var % var2;
    }


    public static void main(String[] args) {
        // This calls the constructor and builds your calculator window
        TimeFrame frame = new TimeFrame();
        new RunnerTwo();


    }




    public RunnerTwo() {
        JFrame window = new JFrame("calculator");
        window.setSize(400,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null/*new GridLayout(3,2)*/);






        num1Feald = new JTextField();
        num1Feald.setFont(new Font("SansSerif",Font.PLAIN,42));
        num1Feald.setHorizontalAlignment(JTextField.CENTER);
        num1Feald.setBounds(30, 20, 150, 50);


        num2Feald = new JTextField();
        num2Feald.setFont(new Font("SansSerif",Font.PLAIN,42));
        num2Feald.setHorizontalAlignment(JTextField.CENTER);
        num2Feald.setBounds(30, 90, 150, 50);


        addButton = new JButton("<  addision  >");
        addButton.setBackground(new Color(101, 67, 33));
        addButton.setOpaque(true);
        addButton.setContentAreaFilled(true);
        addButton.setForeground(new Color(0, 0, 0));
        addButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        addButton.setBorderPainted(true);
        addButton.setBounds(30, 170, 140, 50);




        subtractButton = new JButton("subtract");


        multiplyButton = new JButton("multiplicasion");


        divideButton = new JButton("division");


        modButton = new JButton("mod");


        anser = new JLabel(" Anser gose here ");
        anser.setBounds(30, 220, 150, 50);


        addButton.addActionListener(this);


        subtractButton.addActionListener(this);


        multiplyButton.addActionListener(this);


        divideButton.addActionListener(this);


        modButton.addActionListener(this);




        window.add(num1Feald);
        window.add(num2Feald);
        window.add(addButton);
        window.add(subtractButton);
        window.add(multiplyButton);
        window.add(divideButton);
        window.add(modButton);
        window.add(anser);
        window.setVisible(true);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(addButton)){
            addButton.setBackground(new Color(0, 0, 0));
            int num1a = Integer.parseInt(num1Feald.getText());
            int num2a = Integer.parseInt(num2Feald.getText());
            anser.setText( add(num1a,num2a)  +"");
        };
        if(e.getSource().equals(subtractButton)){
            int num1b = Integer.parseInt(num1Feald.getText());
            int num2b = Integer.parseInt(num2Feald.getText());
            anser.setText( subtract(num1b,num2b)  +"");}
        if(e.getSource().equals(multiplyButton)){
            int num1c = Integer.parseInt(num1Feald.getText());
            int num2c = Integer.parseInt(num2Feald.getText());
            anser.setText( multiply(num1c,num2c)  +"");}
        if(e.getSource().equals(divideButton)){
            int num1d = Integer.parseInt(num1Feald.getText());
            int num2d = Integer.parseInt(num2Feald.getText());
            anser.setText( divide(num1d,num2d)  +"");}
        if(e.getSource().equals(modButton)){
            int num1e = Integer.parseInt(num1Feald.getText());
            int num2e = Integer.parseInt(num2Feald.getText());
            anser.setText( mod(num1e,num2e)  +"");}
    }
}

