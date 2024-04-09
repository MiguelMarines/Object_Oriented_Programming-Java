/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Student
   =========================================================== */


/* =============================================================
   Activity: Student (Serialization, File)
   
    The program stores in a file objects of the student class
	and asks the user, at the end of the execution, if he wants
	to save the student’s information in a file in the form of
	text or in the form of serialization.
============================================================== */

// Library
import java.util.Scanner;

// Class
public class TestStudent 
{

	public static void main(String[] args) // Main
	{
		// Creates student's objects.
		Student student1 = new Student("Caeleb Dressel","23, Milton Park Drive, Portland, Oregon, 97035.","130 Maple Drive North, Hendersonville, Tennessee, 37075.");
		Student student2 = new Student("Kathy Anderson", "128 Main Street, Fairmount, Indianapolis, 46928.", "123, Main Street, Las Vegas, Nevada, 46999.");
		// Creates a scanner object.
		Scanner scformat = new Scanner(System.in);

		System.out.println("\nIn which format would you like to save the student's information:"); // Print that asks the saving format.
		System.out.println("\n1. Text"); // Prints Text
		System.out.println("\n2. Serialization"); // Prints Serialization
		System.out.println("\n"); // Line break

		int format = scformat.nextInt(); // Scann asigned to a variable.
		
		// Conditional
		if(format == 1)
		{
			String studentData1 = student1.toString(); // Method getStudentData asigned to a string variable.
			String studentData2 = student2.toString(); // Method getStudentData asigned to a string variable.
			
			WriteFile wf = new WriteFile(); // Creates a writefile object.
			wf.writeFile(studentData1, studentData2); // Method to write file. The parameters for the method are strings.
		}
		else
		{
			WriteFileS wfs = new WriteFileS(); // Creates a writefiles object.
			wfs.writeFileS(student1, student2); // Method to serialize in a file. The parameters for the method are objects.
		}
		
	}

}