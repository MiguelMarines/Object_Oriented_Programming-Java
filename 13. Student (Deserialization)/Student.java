/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Student
   =========================================================== */

import java.io.Serializable; // Library

public class Student implements Serializable // Class Student to serialize object students
{

	private static final long serialVersionUID = 1L; // Identifier for serializable classes
	private String name; // String variable
	private String homeAddress; // String variable
	private String schoolAddress; // String variable

	Student() {};

	Student(String name, String homeAddress, String schoolAddress) // Constructor
	{
		this.name = name;
		this.homeAddress = homeAddress;
		this.schoolAddress = schoolAddress;
	}
	public void setName(String name) // Setter of name
	{
		this.name=name;
	}
	public void setHomeAddress(String homeAddress) // Setter of  homeAddress
	{
		this.homeAddress=homeAddress;
	}
	public void setSchoolAddress(String homeAddress) // Setter of schoolAddress
	{
		this.schoolAddress = schoolAddress;
	}
	/*public String getName() // Getter of name
	{
		return(name);
	}
	public String getHomeAddress() // Getter of name
	{
		return(homeAddress);
	}
	public String getSchoolAddress() // Getter of name
	{
		return(schoolAddress);
	}*/



	@Override // Override
	public String toString() // Method that returns the Student's Data
	{
		return ("\nStudent's Name: " + name + "\nStudent's Home Address: " + homeAddress + "\nStudent's School Address: " + schoolAddress);
	}
}