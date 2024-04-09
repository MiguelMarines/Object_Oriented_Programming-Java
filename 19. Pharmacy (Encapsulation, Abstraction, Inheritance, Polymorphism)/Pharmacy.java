/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Pharmacy
   =========================================================== */

// Library
import java.util.ArrayList;

// Class
public class Pharmacy
{
	// Creates new array.
	private ArrayList<Medicine> arrayMedicine = new ArrayList<Medicine>();

	// Method to add medicines to the array.
	public void addMedicine(Medicine medicine)
	{
		arrayMedicine.add(medicine);
	}
	
	// Method to obtain the medicine's data and return a string.
	public String getData() 
	{
		String data = "";
		for(int i=0; i<arrayMedicine.size(); i++)
		{
			data = data + arrayMedicine.get(i).getMedicineData();
		}
		return data;
	}
}