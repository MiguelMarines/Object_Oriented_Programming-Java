/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Calculator (GUI Buttons)
   =========================================================== */


/* =============================================================
   Activity: Calculator (GUI Buttons)
   
    This program generates a user interface of a calculator, the
    calculator has buttons, that enable the user to make additions,
    subtractions, multiplications and divisions of integer numbers.
============================================================== */

// Libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

// Class
public class Calculator implements ActionListener
{
    /*  Class Calculator with implementation of ActionListener interface, 
        which allows buttons to work.
    */

    static boolean clearScreen = false; // Boolean variable to make sure to clear the screen, when appropriate.
    static boolean flagfirstnumber = true; // Boolean variable to makes sure to store the number correctly.
    
    static int a, b; // Int variables to make the required operations.
    static String operator = ""; // String variable of the required opperation simbol.

    static JPanel panel2 = new JPanel(); // Creates a panel.
    static JTextField textField = new JTextField(15); // Creation of the area of the output display.

    // Creation of buttons.
    static JButton button0 = new JButton("0");
    static JButton button1 = new JButton("1");
    static JButton button2 = new JButton("2");
    static JButton button3 = new JButton("3");
    static JButton button4 = new JButton("4");
    static JButton button5 = new JButton("5");
    static JButton button6 = new JButton("6");
    static JButton button7 = new JButton("7");
    static JButton button8 = new JButton("8");
    static JButton button9 = new JButton("9");
    static JButton button10 = new JButton("+");
    static JButton button11 = new JButton("-");
    static JButton button12 = new JButton("*");
    static JButton button13 = new JButton("/");
    static JButton button14 = new JButton("=");
    static JButton button15 = new JButton("CLEAR");

    public static void main(String[] args) // Main
    {

        
        Calculator calculator = new Calculator(); // Creates an object of the class Calculator.
        
        JFrame frame = new JFrame(); // Creates an object frame.
        frame.setTitle("CALCULATOR"); // Sets the header or title of the calculator.
        frame.setSize(200, 250); // Size (width and height) of the calculator.
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); // Closes the program when window is closed.

        JPanel panel = new JPanel(); // Creates a panel.
        
        // Adds the buttons to the panel.
        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button11);
        panel.add(button12);
        panel.add(button13);
        panel.add(button14);
        panel.add(button15);
        
        // Adds an action listener to each of the buttons.
        button0.addActionListener(calculator);
        button1.addActionListener(calculator);
        button2.addActionListener(calculator);
        button3.addActionListener(calculator);
        button4.addActionListener(calculator);
        button5.addActionListener(calculator);
        button6.addActionListener(calculator);
        button7.addActionListener(calculator);
        button8.addActionListener(calculator);
        button9.addActionListener(calculator);
        button10.addActionListener(calculator);
        button11.addActionListener(calculator);
        button12.addActionListener(calculator);
        button13.addActionListener(calculator);
        button14.addActionListener(calculator);
        button15.addActionListener(calculator);
        
        Border border = BorderFactory.createRaisedBevelBorder(); // Creates a border.
        textField.setBackground(Color.lightGray); // Sets the backgound color.
        textField.setBorder(border); // Sets the border.
        
        textField.setEditable(false); // Restrics the user from typing in the textbox.
                
        frame.setLayout(new BorderLayout()); // Sets the basic layout north, east, west, south.
        
        panel.setLayout(new GridLayout(6,3,2,2)); // First panel’s layout is 6 rows and 3 columns, spaced 2, 2.
        
        panel2.add(textField); // Adds the text field to the second panel.
        
        frame.add(panel, BorderLayout.NORTH); // Fixes the first panel to the northside.
        frame.add(panel2, BorderLayout.CENTER); // Fixes the second panel to the southside.
        frame.setVisible(true);
    }

  
    @Override // Overriding.
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button0) // Button pressed
        {
            if (clearScreen == true) clear(); // Clear screen
    
            textField.setText(textField.getText() + "0"); // Adds the number to the display.
        }
        if (e.getSource() == button1) // Button pressed
        {
            if (clearScreen == true) clear(); // Clear screen
            textField.setText(textField.getText() + "1"); // Adds the number to the display.
        }
        if (e.getSource() == button2) // Button pressed
        {
            if (clearScreen == true) clear(); // Clear screen
            textField.setText(textField.getText() + "2"); // Adds the number to the display.
        }
        if (e.getSource() == button3) // Button pressed
        {
            if (clearScreen == true) clear(); // Clear screen
            textField.setText(textField.getText() + "3"); // Adds the number to the display.
        }
        if (e.getSource() == button4) // Button pressed
        {
            if (clearScreen == true) clear(); // Clear screen
            textField.setText(textField.getText() + "4"); // Adds the number to the display.
        }
        if (e.getSource() == button5) // Button pressed
        {
            if (clearScreen == true) clear(); // Clear screen
            textField.setText(textField.getText() + "5"); // Adds the number to the display.
        }
        if (e.getSource() == button6) // Button pressed
        {
            if (clearScreen == true) clear(); // Clear screen
            textField.setText(textField.getText() + "6"); // Adds the number to the display.
        }
        if (e.getSource() == button7) // Button pressed
        {
            if (clearScreen == true) clear(); // Clear screen
            textField.setText(textField.getText() + "7"); // Adds the number to the display.
        }
        if (e.getSource() == button8) // Button pressed
        {
            if (clearScreen == true) clear(); // Clear screen
            textField.setText(textField.getText() + "8"); // Adds the number to the display.
        }
        if (e.getSource() == button9) // Button pressed
        {
            if (clearScreen == true) clear(); // Clear screen
            textField.setText(textField.getText() + "9"); // Adds the number to the display.
        }
        if (e.getSource() == button10) // Button pressed
        {
            
            a = Integer.valueOf(textField.getText()); // Converts the number from a String to an int.
            textField.setText(""); // Clears the display.
            operator = "PLUS"; // Sets the operator.
            
        }
        if (e.getSource() == button11)
        {
            a = Integer.valueOf(textField.getText()); // Converts the number from a String to an int.
            textField.setText(""); // Clears the display.
            operator = "MINUS"; // Sets the operator.
        }
        if (e.getSource() == button12)
        {
            a = Integer.valueOf(textField.getText()); // Converts the number from a String to an int.
            textField.setText(""); // Clears the display.
            operator = "MULTIPLY"; // Sets the operator.
        }
        if (e.getSource() == button13)
        {
            a = Integer.valueOf(textField.getText()); // Converts the number from a String to an int.
            textField.setText(""); // Clears the display.
            operator = "DIVIDE"; // Sets the operator.
        }
        if (e.getSource() == button14)
        {
            
            b = Integer.valueOf(textField.getText()); // Converts and stores the next number from a string into an int b.
            
            if (operator.equalsIgnoreCase("PLUS"))
            {
                textField.setText(String.valueOf(addNumbers())); // Returns the sum of the numbers.
            }
            
            if (operator.equalsIgnoreCase("MINUS"))
            {
                textField.setText(String.valueOf(subtractNumbers())); // Returns the substraction of the numbers.
            }
            
            if (operator.equalsIgnoreCase("MULTIPLY"))
            {
                textField.setText(String.valueOf(multiplyNumbers())); // Returns the multiplication of the numbers.
            }
            
            if (operator.equalsIgnoreCase("DIVIDE"))
            {
                textField.setText(String.valueOf(divideNumbers())); // Returns the division of the numbers.
            }
            
            clearScreen = true;
            operator = "";
        }
        if (e.getSource() == button15)
        {
            clear(); // Clears the display.
        }
    }

    // Method to add numbers.
    private int addNumbers()
    {
        return (a + b);
    }
    // Method to substract numbers.
    private int subtractNumbers()
    {
        return (a - b);
    }
    // Method to multiply numbers.
    private int multiplyNumbers()
    {
        return (a * b);
    }
    // Method to divide numbers.
    private int divideNumbers()
    {
        return (a / b);
    }
    // Method to clear the display.
    private void clear()
    {
        textField.setText("");
        clearScreen = false;
    }
}