/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Plane
   =========================================================== */

/* =========================================================================
   The program obtains the capacity and airline of the plane.
   
   The program also has the getData method that returs tha characteristics
   of the plane, engine and passengers.
   ======================================================================= */

// Class
public class Plane
{
    private int capacity; // Int variable
    private String airline; // String Variable
    private Engine engine; // Reference to Engine
    private Passenger passenger1; // Reference to Passenger
    
    // Constructor
    public Plane(int capacity, String airline) 
    {
        this.capacity = capacity; 
        this.airline = airline; 
        this.engine = new Engine(5000, "NGX"); // (Composition)
    }

    // (Aggregation) Sets the passenger 1
    public void setPassenger(Passenger passenger1) 
    {
        this.passenger1 = passenger1; 
    }

    // Method that returns the capacity and airline of the plane.
    public String getAirplaneData()
    {
        return ("\nPlane: \nCapacity: " + capacity + " Airline: " + airline);
    }

    // Method to obtain plane, engine, and passenger data.
    public String getData()
    {
        return (this.getAirplaneData() + engine.getEngineData() + passenger1.getPassengerData()); 
    }
}