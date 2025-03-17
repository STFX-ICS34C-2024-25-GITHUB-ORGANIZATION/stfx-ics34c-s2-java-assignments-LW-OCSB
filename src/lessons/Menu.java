package lessons;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		// variables
		int menuChoice = 0;
		Scanner sc = new Scanner(System.in);
		
		while(  //FIX THIS       )  {
			System.out.println("Menu");
			System.out.println("1. Display Menu Again");
			System.out.println("2. Exit");
			System.out.println("Enter choice: ");
		
			menuChoice = sc.nextInt();
		}
		
	}

}
