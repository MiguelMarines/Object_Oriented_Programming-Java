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

// Class WriteFileS (Serialized)
public class WriteFileS
{

	// Method to write a file (serialized).  The parameters are objects.
	public void writeFileS(Student student1,Student student2)
	{
		try
		{
			// Creates a file and asigns a name to it.
			FileOutputStream fileOutput = new FileOutputStream(new File("Student's Information(Serialized).txt"));
			// Creates an object that will allow writing serialized objects in the indicated file. (in this case the created fileOutput).
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

			// Write objects to file.
			objectOutput.writeObject(student1);
			objectOutput.writeObject(student2);

			// Closes the files
			objectOutput.close();
			fileOutput.close();

		} 
		catch (IOException e)
		{
			System.out.println("Error initializing stream"); // Prints error
		}
	}

}