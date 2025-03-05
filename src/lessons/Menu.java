package lessons;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		double choice = 0;
		
		while (choice != 3)  {
			
			System.out.println("Menu\n");
			System.out.println("1. Hello");
			System.out.println("2. Goodbye");
			System.out.println("3. Exit");
			
			choice = sc.nextInt();
			
			if (choice == 1)  {
				System.out.println("Hello!");
			}
			
			else if (choice == 2)  {
				System.out.println("Goodbye!");
			}
		}
	}
}
