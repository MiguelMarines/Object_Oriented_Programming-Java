/*
* Object Oriented Programming
 * Author: Miguel Marines
 * Activity: Sokoban
 * 
 * Program with the charasteristics and properties of the LightBall.
*/

// Package Name
package gui.s;

// Libraries
import java.awt.Image;
import javax.swing.ImageIcon;

// Class LightBall
public class LightBall extends Ball
{

	// Constructor
  public LightBall(int x, int y)
  {
      super(x, y);

      initLightBall();
  }
  
  // Method to give properties to LightBall.
  private void initLightBall()
  {

      ImageIcon iicon = new ImageIcon("src/resources/LightBall.png");
      Image image = iicon.getImage();
      setImage(image);
  }

  // Method to move the LightBall.
  public void move(int x, int y)
  {

      int dx = x() + x;
      int dy = y() + y;
      
      setX(dx);
      setY(dy);
  }
}