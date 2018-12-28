package View;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CirclesFrame extends JFrame {
	
	CirclesImage iconGenerator = new CirclesImage();
	CirclesStates status;
	
	//The main fram for the colour circles program
	public CirclesFrame()
	{
		
		//first thing we need to do is call super()
		//Passing the string to the super updates the title in the title bar
		super("Not Connect Four");
		
		//First two define x,y position on screen
		//Second two define size of the frame
		//setBounds allows you to determine where it will appear
		//setSize will let the OS decide where the window will appear.
		setSize(800,600);
		
		//This is used to close the frame when the 'x' is pressed
		//Can also set it to 3 and it will do exactly the same thing
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//This is part of swing
		setLayout(new BorderLayout());
		
		//creates the icons to pass through to the constructors
		ImageIcon[] icon = iconGenerator.createCircles();
		
		//We create a new class to add a button
		//add has a restraint where we can set where button will appear.
		add(new CirclesToolBar(icon, this), BorderLayout.NORTH);
		
		//Create the place for the dots in the centre
		add(new CirclesPanel(icon, this), BorderLayout.CENTER);
		
		//And then add a status bar at the bottom
		add(status = new CirclesStates(), BorderLayout.SOUTH);
		
		//Now that the frame has been generated, this will show the frame.
		setVisible(true);
	}

	
}
