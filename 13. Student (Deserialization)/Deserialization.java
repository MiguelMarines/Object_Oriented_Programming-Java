/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Student
   =========================================================== */

// Libraries
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization // Class Deserialization
{

	public String getStudentData() // Method to get the student's data
	{
		String student1nfo=""; //Initialize de variable
		String student2nfo=""; //Initialize de variable

		try {

			FileInputStream fi = new FileInputStream(new File("Student's Information(Serialized).txt"));// Gets the Name of the input file
			ObjectInputStream oi = new ObjectInputStream(fi); // Gets the objects of the file

			// Read objects
			Student student1 = (Student) oi.readObject(); // asigns the object to student1
			Student student2 = (Student) oi.readObject();// asigns the object to student2
			student1nfo=student1.toString(); // Converts the object extrated from the file into string
			student2nfo=student2.toString(); // Converts the object extrated from the file into string

			//System.out.println(student1.toString()); // Other alternative for the solution
			//System.out.println(student2.toString()); // Other alternative for the solution

			oi.close();// Closes the object input
			fi.close();// Closes the file input

		} 
		catch (FileNotFoundException e)// Prints the error that the file was not found
		{
			System.out.println("File not found");
		}
		catch (IOException e) // Prints the error that the stream could not be inizialized
		{
			System.out.println("Error initializing stream");
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (student1nfo+"\n"+student2nfo); // Returns string variables

	}

}