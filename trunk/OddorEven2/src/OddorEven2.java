
import java.util.Scanner;

public class OddorEven2 {
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number");
		int number = keyboard.nextInt();
		if(number%2== 0)
		{
			System.out.println("That's an EVEN number");
		}
		else {
			System.out.println("That's an ODD number");
		}
		
		
	}
	

}
