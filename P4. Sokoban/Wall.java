/*
* Object Oriented Programming
 * Author: Miguel Marines
 * Activity: Sokoban
 * 
 * Program with the charasteristics and properties of the walls.
*/

// Package Name
package gui.s;

// Libraries
import java.awt.Image;
import javax.swing.ImageIcon;

// Class Wall
public class Wall extends Ball
{
	// Variable
    private Image image;
    
    // Constructor
    public Wall(int x, int y)
    {
        super(x, y);
        
        initWall();
    }
    
    // Method to give properties to the walls.
    private void initWall()
    {
        ImageIcon iicon = new ImageIcon("src/resources/Wall.jpg");
        image = iicon.getImage();
        setImage(image);
    }
}
