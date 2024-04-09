/*
 * Object Oriented Programming
 * Author: Miguel Marines
 * 
 * Activity: Sudoku
*/

// Program to read from a file.

package FileManagement; // Name of the package.

// Libraries
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader // Class Name
{
		private BufferedReader reader = null;
		protected ArrayList<Integer> arraySudoku = new ArrayList<Integer>(); // Creation of array.
	    
	    public FileReader()
	    {	

		}

	    public void setSudoku() throws IOException // Method to read the words from a file and save them in an ArrayList.
	    {
	    	
	        try
	        {
	            reader = new BufferedReader(new java.io.FileReader("numbers.txt")); // Method to read the file.
	            String sNumber; // String variable
	            while ((sNumber = reader.readLine()) != null)// Condition
	                arraySudoku.add(Integer.parseInt(sNumber));// Method to add the words to the array.
	        }
	        finally
	        {
	            if (reader != null) // Condition
	                reader.close(); // Closes the file
	        }
	           
	    }
		
	    public ArrayList<Integer> getSudoku() // Method to get the words.
	    {
	        return arraySudoku; // Returns the numbers in an array.
	    }
	    
}