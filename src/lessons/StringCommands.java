package lessons;

public class StringCommands {

	public static void main(String[] args) {

		String myString = "fubar foo bar";
		
		System.out.println(myString.length());
		
		for(int i=0; i<myString.length(); i++)  {

			System.out.print(myString.charAt(i));
		}
		
		System.out.println();
		System.out.println(myString.contains("r"));
	}
}
