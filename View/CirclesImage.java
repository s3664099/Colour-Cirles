package View;

import java.io.File;

import javax.swing.ImageIcon;

public class CirclesImage {
	
	//Creates a string representing the colours
	private String[] colour = {"red","green","blue","yellow","orange"};
	private int colourNumber = 5;
	
	//Generates the icons
	private ImageIcon[] icon = new ImageIcon[colourNumber];
	
	public ImageIcon[] createCircles()
	{
		
		//Creates an icon based on each of the different coloured circles.
		for(int i=0; i<colour.length; i++)
		{
			icon[i] = new ImageIcon("images"+File.separator+"circle_"+colour[i]+".png", colour[i]);
		}
		
		//passes an array of icons back to the main program
		return icon;
	}

}
