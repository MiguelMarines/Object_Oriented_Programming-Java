/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Pharmacy
   =========================================================== */

// Library
import java.util.ArrayList;

// Class Medicine
public class Medicine
{
	// Variables
	private String name;
	private String category;
	private String date;
	private int number;

	// Arrays
	private ArrayList<Ingridient> arrayIngridient;

	// Constructor of medicine.
	public Medicine(String name, String category, String date, int number)
	{
		this.name = name;
		this.category = category;
		this.date = date;
		this.number = number;
		arrayIngridient = new ArrayList<Ingridient>();
	}

	// Setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public void setExpirationDate(String date)
	{
		this.date = date;
	}
	public void setNumberPills(int number)
	{
		this.number = number;
	}
	
	// Getters
	public String getName()
	{
		return(name);
	}
	public String getCategory()
	{
		return(category);
	}
	public String getExpirationDate()
	{
		return(date);
	}
	public int getNumberPills()
	{
		return(number);
	}

	// Method to add ingredient.
	public void addIngridient(String nameIngridient, float mg)
	{
		Ingridient ing = new Ingridient(nameIngridient, mg);
		arrayIngridient.add(ing);
	}
	
	// Method to the medicine's data in a string.
	public String getMedicineData()
	{
		String data = "\n\nMedicine's Name: " + name + "\nMedicine's Category: " + category + "\nMedicine's Expiration Date: " + date + "\nMedicine's Number of Pills: " + number;
		for(int i=0; i<arrayIngridient.size(); i++)
		{
			data = data + arrayIngridient.get(i).getIngridientData();
		}
		return data;
	}
}