package lessons;

public class ForLoops {

	public static void main(String[] args) {
		
		
		// Count up from 1 to 10 using a for loop 
		System.out.println("First Loop:");
		for(int i=0; i<10; i++)  {
			System.out.println(i+1);
		}
		
		// count from 50 to 100 by 10's
		System.out.println("Second Loop:");
		for(int i=50; i<=100; i=i+10) {
			
			System.out.println(i);
		}
		
		// count from 20 to 1, backwards
		System.out.println("Third Loop:");
		for(int i=20; i>0; i=i-1) {
			
			System.out.println(i);
		}
	
		// count from 5 to 25 in fives5
		// Example: 5 10 15 20 25
		System.out.println("Fourth Loop:");
		for(int i=5; i<=25; i=i+5) {
			System.out.println(i);
		}
	}

}
