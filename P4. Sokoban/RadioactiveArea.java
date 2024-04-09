/*
* Object Oriented Programming
 * Author: Miguel Marines
 * Activity: Sokoban
 * 
 * Program with the charasteristics and properties of the RadioactiveArea.
*/

// Package Name
package gui.s;

// Libraries
import java.awt.Image;
import javax.swing.ImageIcon;

// Class RadioactiveArea
public class RadioactiveArea extends Ball
{
	
	// Constructor
  public RadioactiveArea(int x, int y)
  {
      super(x, y);
      
      initRadioactiveArea();
  }
  
  // Method to give properties to the RadioactiveArea.
  private void initRadioactiveArea()
  {
      ImageIcon iicon = new ImageIcon("src/resources/RadioactiveArea.jpg");
      Image image = iicon.getImage();
      setImage(image);
  }
}
