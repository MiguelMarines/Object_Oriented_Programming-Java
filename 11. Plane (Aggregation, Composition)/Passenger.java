/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Plane
   =========================================================== */

/* =========================================================================
   This program obtains the name and travel class of the passenger.
   ======================================================================= */

// Class
public class Passenger
{
    // String variables
    private String name; 
    private String travelClass;

    // Constructor
    public Passenger(String name, String travelClass) 
    {
        this.name = name; 
        this.travelClass = travelClass; 
    }

    // Method to obtain the passenger information.
    public String getPassengerData()
    {
        return ("\n\nPassenger: \nName: " + name + " Travel Class: " + travelClass); 
    }
}