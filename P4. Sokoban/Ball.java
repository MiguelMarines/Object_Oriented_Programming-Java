/*
* Object Oriented Programming
 * Author: Miguel Marines
 * Activity: Sokoban
 * 
 * Program with the charasteristics and properties of the ball.
*/

// Package Name
package gui.s;

// Libraries
import java.awt.Image;

// Class Ball
public class Ball
{

	// Variables
    private final int SPACE = 20;

    private int x;
    private int y;
    private Image image;
    
    // Constructor
    public Ball(int x, int y)
    {
        
        this.x = x;
        this.y = y;
    }

    // Getter
    public Image getImage()
    {
        return image;
    }
    // Setter
    public void setImage(Image img)
    {
        image = img;
    }
    // Getter
    public int x()
    {
        
        return x;
    }
    // Getter
    public int y()
    {
        
        return y;
    }
    // Setter
    public void setX(int x)
    {
        
        this.x = x;
    }
    // Setter
    public void setY(int y)
    {
        
        this.y = y;
    }
    
    // Methods to detect the collisions.
    public boolean isLeftCollision(Ball actor)
    {
        
        return x() - SPACE == actor.x() && y() == actor.y();
    }

    public boolean isRightCollision(Ball actor)
    {
        
        return x() + SPACE == actor.x() && y() == actor.y();
    }

    public boolean isTopCollision(Ball actor)
    {
        
        return y() - SPACE == actor.y() && x() == actor.x();
    }

    public boolean isBottomCollision(Ball actor)
    {
        
        return y() + SPACE == actor.y() && x() == actor.x();
    }
}
