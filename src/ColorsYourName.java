//Yoav Amit
//Period 1
//November 16, 2021



import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class ColorsYourName
{
	public static void changeJOP()
	{
		// These colors are very ugly - you need to CHANGE them!

		// The font of the message text
		UIManager.put("Label.font", new FontUIResource (new Font("Tempus Sans ITC", Font.BOLD, 58)));
		// The color of the message text
		UIManager.put("OptionPane.messageForeground",new Color(0,0,150));

		// color for text field (where you are inputting data)
		UIManager.put("TextField.background", Color.white);
		// font for message in text field
		UIManager.put("TextField.font", new FontUIResource(new Font("Dialog", Font.BOLD, 24)));
		// color for message in text field
		UIManager.put("TextField.foreground", Color.black);

		// The color of the panel 
		UIManager.put("Panel.background",new Color(53,43,255));
		// The color around the outside of the panel
		UIManager.put("OptionPane.background",new Color(53,20,255));

		// Buttons at bottom
		UIManager.put("Button.background",new Color(132,112,255));
		UIManager.put("Button.foreground", new Color(72,61,139));
		UIManager.put("Button.font", new FontUIResource	(new Font("Tempus Sans ITC", Font.BOLD, 14)));
	}
	public static void main(String[] args)
	{
		changeJOP();
		String[] colors = {"Yellow", "Blue", "Red", "Green", "Purple", "White", "Brown"};
		
		int choice=JOptionPane.showOptionDialog
			(null, "What color do you like the best? ", "I change the title",
			0, 3, null, colors, null);

		String answer="";
		if(choice == 0)
			answer = "The sun is yellow.";
		if(choice == 1)
			answer = "The sky is blue."; 
		if(choice == 2)
			answer = "Fire is red.."; 
		if (choice == 3)
			answer = "The grass is green."; 
		if(choice == 4)
			answer = "What's purple?";
		if(choice == 5)
			answer = "The void is white";
		if(choice == 6)
			answer = "The ground is brown";
		JOptionPane.showMessageDialog	(null, answer);
	}
}