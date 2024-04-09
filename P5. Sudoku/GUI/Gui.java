/*
 * Object Oriented Programming
 * Author: Miguel Marines
 * 
 * * Activity: Sudoku
*/

// This program create and give its properties to the user interface.
// This program also contains the main.

package GUI; // Name of the package. 

// Libraries
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;

import Logic.Sudoku;
import Logic.SudokuValidation;

// Public Class Gui.
public class Gui
{
	// Variables of the type frame, textField, button, separator and table.
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JButton btnCheckAnswers;
	private JTextField textField_10;
	private JTextField textField_19;
	private JTextField textField_28;
	private JTextField textField_37;
	private JTextField textField_46;
	private JTextField textField_55;
	private JTextField textField_64;
	private JTextField textField_73;
	
	private JTextField mtf[][]= new JTextField[9][9];
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JTable table_2;
	private JTable table_3;

	


	
	/**
	 * Launch the application.
	 */
	// Main
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Gui window = new Gui(); // Creation of a Gui object.
					window.frame.setVisible(true); // Sets the frame.
					
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() // throws IOException.
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() // Throws IOException.
	{
		int tablero[][]=new int[9][9];
		Sudoku sudoku=new  Sudoku();
		tablero=sudoku.getSudokuMatrix();
		
		// Creates the frame and its properties.
		frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.setBounds(100, 100, 550, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("SUDOKU | Miguel Marines");
		
		// Creates the Lines and its properties.
		separator_1 = new JSeparator();
		separator_1.setBounds(13, 348, 524, 12);
		frame.getContentPane().add(separator_1);
		separator_1.setBackground(Color.black);
		
		separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(12, 176, 524, 12);
		frame.getContentPane().add(separator_2);
		
		table_2 = new JTable();
		table_2.setBackground(Color.BLACK);
		table_2.setBounds(172, 7, 1, 516);
		frame.getContentPane().add(table_2);
		
		table_3 = new JTable();
		table_3.setBackground(Color.BLACK);
		table_3.setBounds(368, 7, 1, 516);
		frame.getContentPane().add(table_3);
		
		
		// Creates the text fields and its properties.
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(13, 7, 50, 50);
		frame.getContentPane().add(textField_1);
		textField_1.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_1.getText().length() >= 1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
			});
		
		//textField_1.setText("1");
		textField_1.setEditable(false);
		textField_1.setText(String.valueOf(tablero[0][0]));
		mtf[0][0]=textField_1;
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(69, 5, 50, 50);
		frame.getContentPane().add(textField);
		
		textField.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		
		///////
		//textField.setText("2");
		textField.setText(String.valueOf(tablero[0][1]));
		textField.setEditable(false);
		mtf[0][1]=textField;
		//////////////
		
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(123, 5, 50, 50);
		frame.getContentPane().add(textField_2);
		
		textField_2.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_2.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_2.setText("3");
		//textField_2.setEditable(false);
		mtf[0][2]=textField_2;
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(185, 5, 50, 50);
		frame.getContentPane().add(textField_3);
		
		textField_3.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_3.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_3.setText("4");
		//textField_3.setEditable(false);
		mtf[0][3]=textField_3;
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(247, 5, 50, 50);
		frame.getContentPane().add(textField_4);
		
		textField_4.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_4.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_4.setText("5");
		//textField_4.setEditable(false);
		mtf[0][4]=textField_4;
		textField_4.setText(String.valueOf(tablero[0][4]));
		textField_4.setEditable(false);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(309, 5, 50, 50);
		frame.getContentPane().add(textField_5);
		
		textField_5.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_5.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_5.setText("6");
		//textField_5.setEditable(false);
		mtf[0][5]=textField_5;
		
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(371, 5, 50, 50);
		frame.getContentPane().add(textField_6);
		
		textField_6.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_6.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_6.setText("7");
		//textField_6.setEditable(false);
		mtf[0][6]=textField_6;
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(426, 5, 50, 50);
		frame.getContentPane().add(textField_7);
		
		textField_7.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_7.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_7.setText("8");
		//textField_7.setEditable(false);
		mtf[0][7]=textField_7;
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(487, 5, 50, 50);
		frame.getContentPane().add(textField_8);
		
		textField_8.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_8.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_8.setText("9");
		//textField_8.setEditable(false);
		mtf[0][8]=textField_8;
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(67, 64, 50, 50);
		frame.getContentPane().add(textField_9);
		
		textField_9.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_9.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_9.setText("2");
		//textField_9.setEditable(false);
		mtf[1][1]=textField_9;

		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(12, 64, 50, 50);
		frame.getContentPane().add(textField_10);
		textField_10.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_10.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_10.setText("1");
		//textField_10.setEditable(false);
		mtf[1][0]=textField_10;
		textField_10.setText(String.valueOf(tablero[1][0]));
		textField_10.setEditable(false);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(121, 64, 50, 50);
		frame.getContentPane().add(textField_11);
		textField_11.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_11.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_11.setText("3");
		//textField_11.setEditable(false);
		mtf[1][2]=textField_11;
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(183, 64, 50, 50);
		frame.getContentPane().add(textField_12);
		
		textField_12.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_12.getText().length() >= 1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
			});
		//textField_12.setText("4");
		//textField_12.setEditable(false);
		mtf[1][3]=textField_12;
		textField_12.setText(String.valueOf(tablero[1][3]));
		textField_12.setEditable(false);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(245, 64, 50, 50);
		frame.getContentPane().add(textField_13);
		
		textField_13.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_13.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_13.setText("5");
		//textField_13.setEditable(false);
		mtf[1][4]=textField_13;
		textField_13.setText(String.valueOf(tablero[1][4]));
		textField_13.setEditable(false);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(307, 64, 50, 50);
		frame.getContentPane().add(textField_14);
		
		textField_14.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_14.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_14.setText("6");
		//textField_14.setEditable(false);
		mtf[1][5]=textField_14;
		textField_14.setText(String.valueOf(tablero[1][5]));
		textField_14.setEditable(false);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(369, 64, 50, 50);
		frame.getContentPane().add(textField_15);
		
		textField_15.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_15.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_15.setText("7");
		//textField_15.setEditable(false);
		mtf[1][6]=textField_15;
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(424, 64, 50, 50);
		frame.getContentPane().add(textField_16);
		
		textField_16.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_16.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_16.setText("8");
		//textField_16.setEditable(false);
		mtf[1][7]=textField_16;
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(485, 64, 50, 50);
		frame.getContentPane().add(textField_17);
		
		textField_17.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_17.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_17.setText("9");
		//textField_17.setEditable(false);
		mtf[1][8]=textField_17;
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(67, 126, 50, 50);
		frame.getContentPane().add(textField_18);
		
		textField_18.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_18.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_18.setText("2");
		//textField_18.setEditable(false);
		mtf[2][1]=textField_18;
		textField_18.setText(String.valueOf(tablero[2][1]));
		textField_18.setEditable(false);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(13, 127, 50, 50);
		frame.getContentPane().add(textField_19);
		textField_19.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_19.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_19.setText("1");
		//textField_19.setEditable(false);
		mtf[2][0]=textField_19;
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(121, 126, 50, 50);
		frame.getContentPane().add(textField_20);		
		textField_20.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_20.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_20.setText("3");
		//textField_20.setEditable(false);
		mtf[2][2]=textField_20;
		textField_20.setText(String.valueOf(tablero[2][2]));
		textField_20.setEditable(false);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(183, 126, 50, 50);
		frame.getContentPane().add(textField_21);
		
		textField_21.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_21.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_21.setText("4");
		//textField_21.setEditable(false);
		mtf[2][3]=textField_21;
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(245, 126, 50, 50);
		frame.getContentPane().add(textField_22);
		
		textField_22.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_22.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_22.setText("5");
		//textField_22.setEditable(false);
		mtf[2][4]=textField_22;
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(307, 126, 50, 50);
		frame.getContentPane().add(textField_23);
		
		textField_23.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_23.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_23.setText("6");
		//textField_23.setEditable(false);
		mtf[2][5]=textField_23;
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(369, 126, 50, 50);
		frame.getContentPane().add(textField_24);
		
		textField_24.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_24.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_24.setText("7");
		//textField_24.setEditable(false);
		mtf[2][6]=textField_24;
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(424, 126, 50, 50);
		frame.getContentPane().add(textField_25);
		
		textField_25.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_25.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_25.setText("8");
		//textField_25.setEditable(false);
		mtf[2][7]=textField_25;
		textField_25.setText(String.valueOf(tablero[2][7]));
		textField_25.setEditable(false);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(485, 126, 50, 50);
		frame.getContentPane().add(textField_26);
		
		textField_26.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_26.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_26.setText("9");
		//textField_26.setEditable(false);
		mtf[2][8]=textField_26;
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(66, 186, 50, 50);
		frame.getContentPane().add(textField_27);
		
		textField_27.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_27.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_27.setText("2");
		//textField_27.setEditable(false);
		mtf[3][1]=textField_27;
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(11, 189, 50, 50);
		frame.getContentPane().add(textField_28);
		textField_28.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_28.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_28.setText("1");
		//textField_28.setEditable(false);
		mtf[3][0]=textField_28;
		textField_28.setText(String.valueOf(tablero[3][0]));
		textField_28.setEditable(false);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(120, 186, 50, 50);
		frame.getContentPane().add(textField_29);
		
		textField_29.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_29.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_29.setText("3");
		//textField_29.setEditable(false);
		mtf[3][2]=textField_29;
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(182, 186, 50, 50);
		frame.getContentPane().add(textField_30);
		
		textField_30.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  ) {
			         e.consume();  // ignore event
			      }
			      if ( textField_30.getText().length() >=  1  ) {
				         e.consume();  // ignore event
				      }
				      
			   }
			});
		//textField_30.setText("4");
		//textField_30.setEditable(false);
		mtf[3][3]=textField_30;
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(244, 186, 50, 50);
		frame.getContentPane().add(textField_31);
		
		textField_31.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_31.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_31.setText("5");
		//textField_31.setEditable(false);
		mtf[3][4]=textField_31;
		textField_31.setText(String.valueOf(tablero[3][4]));
		textField_31.setEditable(false);
		
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(306, 186, 50, 50);
		frame.getContentPane().add(textField_32);
		
		textField_32.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_32.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_32.setText("6");
		//textField_32.setEditable(false);
		mtf[3][5]=textField_32;
		
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(368, 186, 50, 50);
		frame.getContentPane().add(textField_33);
		
		textField_33.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_33.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_33.setText("7");
		//textField_33.setEditable(false);
		mtf[3][6]=textField_33;
		
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(423, 186, 50, 50);
		frame.getContentPane().add(textField_34);
		textField_34.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_34.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_34.setText("8");
		//textField_34.setEditable(false);
		mtf[3][7]=textField_34;
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(484, 186, 50, 50);
		frame.getContentPane().add(textField_35);
		textField_35.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_35.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_35.setText("9");
		//textField_35.setEditable(false);
		mtf[3][8]=textField_35;
		textField_35.setText(String.valueOf(tablero[3][8]));
		textField_35.setEditable(false);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(67, 247, 50, 50);
		frame.getContentPane().add(textField_36);
		textField_36.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_36.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_36.setText("2");
		//textField_36.setEditable(false);
		mtf[4][1]=textField_36;
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(12, 249, 50, 50);
		frame.getContentPane().add(textField_37);
		textField_37.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_37.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_37.setText("1");
		//textField_37.setEditable(false);
		mtf[4][0]=textField_37;
		textField_37.setText(String.valueOf(tablero[4][0]));
		textField_37.setEditable(false);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(121, 247, 50, 50);
		frame.getContentPane().add(textField_38);
		textField_38.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_38.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_38.setText("3");
		//textField_38.setEditable(false);
		mtf[4][2]=textField_38;
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(183, 247, 50, 50);
		frame.getContentPane().add(textField_39);
		textField_39.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_39.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_39.setText("4");
		//textField_39.setEditable(false);
		mtf[4][3]=textField_39;
		textField_39.setText(String.valueOf(tablero[4][3]));
		textField_39.setEditable(false);
		
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(245, 247, 50, 50);
		frame.getContentPane().add(textField_40);
		textField_40.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_40.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_40.setText("5");
		//textField_40.setEditable(false);
		mtf[4][4]=textField_40;

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(307, 247, 50, 50);
		frame.getContentPane().add(textField_41);
		textField_41.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_41.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_41.setText("6");
		//textField_41.setEditable(false);
		mtf[4][5]=textField_41;
		textField_41.setText(String.valueOf(tablero[4][5]));
		textField_41.setEditable(false);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(369, 247, 50, 50);
		frame.getContentPane().add(textField_42);
		textField_42.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_42.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_42.setText("7");
		//textField_42.setEditable(false);
		mtf[4][6]=textField_42;
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(424, 247, 50, 50);
		frame.getContentPane().add(textField_43);
		textField_43.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_43.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_43.setText("8");
		//textField_43.setEditable(false);
		mtf[4][7]=textField_43;
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(485, 247, 50, 50);
		frame.getContentPane().add(textField_44);
		textField_44.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_44.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_44.setText("9");
		//textField_44.setEditable(false);
		mtf[4][8]=textField_44;
		textField_44.setText(String.valueOf(tablero[4][8]));
		textField_44.setEditable(false);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(68, 301, 50, 50);
		frame.getContentPane().add(textField_45);
		textField_45.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_45.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_45.setText("2");
		//textField_45.setEditable(false);
		mtf[5][1]=textField_45;
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(13, 304, 50, 50);
		frame.getContentPane().add(textField_46);
		textField_46.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_46.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_46.setText("1");
		//textField_46.setEditable(false);
		mtf[5][0]=textField_46;
		textField_46.setText(String.valueOf(tablero[5][0]));
		textField_46.setEditable(false);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(122, 301, 50, 50);
		frame.getContentPane().add(textField_47);
		textField_47.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_47.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_47.setText("3");
		//textField_47.setEditable(false);
		mtf[5][2]=textField_47;
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(184, 301, 50, 50);
		frame.getContentPane().add(textField_48);
		textField_48.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_48.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_48.setText("4");
		//textField_48.setEditable(false);
		mtf[5][3]=textField_48;
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(246, 301, 50, 50);
		frame.getContentPane().add(textField_49);
		textField_49.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_49.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_49.setText("5");
		//textField_49.setEditable(false);
		mtf[5][4]=textField_49;
		textField_49.setText(String.valueOf(tablero[5][4]));
		textField_49.setEditable(false);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(308, 301, 50, 50);
		frame.getContentPane().add(textField_50);
		textField_50.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_50.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_50.setText("6");
		//textField_50.setEditable(false);
		mtf[5][5]=textField_50;
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(370, 301, 50, 50);
		frame.getContentPane().add(textField_51);
		textField_51.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_51.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_51.setText("7");
		//textField_51.setEditable(false);
		mtf[5][6]=textField_51;
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(425, 301, 50, 50);
		frame.getContentPane().add(textField_52);
		textField_52.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_52.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_52.setText("8");
		//textField_52.setEditable(false);
		mtf[5][7]=textField_52;
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(486, 301, 50, 50);
		frame.getContentPane().add(textField_53);
		textField_53.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_53.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_53.setText("9");
		//textField_53.setEditable(false);
		mtf[5][8]=textField_53;
		textField_53.setText(String.valueOf(tablero[5][8]));
		textField_53.setEditable(false);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(67, 359, 50, 50);
		frame.getContentPane().add(textField_54);
		textField_54.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_54.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_54.setText("8");
		//textField_54.setEditable(false);
		mtf[6][1]=textField_54;
		textField_54.setText(String.valueOf(tablero[6][1]));
		textField_54.setEditable(false);
		
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(13, 361, 50, 50);
		frame.getContentPane().add(textField_55);
		textField_55.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_55.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_55.setText("1");
		//textField_55.setEditable(false);
		mtf[6][0]=textField_55;
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(121, 359, 50, 50);
		frame.getContentPane().add(textField_56);
		textField_56.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_56.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_56.setText("3");
		//textField_56.setEditable(false);
		mtf[6][2]=textField_56;
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(183, 359, 50, 50);
		frame.getContentPane().add(textField_57);
		textField_57.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_57.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_57.setText("4");
		//textField_57.setEditable(false);
		mtf[6][3]=textField_57;
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(245, 359, 50, 50);
		frame.getContentPane().add(textField_58);
		textField_58.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_58.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_58.setText("5");
		//textField_58.setEditable(false);
		mtf[6][4]=textField_58;
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(307, 359, 50, 50);
		frame.getContentPane().add(textField_59);
		textField_59.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_59.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_59.setText("6");
		//textField_59.setEditable(false);
		mtf[6][5]=textField_59;
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(369, 359, 50, 50);
		frame.getContentPane().add(textField_60);
		textField_60.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_60.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_60.setText("7");
		//textField_60.setEditable(false);
		mtf[6][6]=textField_60;
		textField_60.setText(String.valueOf(tablero[6][6]));
		textField_60.setEditable(false);
		
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(424, 359, 50, 50);
		frame.getContentPane().add(textField_61);
		textField_61.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_61.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_61.setText("8");
		//textField_61.setEditable(false);
		mtf[6][7]=textField_61;
		textField_61.setText(String.valueOf(tablero[6][7]));
		textField_61.setEditable(false);
		
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(485, 359, 50, 50);
		frame.getContentPane().add(textField_62);
		textField_62.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_62.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_62.setText("9");
		//textField_62.setEditable(false);
		mtf[6][8]=textField_62;
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(67, 418, 50, 50);
		frame.getContentPane().add(textField_63);
		textField_63.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_63.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_63.setText("2");
		//textField_63.setEditable(false);
		mtf[7][1]=textField_63;
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(15, 419, 50, 50);
		frame.getContentPane().add(textField_64);
		textField_64.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_64.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_64.setText("1");
		//textField_64.setEditable(false);
		mtf[7][0]=textField_64;
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(121, 418, 50, 50);
		frame.getContentPane().add(textField_65);
		textField_65.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_65.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_65.setText("3");
		//textField_65.setEditable(false);
		mtf[7][2]=textField_65;
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(183, 418, 50, 50);
		frame.getContentPane().add(textField_66);
		textField_66.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_66.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_66.setText("4");
		//textField_66.setEditable(false);
		mtf[7][3]=textField_66;
		textField_66.setText(String.valueOf(tablero[7][3]));
		textField_66.setEditable(false);
		
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(245, 418, 50, 50);
		frame.getContentPane().add(textField_67);
		textField_67.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_67.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_67.setText("5");
		//textField_67.setEditable(false);
		mtf[7][4]=textField_67;
		textField_67.setText(String.valueOf(tablero[7][4]));
		textField_67.setEditable(false);
		
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(307, 418, 50, 50);
		frame.getContentPane().add(textField_68);
		textField_68.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_68.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_68.setText("6");
		//textField_68.setEditable(false);
		mtf[7][5]=textField_68;
		textField_68.setText(String.valueOf(tablero[7][5]));
		textField_68.setEditable(false);
		
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(369, 418, 50, 50);
		frame.getContentPane().add(textField_69);
		textField_69.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_69.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_69.setText("7");
		//textField_69.setEditable(false);
		mtf[7][6]=textField_69;
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(424, 418, 50, 50);
		frame.getContentPane().add(textField_70);
		textField_70.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_70.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_70.setText("8");
		//textField_70.setEditable(false);
		mtf[7][7]=textField_70;
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(485, 418, 50, 50);
		frame.getContentPane().add(textField_71);
		textField_71.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_71.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_71.setText("9");
		//textField_71.setEditable(false);
		mtf[7][8]=textField_71;
		textField_71.setText(String.valueOf(tablero[7][8]));
		textField_71.setEditable(false);
		
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBounds(69, 473, 50, 50);
		frame.getContentPane().add(textField_72);
		textField_72.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_72.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_72.setText("2");
		//textField_72.setEditable(false);
		mtf[8][1]=textField_72;
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(15, 474, 50, 50);
		frame.getContentPane().add(textField_73);
		textField_73.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_73.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_73.setText("1");
		//textField_73.setEditable(false);
		mtf[8][0]=textField_73;
		
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBounds(123, 473, 50, 50);
		frame.getContentPane().add(textField_74);
		textField_74.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_74.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_74.setText("3");
		//textField_74.setEditable(false);
		mtf[8][2]=textField_74;
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBounds(185, 473, 50, 50);
		frame.getContentPane().add(textField_75);
		textField_75.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_75.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_75.setText("4");
		//textField_75.setEditable(false);
		mtf[8][3]=textField_75;
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		textField_76.setBounds(247, 473, 50, 50);
		frame.getContentPane().add(textField_76);
		textField_76.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_76.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_76.setText("5");
		//textField_76.setEditable(false);
		mtf[8][4]=textField_76;
		textField_76.setText(String.valueOf(tablero[8][4]));
		textField_76.setEditable(false);
		
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBounds(309, 473, 50, 50);
		frame.getContentPane().add(textField_77);
		textField_77.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_77.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_77.setText("6");
		//textField_77.setEditable(false);
		mtf[8][5]=textField_77;
		
		textField_78 = new JTextField();
		textField_78.setColumns(10);
		textField_78.setBounds(371, 473, 50, 50);
		frame.getContentPane().add(textField_78);
		textField_78.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_78.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_78.setText("7");
		//textField_78.setEditable(false);
		mtf[8][6]=textField_78;
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBounds(426, 473, 50, 50);
		frame.getContentPane().add(textField_79);
		textField_79.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_79.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_79.setText("8");
		//textField_79.setEditable(false);
		mtf[8][7]=textField_79;
		textField_79.setText(String.valueOf(tablero[8][7]));
		textField_79.setEditable(false);
		
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		textField_80.setBounds(487, 473, 50, 50);
		frame.getContentPane().add(textField_80);
		textField_80.addKeyListener(new KeyAdapter()
		{
			   public void keyTyped(KeyEvent e)
			   {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
			      {
			         e.consume();  // ignore event
			      }
			      if ( textField_80.getText().length() >=  1)
			      {
				         e.consume();  // ignore event
				  }
				      
			   }
		});
		//textField_80.setText("9");
		//textField_80.setEditable(false);
		mtf[8][8]=textField_80;
		textField_80.setText(String.valueOf(tablero[8][8]));
		textField_80.setEditable(false);
		
		
		btnCheckAnswers = new JButton("CHECK ANSWERS");
		btnCheckAnswers.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int inputData[][]=new int[9][9];
		       	for(int i=0;i<inputData.length;i++)
		       	{
		      	 	for(int j=0;j<inputData.length;j++)
		      	 	{
		      	 		if(!mtf[i][j].getText().equals(""))
		      	 			inputData[i][j]=Integer.parseInt(mtf[i][j].getText());
		      	 		else
		      	 			inputData[i][j]=0;
			     		System.out.println(inputData[i][j]);
		           	}
		       	}
		       	///////////////////////////////////////////////////////////////////
				int tablero[][]=new int[9][9];
				Sudoku sudoku=new Sudoku();
				tablero=sudoku.getSudokuMatrix();
		       	for(int i=0;i<inputData.length;i++)
		       	{
		      	 	for(int j=0;j<inputData.length;j++)
		      	 	{
		      	 		if(inputData[i][j]==tablero[i][j])
		      	 		{
		      	 			mtf[i][j].setBackground(Color.GREEN);
		      	 		}
		      	 		else
		      	 		{
		      	 			mtf[i][j].setBackground(Color.RED);
		      	 		}
		           	}
		       	}
		       	///////////////////////////////////////////////////////////////////
				SudokuValidation sudokuValidation=new SudokuValidation();
	      	 	ArrayList<int[]> result=sudokuValidation.validateData(inputData);

	      	 	if(result.size()==0)
	      	 	{
	      	 		System.out.println("CORRECT");
	      	 		JOptionPane.showMessageDialog(null, "Congratulations! \nYou Completed the Sudoku!");
	      	 	}
			}
		});
		btnCheckAnswers.setBounds(185, 535, 179, 29);
		frame.getContentPane().add(btnCheckAnswers);
		
	}
}
