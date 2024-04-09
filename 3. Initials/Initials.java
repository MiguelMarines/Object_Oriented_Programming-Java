/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Initials
   =========================================================== */


/* =============================================================
   Activity: Initials
   
    The program asks for the user full name and then displays
	the initials of the name on the screen in block letters.
============================================================== */

import java.io.*; // Imports library

class Initials // Class Initials
{
	public static void main(String[] args) throws IOException // Main
	{
		String Str; // Declaration of Str
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); // Reads the input seqquence.
		
		System.out.println("Please enter your full name: "); // Print that asks the user for her/his full name.
		Str = BR.readLine(); // Scans the string and asigns it to Str.
		Str = " " + Str; // Modifies Str
		String Str1 = ""; // Asigns a string to Str1.

		for(int i=0; i<Str.length(); i++) // For that runs all the string spaces.
		{
			if(Str.charAt(i)==' ') // Helps to obtain the initials with the space.
			{
				Str1=Str1+Str.charAt(i+1)+"."; // Helps to create a string with the initials.
				if(Str.charAt(i+1)=='A' || Str.charAt(i+1)=='a') // Compares the initial with the character.
				{
					System.out.println("*******"); // Prints the initial.
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*******");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='B' || Str.charAt(i+1)=='b') // Compares the initial with the character.
				{
					System.out.println("******"); // Prints the initial.
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*******");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("******");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='C' || Str.charAt(i+1)=='c') // Compares the initial with the character.
				{
					System.out.println(" ******"); // Prints the initial.
					System.out.println("*");
					System.out.println("*");
					System.out.println("*");
					System.out.println("*");
					System.out.println("*");
					System.out.println(" ******");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='D' || Str.charAt(i+1)=='d') // Compares the initial with the character.
				{
					System.out.println("*****"); // Prints the initial.
					System.out.println("*    *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*****");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='E' || Str.charAt(i+1)=='e') // Compares the initial with the character.
				{
					System.out.println("*******"); // Prints the initial.
					System.out.println("*");
					System.out.println("*");
					System.out.println("*******");
					System.out.println("*");
					System.out.println("*");
					System.out.println("*******");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='F' || Str.charAt(i+1)=='f') // Compares the initial with the character.
				{
					System.out.println("*******"); // Prints the initial.
					System.out.println("*");
					System.out.println("*");
					System.out.println("*******");
					System.out.println("*");
					System.out.println("*");
					System.out.println("*");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='G' || Str.charAt(i+1)=='g') // Compares the initial with the character.
				{
					System.out.println(" *****"); // Prints the initial.
					System.out.println("*     *");
					System.out.println("*");
					System.out.println("*  ****");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println(" ***** ");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='H' || Str.charAt(i+1)=='h') // Compares the initial with the character.
				{
					System.out.println("*     *"); // Prints the initial.
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*******");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='I' || Str.charAt(i+1)=='i') // Compares the initial with the character.
				{
					System.out.println("*******"); // Prints the initial.
					System.out.println("  ***  ");
					System.out.println("  ***  ");
					System.out.println("  ***  ");
					System.out.println("  ***  ");
					System.out.println("  ***  ");
					System.out.println("*******");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='J' || Str.charAt(i+1)=='j') // Compares the initial with the character.
				{
					System.out.println("*******"); // Prints the initial.
					System.out.println("   ***");
					System.out.println("   ***");
					System.out.println("   ***");
					System.out.println("   ***");
					System.out.println("   ***");
					System.out.println("*****");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='K' || Str.charAt(i+1)=='k') // Compares the initial with the character.
				{
					System.out.println("*   **"); // Prints the initial.
					System.out.println("*  **");
					System.out.println("* **");
					System.out.println("***");
					System.out.println("* **");
					System.out.println("*  **");
					System.out.println("*   **");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='L' || Str.charAt(i+1)=='l') // Compares the initial with the character.
				{
					System.out.println("**"); // Prints the initial.
					System.out.println("**");
					System.out.println("**");
					System.out.println("**");
					System.out.println("**");
					System.out.println("**");
					System.out.println("*******");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='M' || Str.charAt(i+1)=='m') // Compares the initial with the character.
				{
					System.out.println("**   **"); // Prints the initial.
					System.out.println("* *  **");
					System.out.println("*  *  *");
					System.out.println("*  *  *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='N' || Str.charAt(i+1)=='n') // Compares the initial with the character.
				{
					System.out.println("**    *"); // Prints the initial.
					System.out.println("* *   *");
					System.out.println("*  *  *");
					System.out.println("*   * *");
					System.out.println("*   * *");
					System.out.println("*    **");
					System.out.println("*     *");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='O' || Str.charAt(i+1)=='o') // Compares the initial with the character.
				{
					System.out.println(" *****"); // Prints the initial.
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println(" *****");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='P' || Str.charAt(i+1)=='p') // Compares the initial with the character.
				{
					System.out.println("******"); // Prints the initial.
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("******");
					System.out.println("*");
					System.out.println("*");
					System.out.println("*");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='Q' || Str.charAt(i+1)=='q') // Compares the initial with the character.
				{
					System.out.println(" *****"); // Prints the initial.
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*   * *");
					System.out.println(" *****");
					System.out.println("      *");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='R' || Str.charAt(i+1)=='r') // Compares the initial with the character.
				{
					System.out.println("******"); // Prints the initial.
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("******");
					System.out.println("* *");
					System.out.println("*  *");
					System.out.println("*   *");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='S' || Str.charAt(i+1)=='s') // Compares the initial with the character.
				{
					System.out.println(" ******"); // Prints the initial.
					System.out.println("*");
					System.out.println("*");
					System.out.println(" *****");
					System.out.println("      *");
					System.out.println("      *");
					System.out.println("******");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='T' || Str.charAt(i+1)=='t') // Compares the initial with the character.
				{
					System.out.println("*******"); // Prints the initial.
					System.out.println("   *   ");
					System.out.println("   *   ");
					System.out.println("   *   ");
					System.out.println("   *   ");
					System.out.println("   *   ");
					System.out.println("   *   ");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='U' || Str.charAt(i+1)=='u') // Compares the initial with the character.
				{
					System.out.println("*     *"); // Prints the initial.
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println(" *****");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='V' || Str.charAt(i+1)=='v') // Compares the initial with the character.
				{
					System.out.println("*     *"); // Prints the initial.
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println(" *   *");
					System.out.println("  * *");
					System.out.println("   *");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='W' || Str.charAt(i+1)=='w') // Compares the initial with the character.
				{
					System.out.println("*     *"); // Prints the initial.
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*  *  *");
					System.out.println("* * * *");
					System.out.println("**   **");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='X' || Str.charAt(i+1)=='x') // Compares the initial with the character.
				{
					System.out.println("**   **"); // Prints the initial.
					System.out.println("  * *");
					System.out.println("   *");
					System.out.println("   *");
					System.out.println("  * *");
					System.out.println("**   **");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='Y' || Str.charAt(i+1)=='y') // Compares the initial with the character.
				{
					System.out.println("*     *"); // Prints the initial.
					System.out.println(" *   *");
					System.out.println("  * *");
					System.out.println("   *");
					System.out.println("   *");
					System.out.println("   *");
					System.out.println("       ");
					System.out.println("       ");
				}
				if(Str.charAt(i+1)=='Z' || Str.charAt(i+1)=='z') // Compares the initial with the character.
				{
					System.out.println("*******"); // Prints the initial.
					System.out.println("    *");
					System.out.println("   *");
					System.out.println("  *");
					System.out.println(" *");
					System.out.println("*");
					System.out.println("*******");
					System.out.println("       ");
					System.out.println("       ");
				}
			}
		}
		System.out.println("Initials of the given name: " + Str1); // Prints the Initials of the name.
	}
}