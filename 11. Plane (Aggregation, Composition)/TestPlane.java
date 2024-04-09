/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Plane
   =========================================================== */


/* =========================================================================
   Activity: Plane (Aggregation, Composition)

   This class,"Test Plane", anables to test the other created classes
   Engine, Passenger, and Plane and obtains the required information.
   
   The program involves other programs with aggregation and composition
   relationships.
========================================================================== */

// Class
public class TestPlane 
{
    public static void main (String[] args) // Main
    {

        Passenger passenger1 = new Passenger("John", "First Class"); // Creates the passenger object with its parameters.
        Plane plane = new Plane(300, "American Airlines"); // Creates the object plane with its parameters.

        plane.setPassenger(passenger1); // Method setPassenger from the Plane class with parameter passenger1.

        System.out.println(plane.getData()); // Prints the obtained data.
    }
}