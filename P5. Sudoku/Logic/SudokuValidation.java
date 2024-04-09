/*
 * Object Oriented Programming
 * Author: Miguel Marines
 * 
 * Activity: Sudoku
*/

// This progra is to validate the inputs in the sudoku and returns an array with the errors.

package Logic; // Package Name

// Libraries
import java.io.IOException;
import java.util.ArrayList;

import FileManagement.FileReader;

public class SudokuValidation
{
	FileReader fr= new FileReader(); // Creation of a FileReader Object.
	int matrizSudoku[][]=new int[9][9]; // Creation of a matrix.
	ArrayList<Integer> arraySudoku = new ArrayList<Integer>(); // Creation of array.
	ArrayList<int[]> errores = new ArrayList<int[]>(); // Creation of array.
	
	public ArrayList<int[]> validateData(int inputData[][])
    {
    	try
    	{
			   fr.setSudoku();// Method to set the sudoku.
		  }
      catch (IOException e)
    	{
			   // TODO Auto-generated catch block.
			   e.printStackTrace();
		  }
    	arraySudoku=fr.getSudoku(); // Method to get the sudoku.
    	
    	// Loop to get the position of the errors.
    	int pos=0;
    	for(int i=0; i<matrizSudoku.length; i++)
    	{
       	 	for(int j=0; j<matrizSudoku.length; j++)
       	 	{
				matrizSudoku[i][j] = arraySudoku.get(pos);
            	pos++;
        	}
       	}
    
       	for(int i=0; i<matrizSudoku.length; i++)
       	{
      	 	for(int j=0; j<matrizSudoku.length; j++)
      	 	{
           		if(matrizSudoku[i][j] != inputData[i][j])
           		{
           			int error[] = new int[2]; 
           			error[0]=i;error[1]=j;
           			errores.add(error);
           		}
           			
           	}
       	}
    	return errores; // Returns an array with the errors.
    }
}
