/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Student
   =========================================================== */
   
public class Address
{
	private String street;
	private String city;
	private String state;
	private int zipCode;

	public Address(String street, String city, String state, int zipCode)
	{
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public String getAddress()
	{
		return(street+", " + city + ", " + state + ", " + zipCode + ".");
	}
}