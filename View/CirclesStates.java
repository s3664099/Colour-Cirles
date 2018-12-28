package View;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CirclesStates extends JPanel {
	
	JLabel s1;
	JLabel s2;
	JLabel s3;
	String selectedCircle = "";
	
	public CirclesStates()
	{
		//The default layout for Swing is flow, but we do not want to do that
		//Instead we will create a grid layout
		setLayout(new GridLayout(1,3));
		
		//Now we will add a border to each of the boxes
		//BorderFactory allows us to have lots and lots of different types of borders
		//And lots and lots of colours
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		
		//This adds the labels to our boxes
		//However to add the borders we need to do something differently
		s1 = new JLabel("Status 1", SwingConstants.LEFT);
		s1.setBorder(border);
		add(s1);
		
		s2 = new JLabel("Status 2", SwingConstants.CENTER);
		s2.setBorder(border);
		add(s2);
		
		s3 = new JLabel("Status 3", SwingConstants.RIGHT);
		s3.setBorder(border);
		add(s3);
	}
	
	public void updateStatus(String colourName)
	{
		s1.setText(colourName+" selected");
		selectedCircle = colourName;
	}
	
	//returns the value of the selected circle
	//this looks like it should be an enum
	public String getSelectedCircle()
	{
		return selectedCircle;
	}

}
