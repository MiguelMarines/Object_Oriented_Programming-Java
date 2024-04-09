/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Read File
   =========================================================== */


/* =============================================================
   Problem: Read File
   
    1.The program asks the user for the files location.
    
    2.The text file contains words and numbers in different lines.
   
    hello
    123
    oop
    6101

    3.The program prints the file’s content in the opposite order
    and changes the words to upper case.
    
    6101
    OOP
    123
    HELLO
============================================================== */

// Libraries
import java.io.*;
import java.util.Scanner;

// Class
public class UpperOrder
  { 
    // Main
    public static void main(String[] args)throws Exception
    { 
      // Variables
      String fileName,std, stu;
      int i = 0;

      Scanner s = new Scanner(System.in); // Creates scanns

      System.out.println("Enter the file's location: "); // Print, that asks for the name of the file to work with.
      fileName= s.nextLine(); // Scans the name of the file and asigns its name to a string variable.
      File file = new File(fileName); // Creates an object of the class and specifies the filename.

      BufferedReader bufRed = new BufferedReader(new FileReader(file)); // Reads the file.
  
      String[] a = new String[4]; // Creates an array of strings.

      while ((std = bufRed.readLine()) != null) // Verifies that the file has content.
      {
        stu = std.toUpperCase(); // Changes the file to upper case.
        a[i] = stu; // Asigns a string value to the array.
        i = i + 1; // Variable "i" plus 1.
      }
      
      // Prints, that reorder the file.
      System.out.println(a[3]);
      System.out.println(a[2]);
      System.out.println(a[1]);
      System.out.println(a[0]);

  }
}