/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Books
   =========================================================== */

/* =============================================================
   Problem: Books (Polymorphism, Overloading, Overriding)
   
    This program was developed in order to practice: polymorphism,
	overloading and overriding. The program prints on the console
	the title of the books and the pages to read.
============================================================== */

import java.util.ArrayList; // Array Library

public class TestBook // Class Test Book
{
	public static void main(String[] args) // Main
	{
		ArrayList<Book> arrayBooks = new ArrayList<Book>(); // Creates an array from the Book class.
		
		// Creation of book objects.
		Book book = new Book();
		// (Polymorphism) Creation of objects.
		Book dictionary = new Dictionary();
		Book encyclopedia = new Encyclopedia();

		// Adds the created objects to the arrayBooks.
		arrayBooks.add(dictionary);
		arrayBooks.add(encyclopedia);

		for(int i=0; i<arrayBooks.size(); i++) // Loop
		{
			// Method to print the titles of the books and the method readPage.
			System.out.println(book.getTitle());
			System.out.println(arrayBooks.get(i).getTitle());
			System.out.println(arrayBooks.get(i).readPage(i+7));
			System.out.println(arrayBooks.get(i).readPage(i+16, i+52));

		}

	}

}