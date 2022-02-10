
//Yoav Amit
//Period 1
//October 21, 2021

public class ifElsePractice
{
	public static void main(String[]args)
	{
		//a)
		char grade = 'C';
		
		if (grade == 'A' || grade == 'a' || grade == 'B' || grade == 'b')
			System.out.println("Good Work!");
		else
			System.out.println("Come in for help.");
		
		//b)
		int numput = -7;
		
		if(numput < 0)
			System.out.println("Negative");
		else
			System.out.println("Postitive");
		
		//c)
		int numput2 = 5;
		
		if(numput2 % 2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		
		//d)
		
		char operator = '-';
		
		double d1 = 6.5;
		double d2 = 8.5;
		//char operator = '/';
		
		if(operator == '+')
			System.out.println(d1+d2);
		else if(operator == '-')
			System.out.println(d1-d2);
		else if(operator == '*')
			System.out.println(d1*d2);
		else if(operator == '/')
			System.out.println(d1/d2);
		else
			System.out.println("Thats not a valid operator!");
	
	}
}