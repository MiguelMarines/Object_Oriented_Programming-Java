/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Random Numbers
   =========================================================== */


/* =============================================================
   Activity: Random Numbers
   
    In the program the user has to guess a random number between
	1 and 25, the user has three tries (the program validates the
	inputs, it only accepts numbers); at the end the user will know
	if he or she was right or wrong and what the random number was.
	============================================================== */

import java.util.Random; // Library to obtain random numbers.
import java.util.Scanner; // Library to scann.

public class RandomNumber // Class
{ 
    public static void main(String args[]) // Main
    {
        Random rand = new Random(); // Creates random.
		int rand_int1 = 1 + rand.nextInt(25); // Generates a random integer in a range of 1 to 25.
       
		int i = 1; // Variable to keep control of the loop.
        boolean isNum; // Variable with two values true or false.
       
		System.out.println("\nGuess a random number between 1 and 25, you have 3 tries"); // Prints the instructions.
        
		// Loop
		while(i <= 3)
        {
    		System.out.println("\nGuess number " + i + ": "); // Print that asks for a number.
    		Scanner sc = new Scanner(System.in); // Creates a scann.
    		
			int num = 0; // Variable num.
    		do // Loop to validate the input.
    		{
    			if(sc.hasNextInt()) // Condicional
    			{
    				num = sc.nextInt(); // Reads user's input and asings it to a variable.
    				isNum = true; // Gives the value of true to the variable.
    			}
    			else
    			{
    				System.out.println("Unvalid Input, try again with a number from 1 to 25"); // Prints unvalid input.
    				isNum = false; // Gives the value of false to the variable.
    				sc.next(); // Reads user's input.
    			}
    		}
    		while(!(isNum)); // Condition to keep the loop running.
        	i++; // variable plus 1.
        	
			if(rand_int1 == num) // Condicional.
        	{
        		i = 4; // The variable has a new value.
        		System.out.println("CORRECT!"); // Prints that the guess was correct.
        	}
        	if(rand_int1 != num) // Condicional
        	{
        		System.out.println("WRONG GUESS!"); // Prints that the guess was incorrect.
        	}
        }
        System.out.println("THE RANDOM NUMBER IS: " + rand_int1); // Prints the random integer.
    } 
} 