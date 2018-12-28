package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class CirclesToolBar extends JToolBar {
	
	public CirclesToolBar(ImageIcon[] icon, CirclesFrame circle) {
		
		//A toggle button has two states, but a button only has one.
		//Now, instead of passing in a string we are passing in an image
		//However Icon is an interface, so we need to chose a different icon
		
		//What we want are radio buttons and not toggle buttons.
		//So we can use button groups
		
		//creates a group for the radio buttons
		ButtonGroup group = new ButtonGroup();
		
		for (int i=0;i<icon.length;i++)
		{
			//creates a new button
			JToggleButton button = new JToggleButton(icon[i]);
			
			String colourName = icon[i].getDescription();
			
			//Another way using an anonymous inner class
			//This one creates an action listener and
			//adds it to thebutton
			button.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					//prints the action to the console
					System.out.println("go "+colourName);
					
					//changes the colour that the circles will change to
					//when the mouse passes over them.
					circle.status.updateStatus(colourName);
				}
			});
			
			//adds the button to the group
			group.add(button);
			
			//displays the button on the frame
			add(button);
		}

	}

}
