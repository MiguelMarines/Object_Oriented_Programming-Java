/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Student
   =========================================================== */

// Library
import java.io.Serializable;

// Class Student to serialize object students.
public class Student implements Serializable 
{

	private static final long serialVersionUID = 1L; // Identifier for serializable classes.
	private String name; // String variable
	private String homeAddress; // String variable
	private String schoolAddress; // String variable

	// Constructor - Default
	Student() {};

	// Constructor - Values passed asparameters. The parameters for the method are strings.
	Student(String name, String homeAddress, String schoolAddress)
	{
		this.name = name;
		this.homeAddress = homeAddress;
		this.schoolAddress = schoolAddress;
	}

	@Override
	public String toString() // Method that returns the Student's Data.
	{
		return ("\nStudent's Name: " + name + "\nStudent's Home Address: " + homeAddress + "\nStudent's School Address: " + schoolAddress);
	}
}