/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Static Pokemon
   =========================================================== */

// Class EclectricPokemon that extends from the class Pokemon
public class ElectricPokemon extends Pokemon
{
	// Constructor
	public ElectricPokemon()
	{
		// Static variable + 1.
		pokemonCounter++;
	}

	// Method that returns a string.
	public String attack()
	{
		// String to return.
		return "\nElectric Attack!!!";
	}
}