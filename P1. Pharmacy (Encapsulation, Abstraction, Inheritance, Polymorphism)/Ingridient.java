/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Pharmacy
   =========================================================== */

// Class
public class Ingridient
{
	// Variables
	private String nameIngridient;
	private float mg;

	// Constructor of ingredient.
	public Ingridient(String nameIngridient, float mg)
	{
		this.nameIngridient = nameIngridient;
		this.mg = mg;
	}

	// Setters
	public void setIngridientName(String nameIngridient)
	{
		this.nameIngridient = nameIngridient;
	}
	public void setMiligrams(float mg)
	{
		this.mg = mg;
	}

	// Getters
	public String getIngridient()
	{
		return nameIngridient;
	}
	public float getMg()
	{
		return mg;
	}

	// Method to obtain the ingredient's data.
	public String getIngridientData()
	{
		return("\nIngridient's Name: " + nameIngridient + "\nIngridient's Milligrams: " + mg);
	}

}