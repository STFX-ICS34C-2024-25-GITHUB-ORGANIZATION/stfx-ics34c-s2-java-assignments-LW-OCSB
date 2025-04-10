package lessons;
import java.util.Scanner;

public class AddCalculator {

	public static void main(String[] args) {

		// variables
		int firstNumber = 0;
		int secondNumber = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		// display program
		System.out.println("Welcome to Add Calculator!\n");
		
		// prompt user for first number
		System.out.println("Enter first number: ");
		firstNumber = sc.nextInt();
		
		// prompt user for second number
		System.out.println("Enter second number: ");
		secondNumber = sc.nextInt();
		
		// calculation
		sum = firstNumber + secondNumber;
		
		// display answer
		System.out.println("Answer: " + sum);
	}

}
