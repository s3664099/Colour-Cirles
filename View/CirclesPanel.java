package View;

import java.awt.GridLayout;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CirclesPanel extends JPanel {
	
	private int circleNumber=20;
	
	public CirclesPanel(ImageIcon[] icon, CirclesFrame frame)
	{
		//sets out a grid layout of six squares by six squares
		setLayout(new GridLayout(6,6));
		
		//cycles through the number of circles to appear on the grid
		for(int i=0;i<circleNumber;i++)
		{
			//selects a random number
			int randomNum = 0 + (int)(Math.random() * icon.length);
			
			//generates a circle with the colour relating to that number
			JLabel circle =	new JLabel(icon[randomNum]);
			
			//attaches a mouse listener to the circle to activate if a
			//mouse event happens
			circle.addMouseListener(new MouseMoveEvent(icon, circle, frame));
			
			//adds the circle to the frame
			add(circle);
		}
		
	}

}
