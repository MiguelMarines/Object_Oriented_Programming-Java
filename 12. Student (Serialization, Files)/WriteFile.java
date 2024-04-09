/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Student
   =========================================================== */

// Libraries
import java.io.File;
import java.io.*;
import java.util.*;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;

// Class WriteFile  (Text)
public class WriteFile
{
	// Method to write a file (Text). The parameters are strings.
	public void writeFile(String student1, String student2)
	{
		try
		{
			File file = new File("Student's Information(Text).txt"); // Creates and asigns a name to the file.

			// Condition
			if(!file.exists())
			{
				file.createNewFile(); // Method to create file.
			}
			
			PrintWriter pw = new PrintWriter(file); // Creates a printwriter object (using created file).
			pw.println(student1); // Prints the data in the file.
			pw.println(student2); // Prints the data in the file.
			pw.close(); // Closes the file.
		}
		catch(IOException e)
		{
			e.printStackTrace(); // This method prints a stack trace for this Throwable object on the standard error output stream.
		}
	}
}