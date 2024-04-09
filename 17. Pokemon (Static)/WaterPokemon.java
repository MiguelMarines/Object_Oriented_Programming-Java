/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Static Pokemon
   =========================================================== */

   // Class WaterPokemon that extends from the class Pokemon
public class WaterPokemon extends Pokemon
{
	// Constructor
	public WaterPokemon()
	{
		// Static variable + 1.
		pokemonCounter++;
	}
	// Method that returns a string.
	public String attack()
	{
		// String to return.
		return "\nWater Attack!!!";
	}
}