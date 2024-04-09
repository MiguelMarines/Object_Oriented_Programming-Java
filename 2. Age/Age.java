/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Age
   =========================================================== */


/* =============================================================
   Activity: Age
   
    The program asks the user for her/his name and displays
    her/his name with a greeting message, then asks the user
    for her/his age and calculates de user’s age in one year,
    in five years and five years ago. Finally the program
    displays a message with the information.
============================================================== */

import java.util.Scanner; // Imports library in order to scann.
 
public class Age // Public Class Age.
{
    public static void main(String args[]) // Main
    {
        String name; // String variable name.
        int age, oneage, nage, oage; // Int variables
         
        Scanner SC = new Scanner(System.in); // Scanns
         
        System.out.print("Enter name: "); // Print that asks for the name.
        name = SC.nextLine(); // Asigns the scanned string to the variable.
        System.out.println("Greetings dear " + name); // Prints the greeting plus the name.
 
        System.out.print("Please enter your age: "); // Print that asks for the age.
        age = SC.nextInt(); // Asigns the scanned string to the variable.

        oneage = age + 1; // Modifies the value of the age and asigns the new value to another value.
        nage = age + 5; // Modifies the value of the age and asigns the new value to another value.
        oage = age - 5; // Modifies the value of the age and asigns the new value to another value.
        
        System.out.println("Name: " + name); // Prints the name, with the use of a variable.
        System.out.println("Age: " + age); // Prints the age, with the use of a variable.
        System.out.println("Age next year: " + oneage); // Prints the age in one year, with the use of a variable.
        System.out.println("Age in five years: " + nage); // Prints the age in five years, with the use of a variable.
        System.out.println("Age five years ago: " + oage); // Prints the age five years ago, with the use of a variable.
                                  
    }
}