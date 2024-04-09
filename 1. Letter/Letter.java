/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Letter
   =========================================================== */


/* ==========================================================
   Activity: Letter

   The program asks the user for a name and an address and 
   then prints the form of a letter with the name and address 
   of a certain person and the post office number. 
=========================================================== */

// Import library in order to scan and obtain strings.
import java.util.Scanner;
 
// Public Class
public class Letter 
{
    // Main
    public static void main(String args[])
    {
        // String Variables
        String name, address; 
         
        // Creates new scanners.
        Scanner SC = new Scanner(System.in); 
         
        // Print that asks for a name.
        System.out.print("Enter name: ");
        // Asigns the variable name a string.
        name = SC.nextLine();
         
        // Print that asks for an address.
        System.out.print("Enter Address: ");
        // Asigns the variable address a string.
        address = SC.nextLine();
 
        // Prints letter.
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("|                                                        |");
        System.out.println("    _ _ _ _ _ _ _ _ _ _ _ _ _ _                           ");
        System.out.println("|  |                            |                        |");
        System.out.println("     Name: " + name + "                                     ");
        System.out.println("|  |                            |                        |");
        System.out.println("     Address: " + address + "                               ");
        System.out.println("|  |_ _ _ _ _ _ _ _ _ _ _ _ _ _ |                        |");
        System.out.println("                                                          ");
        System.out.println("|                                                        |");
        System.out.println("                                                          ");
        System.out.println("|                                                        |");
        System.out.println("                                                          ");
        System.out.println("|                                                        |");
        System.out.println("                                                          ");
        System.out.println("|                                                        |");
        System.out.println("                                    Post Office No.32     ");
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
    }
}