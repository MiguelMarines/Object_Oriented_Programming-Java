/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Student
   =========================================================== */

/* =============================================================
   Activity: Student (Deserialization)
   
   The program retrieves, from a file, serialized objects of the
	type Student, then the program deserializes the objects and
	prints the student’s information on the console.
============================================================== */

public class TestDeserialization // Class TestDeserialization
{
	public static void main(String[] args) // Main
	{
		Deserialization des = new Deserialization(); // Creates an object from the class Deserialization.
		System.out.println(des.getStudentData()); // Prints the deserialized information obtained from the method getStudentData.
	}
}