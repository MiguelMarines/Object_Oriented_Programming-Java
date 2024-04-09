/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Static Pokemon (Static)
   =========================================================== */

// Library
import java.util.ArrayList;

// Class Test Pokemon
public class TestPokemon
{
	public static void main(String[] args)
	{
		// Array
		ArrayList<Pokemon> arrayPokemon=new ArrayList<Pokemon>();
		
		// Creation of objects.
		Pokemon firePokemon= new FirePokemon();
		Pokemon waterPokemon= new WaterPokemon();
		Pokemon electricPokemon= new ElectricPokemon();

		// Adds the created objects to the arrayPokemon.
		arrayPokemon.add(firePokemon);
		arrayPokemon.add(waterPokemon);
		arrayPokemon.add(electricPokemon);

		// Loop
		for(int i=0;i<arrayPokemon.size();i++)
		{
			// Method to print the elements from the array and and method to attack.
			System.out.println(arrayPokemon.get(i).attack());	
		}
		// Static method to print the number of pokemons.
		Pokemon.printCountPokemon();
	}

}