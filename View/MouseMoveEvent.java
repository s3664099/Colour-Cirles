package View;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MouseMoveEvent extends MouseAdapter {
	
	JLabel circle;
	CirclesFrame frame;
	ImageIcon[] icon;

	//constructor to create the mouse event
	public MouseMoveEvent(ImageIcon[] icon, JLabel circle, CirclesFrame frame) {
		this.circle = circle;
		this.frame = frame;
		this.icon = icon;
	}

	//method that fires when the mouse enters the area of the listener
	public void mouseEntered(MouseEvent e) {
		
		//searches through each of the icons
		for(ImageIcon icons:icon)
		{
			//if the icon matches the value of the icon that has been selected
			if (icons.getDescription().equals(frame.status.getSelectedCircle())) 

					//changes the colour of the circle to match that icon
					circle.setIcon(icons);
		}

	}
}
