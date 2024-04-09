/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Hangman
   =========================================================== */

// Libraries
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Hangman // Class Hangman
{
    // String Variables
    private String chosenWord;
    private String hiddenWord = "";
    private String letter = "";
    private String guessedLetters = "";
    private String wrongLetters = "";

    public void setHiddenWord (String chosenWord) // Method to hide the word.
    {
        this.chosenWord = chosenWord;
        for (int i = 0; i < chosenWord.length(); i++) // Loop
        {
            this.hiddenWord += "_"; // Replaces the characters.
        }
    }

    public boolean attemptLetter (char attempt) // Method to compare the inputs made by the user to the letters of the hiden word.
    {
        letter += attempt;
        String auxString = ""; // String variable.
        for (int i = 0; i < chosenWord.length(); i++) // Loop
        {
            if (attempt == chosenWord.charAt(i)) // Condition
                auxString += attempt;
            else
                auxString += hiddenWord.charAt(i);
        }

        if(!auxString.equals(hiddenWord)) // Condition
        {
            hiddenWord = auxString;
            guessedLetters += attempt;
            return true;
        }
        else
        {
            wrongLetters += attempt;
            return false;
        }

    }

    public String getChosenWord () // Method to obtain the word from the file.
    {
        return chosenWord; // Returns a word.
    }

    public String getHiddenWord () // Method to get the hidden word.
    {
        System.out.println("\nThe hidden word is: "); // Print.
        return hiddenWord; // Returns the hidden word.
    }

    public void playGuess (int attemptsQuantity, int numberOfWrongAttempts) // Method that prints the info of the game.
    {
        if (attemptsQuantity > 0) // Condition
        {
            // Prints
            System.out.println("\nNo. Attempts: " + attemptsQuantity);
            System.out.println("Rigth Guesses: " + guessedLetters);
            System.out.println("No. Wrong Guesses: " + numberOfWrongAttempts);
            System.out.println("Wrong Guesses: " + wrongLetters);
        }

        System.out.println("\nWrite your guess(one letter at a time): "); // Prints on the console.
    }

    public boolean unhideWord() // Method that will return true or false.
    {
        if (chosenWord.equalsIgnoreCase(hiddenWord))
            return true;
        else
            return false;
    }
}
