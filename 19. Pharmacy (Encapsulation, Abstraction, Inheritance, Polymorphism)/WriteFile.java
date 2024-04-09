/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Pharmacy
   =========================================================== */

// Library
import java.io.File;
import java.io.*;
import java.util.*;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;

// Class WriteFile
public class WriteFile
{
	// Method to write a file.
	public void writeFile(String data)
	{
		try
		{
			// Creates and asigns a name to the file.
			File file = new File("Pharmacy Inventory.txt");

			if(!file.exists())
			{
				// Method to create file.
				file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file); // Creates a printwriter object.
			pw.println(data); // Prints the data in the file.
			pw.close(); // Closes the file.
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}