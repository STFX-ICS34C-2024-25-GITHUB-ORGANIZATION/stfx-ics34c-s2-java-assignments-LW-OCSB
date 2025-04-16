package lessons;

public class Methods {

	public static void main(String[] args) {

		//System.out.println("Come here Spot the cat!");
		//spot();
		//printHelloWorld();
		int myInteger = giveInteger();
		int answer = 1 + giveInteger();
		System.out.println(giveInteger());
		giveDouble();
		
		System.out.println(addTwoIntegers(1, 2));
		
		// DUE BY END OF CLASS:
		addTwoDoubles(2.3, 3.4);
		addIntAndDouble(3, 6.4);
		joinTwoWords("foo", "bar");

	}

	
	public static int addTwoIntegers(int a, int b)  {
		
		return a + b;
	}
	
	
	public static double giveDouble()  {
		
		return 4.5;
	}
	
	public static int giveInteger() {
		
		return 6;
	}
	
	
	
	public static void printHelloWorld() {
		
		System.out.println("Hello World!");
	}

	public static void spot() {

		System.out.println("Come here Spot the dog!");
	}
	
}
