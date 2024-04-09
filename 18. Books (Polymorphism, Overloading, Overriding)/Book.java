/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Books
   =========================================================== */

public class Book // Class Book
{
	public String getTitle() // Method that returns a string.
	{
		return "\nBook Title: "; // String to return.
	}
	public String readPage(int p) // Method that returns a string.
	{
		return ("\nRead Page: " + p); // String to return.
	}
	public String readPage(int p1, int p2) // (Overloading, different parameters) Method that returns a string.
	{
		return ("\nRead Pages: " + p1 + " and " + p2); // String to return.
	}

}