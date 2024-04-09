/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Quiz
   =========================================================== */

 // Imports the library in order to scann.
import java.util.Scanner;

// Class
public class Quiz
{
	// Main
	public static void main(String [] args)
	{
		// String variables with the questions and possible answers.
		String q1="Who is the fastes swimmer in the 100m Fly?"
				+"\n(a)Michael Phelps\n(b)Joseph Schooling\n(c)Chad le Clos\n(d)Caeleb Dressel";
		String q2="Who has the World Record in the 200m IM?"
				+"\n(a)Ryan Lochte\n(b)Michael Andrew\n(c)Ryan Lochte\n(d)Michael Phelps";
		String q3="Who won the 50 Free at the Olimpycs in London 2012?"
				+"\n(a)Cesar CieloC\n(b)Florent Manadou\n(d)Vladimir Morozov\n(c)Nathan Adrian";
		String q4="When did Michael Phelps retired definitely"
				+"\n(a)2008\n(b)2012\n(c)2016\n(d)2015";
		String q5="Which smimming stroke is the fastest?"
				+"\n(a)Butterfly\n(b)Backstroke\n(c)Breaststroke\n(d)Crawl";

		// Array of questions with their answers.
		Question [] questions = 
		{
			new Question(q1,"d"),
			new Question(q2,"a"),
			new Question(q3,"b"),
			new Question(q4,"c"),
			new Question(q5,"d")
		};
		takeTest(questions); // Calls the method takeTest with the array of questions as a parameter.
	}
	public static void takeTest(Question[] questions) // Method takeTest
	{
		System.out.println("The topic of the quiz is swimming and swimming history"); // Prints the topic of the quiz.
		int score = 0; // Inicial value of the score.
		Scanner keyboardInput = new Scanner(System.in); // Creates the scanns.
		
		for(int i=0; i<5; i++) // Loop to run all the questions
		{
			System.out.println(questions[i].prompt); // Prints the questions.
			String answer = keyboardInput.nextLine(); // Scanns the answers.
			
			if(answer.equals(questions[i].answer)) // Verifies if the answer is correct.
			{
				score = score + 20; // Modifies the value of the score.
			}
		}

		System.out.println("The score is " + score + " out of 100"); // Prints the score.
	}
}