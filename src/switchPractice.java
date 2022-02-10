//Yoav Amit
//Period 1
//November 4, 2021


public class switchPractice
{
	public static void main(String[]args)
	{

		//Question A

		int power = 3;
		int base = 5;

		switch (power) 

		{
		case 1:  base = base; break;

		case 2:  base = base*base; break;

		case 3:  base = base*base*base; break;   
		}
		
		System.out.println(base);


		//Question B

		char grade = 'j';
		int points;

		switch (grade)

		{
		case 'a': points = 4; break;

		case 'b': points = 3; break;

		case 'c': points = 2; break;

		case 'd': points = 1; break;

		case 'e': points = 0; break;

		default: points = -1; break;
		}
		
		if (points != -1)
			System.out.println(points);
		else
			System.out.println("Invalid Grade!");
		

	}
}