/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Static Pokemon
   =========================================================== */

// Class Pokemon
public class Pokemon
{
	// Static variable
	protected static int pokemonCounter = 0;
	
	// Method that returns a string.
	public String attack()
	{
		// String to return
		return "\nPockemon Attaaaaaack!!!";
	}

	// Static method to print the number of pokemons.
	public static void printCountPokemon()
	{
		System.out.println("\nNumber of Pokemons: " + pokemonCounter);
	}
}