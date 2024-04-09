/*
* Object Oriented Programming
 * Author: Miguel Marines
 * Activity: Sokoban
 * 
 * Program with the charasteristics and properties of the FireBall.
*/

// Package Name
package gui.s;

// Libraries
import java.awt.Image;
import javax.swing.ImageIcon;

// Class FireBall
public class FireBall extends Ball
{
	// Constructor
  public FireBall(int x, int y)
  {
      super(x, y);
      initFireBall();
  }
  
  // Method to give properties to the FireBall.
  private void initFireBall()
  {
      ImageIcon iicon = new ImageIcon("src/resources/FireBall.png");
      Image image = iicon.getImage();
      setImage(image);
  }

  // Method to move the FireBall.
  public void move(int x, int y)
  {
      
      int dx = x() + x;
      int dy = y() + y;
      
      setX(dx);
      setY(dy);
  }
}
