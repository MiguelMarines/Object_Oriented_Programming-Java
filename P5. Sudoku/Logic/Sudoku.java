/*
 * Object Oriented Programming
 * Author: Miguel Marines
 * 
 * Activity: Sudoku
*/

// This program is to read the file and obtain a matrix that contains the numbers of the sudoku.

package Logic; // Package Name

// Libraries
import java.io.IOException;
import java.util.ArrayList;

import FileManagement.FileReader;

public class Sudoku // Public Class Sudoku
{
	FileReader fr= new FileReader(); // Creation of a FileReader Object.
	int matrizSudoku[][]=new int[9][9]; // Creation of a matrix.
	ArrayList<Integer> arraySudoku = new ArrayList<Integer>(); // Creation of an array.
    
	public int[][] getSudokuMatrix()
    {
    	try
    	{
			   fr.setSudoku(); // Method to set the sudoku.
		  }
      catch (IOException e)
    	{
			   // TODO Auto-generated catch block.
			   e.printStackTrace();
		  }
    	arraySudoku=fr.getSudoku(); // Method to get the sudoku and store it in an array.
    	
    	// Loop to fill the matrix with the values of the array.
    	int pos=0;
    	for(int i=0;i<matrizSudoku.length;i++)
    	{
       	 	for(int j=0;j<matrizSudoku.length;j++)
       	 	{
            	matrizSudoku[i][j]=arraySudoku.get(pos);
            	pos++;
        	}
       	}
       
       // This code is to check the matrix by printing it.
       /*Loop to print the matrix and verify if it's correct.
      	for(int i=0; i<matriz.length; i++)
       	{
      	 	for(int j=0; j<matriz.length; j++)
      	 	{
           		System.out.print("  " + matrizSudoku[i][j]);
           	}
     		System.out.println();
       	}*/
    	
       	return matrizSudoku; // Returns the numbers in a matrix.
    }
}
