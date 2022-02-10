import java.awt.Color;
import java.awt.Font;



import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;


public class Test2
{
	public static void main(String[]args)
	{
        String[] pets = {"Dog", "Cat", "Bird", "Hamster"};

        int choice=JOptionPane.showOptionDialog
            (null, "What kind of pet do you have? ", "Pets",
            0, 3, null, pets, null);

        String answer="";
        
        switch(choice)
        {
        case 0: answer = "I have a dog named Lucy."; break;
        case 1: answer = "I used to have a cat named Peaches."; break;
        case 2: answer = "I had a bird when I was little."; break;
        case 3: answer = "I've never had a hamster."; break;
        }

        JOptionPane.showMessageDialog    (null, answer);
	}
}