/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Student (Encapsulation)
   =========================================================== */

public class TestStudent
{
	public static void main(String[] args)
	{
		Address home = new Address("Street 1", " City 1", " State 1",  11111);
		Address school = new Address("Street 2"," City 2"," State 2",22222 );
		Student student = new Student("Student 1", home, school);

		System.out.println(student.getStudentData());
	}
}