package sandbox;

public class Test {

	public static void main(String[] args) {

		//myMethod(123);
		System.out.println(1/2);
	}

	public static void myMethod(int x)  {
		
		System.out.print(x%10);
		
		if ( (x/10 != 0 ))  {
			myMethod(x/10);
		}
		
		System.out.print(x%10);
	}
	
}
