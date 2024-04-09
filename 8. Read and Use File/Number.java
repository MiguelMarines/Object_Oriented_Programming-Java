/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Read a file and use its content.
   =========================================================== */


/* =============================================================
   Activity: Read a file and use its content.
   
    The program uses a text file that contains 10 numbers, the
    program reeds the numbers from the file and displays them on
    the screen, then orders the numbers from top to bottom and
    from bottom to top, then adds all the numbers, obtains the
    average and standard deviation and finds the highest and the
    smallest number.
============================================================== */

// Libraries
import java.io.*;
import java.lang.Math;

// Class
public class Number
{ 
  // Main
  public static void main(String[] args)throws Exception
  { 

    int i=0, j=0, aux, sum=0, average=0, max=0, min=0; // Int variables
    double deviation; // Double variable
    String name, st, stUpper;// String variables
    
    String[] array = new String[10]; // String array
    Integer[] num = new Integer[10]; // Int array

    name = "Numbers.txt"; // String variable asignation.
    
    File file = new File(name); // Finds the location of the file to read.
    BufferedReader br = new BufferedReader(new FileReader(file)); // Reads the file.
  

    // - - - - - - - - - - - - - - - - Numbers - - - - - - - - - - - - - - - - //
    // Print the elements of the array.
    System.out.println("\nNumbers:");
    while ((st = br.readLine()) != null)
    {
      array[i] = String.valueOf(st); // Converts to string.
      num[i] = Integer.parseInt(array[i]); // Asigns integer to the array.
      System.out.println(num[i]); // Prints the elements of the array.
      i = i + 1; // Variable plus 1.
    }


    // - - - - - - - - - - - - - - - - Top-Bottom - - - - - - - - - - - - - - - - //
    // Order the numbers from Top to Bottom.
    System.out.println("\nNumbers Top-Bottom:");
    for(i=0; i<num.length; i++) // Loop
    {
      for(j=i+1; j<num.length; j++) // Loop
      {
        if(num[i]<num[j]) // Conditional
        {
            aux = num[i]; // Variable aquires new value of the array.
            num[i] = num[j]; // Variable of the array aquires new value.
            num[j] = aux; // Variable of the array aquires new value.
        }
      }
    }
    for(i=0; i<num.length; i++) // Loop
    {
      System.out.println(num[i]); // Prints 
    }


    // - - - - - - - - - - - - - - - - Bottom-Top - - - - - - - - - - - - - - - - //
    // Order the numbers from Bottom to Top.
    System.out.println("\nNumbers Bottom-Top:"); // Print 
    for(int x= 0; x<num.length; x++) // Loop
    {
      for(i=0; i<num.length-x-1; i++) // Loop
      {
        if(num[i]>num[i+1]) // Conditional
        {
          int tmp = num[i+1]; // Variable int aquires new value of the array integer plus 1.
          num[i+1] = num[i]; // Modifies the variable of the array.
          num[i] = tmp; // Modifies the variable of the array.
        }
      }
    }
    for(i=0; i<num.length; i++) // Loop
    {
      System.out.println(num[i]); // Print
    }


    // - - - - - - - - - - - - - - - - Sum - - - - - - - - - - - - - - - - //
    // Addition of the numbers.
    for(i=0; i<num.length; i++) // Loop
    {
      sum = sum + num[i]; // The variable sum aquires a new value.
    }
    System.out.println("\nSum of all Numbers: " + sum); // Prints the addition of the numbers.


    // - - - - - - - - - - - - - - - - Average - - - - - - - - - - - - - - - - //
    // Average of the numbers.
    for(i=0; i<num.length; i++) // Loop
    {
      average = sum / num.length; // Obtains the average and gives the value to the variable average.
    }
    System.out.println("\nAverage:  " + average); // Prints the average.


    // - - - - - - - - - - - - - - - - Standard Deviation - - - - - - - - - - - - - - - - //
    // Standard deviation of the numbers.
    double d = sum; // Creates a Double variable.
    double b = average; // Creates a Double variable.
    deviation = Math.sqrt((Math.pow(d,2)/10) - Math.pow(b,2)); // Obtains the standard deviation.
    System.out.println("\nSatandar Deviation:  " + deviation); // Prints the standard debiation.


    // - - - - - - - - - - - - - - - - Highest Number - - - - - - - - - - - - - - - - //
    // Highest number of the numbers.
    for(i=0; i<num.length; i++) // Loop
    {
      if(max < num[i]) // Conditional
      {
        max = num[i]; // The variable aquires a new value from the array.
      }
    }
    System.out.println("\nHighest Number: " + max); // Prints the highest number.


    // - - - - - - - - - - - - - - - - Smallest Number - - - - - - - - - - - - - - - - //
    // Smallest number of  the numbers.
    for(i=0; i<num.length; i++) // Loop
    {
      if(max > num[i]) // Conditional
      {
        max = num[i]; // The variable aquires a new value from the array.
      }
    }
    System.out.println("\nSmallest Number: " + max); // Prints the smallest number.

  }
}