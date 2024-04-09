/*
* Object Oriented Programming
 * Author: Miguel Marines
 * Activity: Sokoban
 * 
 * Program with the charasteristics and properties of the Sokoban
 * The main is also in this program
*/

// Package Name
package gui.s;

// Libraries
import java.awt.EventQueue;
import javax.swing.JFrame;

// Class Sokoban
public class Sokoban extends JFrame
{
	
	// Variables
	private static final long serialVersionUID = 1L;
	private final int OFFSET = 30;

    // Constructor
	public Sokoban()
    {

        initUI();
    }

    private void initUI()
    {
        // Creation and Properties of the Board.
        Board board = new Board();
        add(board);

        setTitle("Sokoban | Miguel Angel Marines Olvera | A01705317");
        setSize(board.getBoardWidth() + OFFSET, board.getBoardHeight() + 2 * OFFSET);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // Main
    public static void main(String[] args)
    {
        
        EventQueue.invokeLater(() ->
        {
            // Creation of the object game of the class Sokoban.
            Sokoban game = new Sokoban();
            game.setVisible(true);
        });
    }
}
