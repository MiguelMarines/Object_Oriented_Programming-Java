/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Plane
   =========================================================== */

/* =========================================================================
   This program helps to obtain the model and revolutions per minute 
   of the engine. 
   ======================================================================= */

// Class
public class Engine 
{
    // Variables
    private int rpm;
    private String model;

    // Constructor of engine.
    public Engine(int rpm, String model)
    {

        this.rpm = rpm; 
        this.model = model; 
    }

    // Method to obtain the engine characteristics.
    public String getEngineData()
    {
        return ("\n\nEngine: \nRPM: " + rpm + " Model: " + model); 
    }
}