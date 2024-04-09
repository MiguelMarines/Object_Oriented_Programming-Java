/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Pharmacy
   =========================================================== */


/* =============================================================
   Problem: Pharmacy (Encapsulation, Abstraction, Inheritance, Polymorphism)
   
    The program keeps the medicines record of a pharmacy. The
	pharmacy has a set of ‘0-N’ medicines. The medicines have
	name, category, expiration date, number of pills and ‘0-N’
	ingredients, each ingredient has name and milligrams. The
	user of the system will assign all the medicine's info,
	along with the corresponding details of the ingredients.
	All data from each medicine, with its ingredients, will be
	saved in a text file and printed in the console.
============================================================== */

// Libraries
import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.util.*;
import java.io.PrintWriter;
import java.io.BufferedWriter;

// Class TestPharmacy
public class TestPharmacy
{
	public static void main(String args[]) // Main
	{
		// Variables
		int validator;
		String name;
		String category;
		String date;
		int number;
		int numIngridients;
		String nameIngridient;
		float mg;

		// Creates a scanner objects.
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		// Creates a pharmacy object.
		Pharmacy ph = new Pharmacy();

		// Loops
		do
		{

			System.out.println("\nEnter the name of the medicine: "); // Print that asks for data.
			name = sc.nextLine(); // Scann asigned to a variable.

			System.out.println("\nEnter the category of the medicine: "); // Print that asks for data.
			category = sc.nextLine(); // Scann asigned to a variable.

			System.out.println("\nEnter the expiration date of the medicine: "); // Print that asks for data.
			date = sc.nextLine(); // Scann asigned to a variable.

			System.out.println("\nEnter the number of pills of the medicine: "); // Print that asks for data.
			number = sc1.nextInt(); // Scann asigned to a variable.

			Medicine medicine = new Medicine(name, category, date, number); // Creates a medicine object.
			/*med1.setName(name);
			medicine.setCategory(category);
			medicine.setExpirationDate(date);
			medicine.setNumberPills(number);*/

			System.out.println("\nEnter how many ingridients does de medicine have: "); // Print that asks for data.
			numIngridients = sc1.nextInt(); // Scann asigned to a variable.

			// Loop
			for(int i=0; i<numIngridients; i++)
			{

				System.out.println("\nEnter the name of the ingridient: "); // Print that asks for data.
				nameIngridient = sc.nextLine(); // Scann asigned to a variable.
				System.out.println("\nEnter the queantity in milligrams: "); // Print that asks for data.
				mg = sc2.nextFloat(); // Scann asigned to a variable.

				medicine.addIngridient(nameIngridient, mg); // Method to add ingrdient.
			}
			ph.addMedicine(medicine); // Method to add medicine.
			
			System.out.println("\nWould you like to register another medicine? (0->NO 1->YES) "); // Print that asks for data.
			validator = sc1.nextInt(); // Scann asigned to a variable.
		}
		while(validator != 0); // Condition for the loop.

		String data = ph.getData(); // Method getData asigned to a string variable.
		
		WriteFile wf = new WriteFile(); // New writefile object created.
		wf.writeFile(data); // Method to write file.
		
		System.out.println(ph.getData()); // Prints the data in the console.
	}
}