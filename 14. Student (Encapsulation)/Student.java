/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Student
   =========================================================== */
   
public class Student
{
	private String name;
	private Address homeAddress;
	private Address schoolAddress;

	public Student(String name, Address homeAddress, Address schoolAddress)
	{
		this.name = name;
		this.homeAddress = homeAddress;
		this.schoolAddress = schoolAddress;
	}

	public String getStudentData()
	{
		return("\n\nStudent's Name: " + name + "\nStudent's Home Address: " + homeAddress.getAddress() + "\nStudent's School Address: " + schoolAddress.getAddress());
	}
}