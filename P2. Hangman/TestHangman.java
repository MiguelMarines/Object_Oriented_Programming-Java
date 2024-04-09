/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Hangman
   =========================================================== */


/* =============================================================
   Problem: Hangman
   
    This program is a word-guessing game like a Hangman; the
    program chooses randomly a word to guess from a list of words
    from a text file. The program gives the player limited tries
    (depending on the length of the word) and stops after they
    have run out.The program also displays the letters that have
    been already guessed and wrong guessed, finally the program
    stops when all the letters of the word have been guessed.
============================================================== */

// Libraries
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.io.*;

// Class
public class TestHangman
{
    // Main
    public static void main(String args[]) throws IOException, InterruptedException
    {
        boolean gameOver = false; // Boolean variable.
        int attempts = 0; // Int variable.
        int numberOfWrongAttempts = 0; // Int variable.

        ArrayList<String> words = new ArrayList<String>(); // Creates an array.

        // Creation of objects.
        Hangman hangman = new Hangman();
        FileReader fr = new FileReader();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        fr.setWords(); // Set the words.
        words = fr.getWords(); // Method to put get the words from the file and put them in an array.
        String hiddenWord = words.get(r.nextInt(words.size())); // Creation of object hiddenWord.
        hangman.setHiddenWord(hiddenWord); // Sets the hidden word.


        int numberAttempts = hiddenWord.length();

        System.out.println("\nHANGMAN\nTry to guess the word"); // Prints the instructions.
        System.out.println("\nYou will have the chance of " + numberAttempts + " failed guesses "); // Prints the number of attempts.

        // Loop
        while (!gameOver)
        {
            if (!hangman.unhideWord() && numberOfWrongAttempts <= numberAttempts-1) // Condition to keep playing.
            {
                System.out.println(hangman.getHiddenWord()); //Prints hidden word in code.
                hangman.playGuess(attempts, numberOfWrongAttempts); //Prints the game info.
                char attempt = sc.next().charAt(0); // Creation of object scann.

                if (hangman.attemptLetter(attempt)) // Condition
                    attempts++; // Counter
                else
                {
                    attempts++; // Counter
                    numberOfWrongAttempts++; // Counter
                }

            } 
            else if (hangman.unhideWord() && numberOfWrongAttempts <= numberAttempts-1) // Condition if the word has been gussed.
            {
                System.out.println("YOU WON!"); // Print
                System.out.println("YOU FOUND THE HIDDEN WORD: " + hangman.getChosenWord()); // Print
                gameOver = true; // Controler of the game.
            }
            else
            {
                System.out.println("\nYOU LOST"); // Print
                System.out.println("\nTHE HIDDEN WORD WAS: " + hangman.getChosenWord()); // Print
                gameOver = true; // Controler of the game.
            }
            
        }
    }
}