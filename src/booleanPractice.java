//Yoav Amit
//Period 1
//October 21, 2021

public class booleanPractice
{
	public static void main(String[]args)
	{
		char letter = 'a';
		if (letter == 'A' || letter == 'a')
		System.out.println("apple starts with a.");
		
		int num1 = 0;
		char operator = '%';
		if (num1 == 0 && (operator == '/' || operator == '%'))
			System.out.println("Division by 0");
		
		int num2 = 6;
		if (num2 < 10 && num2 > -10)
			System.out.println("Single Digit");
		
		int num3 = 56;
		if (num3 >= 10 && (num3 < 100 || (num3 <= -10 && num3 > -100)))
			System.out.println("double digit");
	}
}