package ODDorEVEN.OddorEven2.src;

import java.util.Scanner;

public class OddorEven2 {
	public static void main(String [] args)
	{
		// Declaring input using scanner *must include Scanner import*
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Any Integer Value");
		
		// Entering an integer value using next int function in Scanner class
		int number = keyboard.nextInt();

		// checking if any number (let number variable) is divisible by 2 or not
		if(number % 2 == 0)
		{
			System.out.println("That's an EVEN number");
		}
		
		// If not then it is obviously an Odd number
		else {
			System.out.println("That's an ODD number");
		}	
	}
}
