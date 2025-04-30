package lessons;
import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many times to say hello: ");
		int numberHellos = sc.nextInt();
		int counter = 0;
		
		while (counter < numberHellos)  {
			
			System.out.println("Hello World!");
			counter++;
		}
		

	}

}
