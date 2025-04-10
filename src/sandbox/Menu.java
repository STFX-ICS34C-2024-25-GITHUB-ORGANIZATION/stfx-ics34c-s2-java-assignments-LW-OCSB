package sandbox;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		
		while (choice != 3)  {
			
			System.out.println("Menu");
			System.out.println("1. Hello");
			System.out.println("2. Goobye");
			System.out.println("3. Exit");
			System.out.println("Choice: ");
			
			choice = sc.nextInt(); 
			
			if (choice == 1)  {
				helloWorld();
			}
			 
			else if (choice == 2)  {
				goodbyeWorld();
			}
		}

		

	}

	public static void helloWorld() {
		
		System.out.println("Hello World!");
	}
	
	public static void goodbyeWorld() {
		
		System.out.println("Goobye World!");
	}
	
}
