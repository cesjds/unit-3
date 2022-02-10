//Yoav Amit
//Period 1
//October 21, 2021

public class ifPractice
{
	public static void main (String[]args)
	{
		int age = 18;
		if (age >= 16)
			System.out.println("You are old enough to drive!");
		
		int a = 3;
		int b = 6;
		if (b != 0)
			System.out.println(a/b);
		
		int num1 = -6;
		if (num1 < 0)
			System.out.println("Negative Number");
		
		int d1 = 5;
		int d2 = 7;
		char char1 = '+';
		if (char1 == '+')
			System.out.println(d1 + d2);
		
		int num3 = 4;
		if (num3 % 2 == 0)
			System.out.println("Even Number");
	}
}