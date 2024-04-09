/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Static Pokemon
   =========================================================== */

// Class FirePokemon that extends from the class Pokemon.
public class FirePokemon extends Pokemon
{
	// Constructor
	public FirePokemon()
	{
		// Static variable + 1.
		pokemonCounter++;
	}
	// Method that returns a string.
	public String attack()
	{
		// String to return.
		return "\nFire Attack!!!";
	}
}