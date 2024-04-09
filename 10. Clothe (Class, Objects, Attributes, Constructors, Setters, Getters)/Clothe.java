/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Clothe
   =========================================================== */


/* ===========================================================================
   Activity: Clothe (Class, Objects, Attributes, Constructors, Setters, Getters)
   
   The purpose of theses program is to understand the functionalities of
   classes, attributes and methods.
   
   In this case I used the class Clothe, because it is a simple and efficient
   way to demonstrate the characteristics of real entities in object oriented
   programming.
   
   The program prints in the console 2 attributes of 2 different clothes.
============================================================================ */

// Class
public class Clothe
{
  // Atributes
  private String color; 
  private int size;
  
  // Constructors
  public Clothe()
  {
    color = ""; // Predetermined color
    size = 0; // Predetermined value
  }

  public Clothe(String color, int size)
  {
    this.color = color;
    this.size = size;
  }


  // Setters
  public void setColor(String newColor)
	{
		this.color = newColor;
	}

	public void setSize(int newSize)
	{
		this.size = newSize;
	}

  // Getters
	public String getColor()
  {
  	return this.color;
  }

  public int getSize()
  {
  	return this.size;
  }

  // Main  
   	public static void main(String[] args)  
   	{  
   		// Constructor 1 - Object 1
      Clothe clothe1 = new Clothe();

      // Setters
      clothe1.setColor("Blue");
      clothe1.setSize(34);

      // Getters
      String color1 = clothe1.getColor();
      int size1 = clothe1.getSize();

      // Outputs
    	System.out.println("The color of the clothe is " + color1);
      System.out.println("The size of the clothe is " + size1);


      // Constructor 2 - Object 2
      Clothe clothe2 = new Clothe("Red", 32);

      // Outputs
      System.out.println("The color of the clothe is " + clothe2.getColor());
      System.out.println("The size of the clothe is " + clothe2.getSize());
   	}
}