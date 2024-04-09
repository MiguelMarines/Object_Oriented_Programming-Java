/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Quiz
   =========================================================== */

/* =============================================================
   Problem: Quiz
   
    The program is an interactive quiz, that asks the user five
	questions, multiple choice, about swimming and swimming history.
	The program prints the score at the end.
============================================================== */

// Class
public class Question
{
	// String variables
	String prompt;
	String answer;

	public Question(String prompt, String answer)
	{
		// Current objects
		this.prompt = prompt; 
		this.answer = answer;
	}
}