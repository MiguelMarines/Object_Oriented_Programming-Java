/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Central Tendency
   =========================================================== */


/* =============================================================
   Activity: Central Tendency
   
    Program to create an array of n numbers and calculate the
	size of the array, the mean, mode and average of the
	numbers in the array.
============================================================== */

import java.util.Scanner;
import java.lang.Math;

public class Test
{
	public static void main(String[] args) 
    {

    	Scanner sc = new Scanner(System.in);
    	int numberIntegers;
    	

    	System.out.println("\nHow many integers do you want in the array: ");
    	numberIntegers = sc.nextInt();
    	int[] arreglo= new int[numberIntegers];

    	for (int i = 0; i < numberIntegers; i++)
    	{
			System.out.print("\nEnter Number: ");
			arreglo[i] = sc.nextInt();
		}
		CentralTendency calc = new CentralTendency(arreglo);
		float mean = calc.mean();
		int median = calc.median();
		int mode = calc.mode();
		System.out.println("\n\nIntegers in the Array: " + arreglo.length);
		System.out.println("The mean is: " + mean);
		System.out.println("The median is: " + median);
		System.out.println("The mode is: " + mode);
    }	
}