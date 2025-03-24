package lessons;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		double balance = 0.0;
		int userChoice = 0;
		
		while (userChoice != 4)  {
			
			System.out.println("Welcome to Bank!");
			System.out.println("Menu: ");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("4. Return card (exit");
			System.out.println("Enter selection: ");

			// assume only 1-4 can be entered
			userChoice = sc.nextInt();
		}
	}
}
