package lessons;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int myVariable = 0;
		
		while(myVariable != 3)  {
  
			System.out.println("Menu");
			System.out.println("1. Hello World!");
			System.out.println("2. Computer Science is fun!");
			System.out.println("3. Exit.");
			
			System.out.println("Enter number: ");
			myVariable = sc.nextInt();
			
			if (myVariable == 1)  {
						
				System.out.println("Hello World!");
			}
			
			else if (myVariable == 2)  {
				
				System.out.println("Computer Science is fun!");
			}
		}
		
		System.out.println("Exiting program.");
		
	}
}

