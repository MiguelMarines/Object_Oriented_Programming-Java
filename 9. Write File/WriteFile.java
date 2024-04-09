/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Write File
   =========================================================== */


/* =============================================================
   Activity: Write File
   
    The program asks the user for a number and saves it in an
	arraylist. Then asks the user if he wants to give another
	number. If the user says yes "y", then asks for the new
	number and saves it in the arraylist. The program keeps
	asking until the user says no “n”. Then the program saves
	the numbers in a file, ordered and displays the numbers in
	the console.
============================================================== */

// Libraries
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;

// Class
public class WriteFile
{
	public static void main(String[] args) throws IOException // Main
	{
		// Variables
		int num = 0;
		String d, aux;
		
		ArrayList<Integer> a = new ArrayList<Integer>(); // Creates an int array.
		
		Scanner in = new Scanner(System.in); // Scans the user's inputs.
		
		BufferedWriter w = new BufferedWriter(new FileWriter("File.txt")); // Sets the file's name.

		System.out.println("Enter a number:"); // Print that asks the user for a number.
		num = in.nextInt(); // Asigns a value to the variable.
		in.nextLine(); // Stops the scann.
		a.add(num); // Adds the data scanned into the array.
		
		System.out.println("Do you want to give another number?"); // Print that asks the user if he wants enter another number.
		d = in.nextLine(); // The users's desicion.
			 
		 while(d.equals("Y") || d.equals("y")) // Loop to keep asking for numbers if the answer is y.
		 {  
			System.out.println("Enter another number: "); // Asks the user for another number.
			num = in.nextInt(); // Asigns a value to the variable.
			in.nextLine(); // Stops the scann.
			a.add(num); // Adds the data scanned into the array.
					
			System.out.println("Do you want to give another number? "); // Print that asks the user if he wants enter another number.
			d = in.nextLine(); // The users's desicion.
		 }
		System.out.println("Entered numbers, ordered from lowest to highest "); // Print that indicates the order of the numbers.
			
		a.sort(null); // Orders the numbers.
		for(int i=0; i<a.size(); i++) // Loop
		{
			System.out.println(a.get(i)); // Prints the numbers.
			aux = Integer.toString(a.get(i)); // Converts the integer to a string position by position so that the numbers can be written to the file and not taken as ASCII code.
			w.write(aux); // Writs on the file.
			w.newLine();
		}
		w.close(); // Closes the file.
	}
}