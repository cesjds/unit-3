import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/********************************************************************
 Written by: Yoav Amit
 
 Period: 1
 
 ASSIGNMENT:  Write a program that accomplishes the following tasks:
 
 I)	- Asks the user for a double number
 	- Then gives them a "button menu" asking if they want the 
 		absolute value, the	square root or the rounded value of their 
 		number (you may choose different methods from the Math
 		class if you want to).
 	- Uses if statements to do the requested calculation.
 	- Prints the problem and the answer in ONE JOP window.
 
 II)- Asks the user for the red, green and blue values of a color.  
 		You should tell them in the prompt that the numbers need to
 		be between 0 and 255.
 	- Uses an if/else statement to determine if all 3 colors are 
 		valid (between 0 and 255).
 	- If they are change the background color of the JOP window and
 		print a message to show the new color.
 	- If any one of the colors is invalid print a polite message to
 		the user.
 
 III)- Uses a "button menu" to ask the user if he/she wants to see
 		the first, second, third or fourth secret message.
 	- Uses a switch statement to print the correct message.
 	- Your messages should be school appropriate!
 	
 HAND IN:  Make a jar file, put it in my handin folder and 
  	print your program.
 
 GRADING:  20 points
 
 _____  Part I works correctly (5 points)
 _____  Part II works correctly (5 points)
 _____  Part III works correctly (5 points)
 _____	Your output is neatly formatted and your "button menus" 
 			work correctly (5 points)
 
********************************************************************/

public class MakingDecisions
{
	public static void changeJOP()
	{
		// copy and paste the code with your new colors and fonts here:
		// These colors are very ugly - you need to CHANGE them!

		// The font of the message text
		UIManager.put("Label.font", new FontUIResource (new Font("Tempus Sans ITC", Font.BOLD, 58)));
		// The color of the message text
		UIManager.put("OptionPane.messageForeground",new Color(0,0,0));

		// color for text field (where you are inputting data)
		UIManager.put("TextField.background", Color.white);
		// font for message in text field
		UIManager.put("TextField.font", new FontUIResource(new Font("Dialog", Font.BOLD, 24)));
		// color for message in text field
		UIManager.put("TextField.foreground", Color.black);

		// The color of the panel 
		UIManager.put("Panel.background",new Color(102, 204, 255));
		// The color around the outside of the panel
		UIManager.put("OptionPane.background",new Color(0, 51, 102));

		// Buttons at bottom
		UIManager.put("Button.background",new Color(132,112,255));
		UIManager.put("Button.foreground", new Color(72,61,139));
		UIManager.put("Button.font", new FontUIResource	(new Font("Tempus Sans ITC", Font.BOLD, 14)));				
	}
	
	public static void main(String[]args)
	{
		changeJOP();
		String answer = "";
		
		//PART I
		double dNum = Double.parseDouble(JOptionPane.showInputDialog("Enter an double: "));
		
		changeJOP();
		String[] colors = {"Absolute Value", "Square root", "Round"};
		
		int choice=JOptionPane.showOptionDialog
			(null, "What operation do you want to do? ", "Operation Picker",
			0, 3, null, colors, null);
		
	
		if(choice == 0)
			answer = ("The absolute value of "+dNum+" is: "+Math.abs(dNum));
		if(choice == 1)
			answer = ("The square root of "+dNum+" is: "+Math.sqrt(dNum));
		if (choice == 2)
			answer = ("The rounded value of "+dNum+" is: "+Math.round(dNum));	
		
		JOptionPane.showMessageDialog(null, answer);
		
		//PART II
		
		int redValue = Integer.parseInt(JOptionPane.showInputDialog("Enter a red value (0-255): "));
		int greenValue = Integer.parseInt(JOptionPane.showInputDialog("Enter a green value (0-255): "));
		int blueValue = Integer.parseInt(JOptionPane.showInputDialog("Enter a blue value (0-255): "));
		
		if ((redValue <= 255 && redValue >= 0) && (greenValue <= 255 && greenValue >= 0) && (blueValue <= 255 && blueValue >= 0))
		{
			UIManager.put("Panel.background",new Color(redValue, greenValue, blueValue));
			answer = "This is your new color!";
		}
		else
			answer = "This is not a valid value!";
			

		JOptionPane.showMessageDialog(null, answer);
		
		//PART III
		
		
		String[] messages = {"Message 1", "Message 2", "Message 3", "Message 4"};
		
		int choice2=JOptionPane.showOptionDialog
				(null, "Which message do you want to see? ", "Message Picker",
				0, 3, null, messages, null);
		
		
		switch (choice2)
		{
		case 0: answer = "Etai is good at coding"; break;
		case 1: answer = "I am good at coding"; break;
		case 2: answer = "I like sushi"; break;
		case 3: answer = "I like coding"; break;
		}
		
		JOptionPane.showMessageDialog(null, answer);
		
		
	
		
	}
}