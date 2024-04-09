/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Hangman
   =========================================================== */

/* =============================================================
    This specific file is to read words from a file.
============================================================== */

// Libraries
import java.io.*;
import java.util.*;

// Class
public class FileReader 
{
    private BufferedReader reader = null;

    private ArrayList<String> words = new ArrayList<String>(); // Creation of array.

    public ArrayList<String> getWords() // Method to get the words.
    {
        return words; // Returns the words.
    }

    public void setWords() throws IOException // Method to read the words from a file and save them in an ArrayList.
    {
        try
        {
            reader = new BufferedReader(new java.io.FileReader("WordsList.txt")); // Method to read the file.
            String word; // String variable.
            while ((word = reader.readLine()) != null) // Condition
                words.add(word); // Method to add the words to the array.
        }
        finally
        {
            if (reader != null) // Condition
                reader.close(); // Closes the file.
        }
    }
}