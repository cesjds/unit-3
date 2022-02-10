import java.awt.Color;
import java.awt.Font;



import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Test
{
	public static void main (String[]args)
	{
		
		String answer;
		
		int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer value: "));
		int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer value: "));
		int iNum3 = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer value: "));

		if ((iNum1 > 0) && (iNum2 > 0) && (iNum3 > 0))
			answer = "all positive";
		else 
			answer = "not all positive";
		

		
		JOptionPane.showMessageDialog(null, answer);
			

	}

	private static void changeJOP() {
		// TODO Auto-generated method stub
		
	}
}