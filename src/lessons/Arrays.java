package lessons;

public class Arrays {

	public static void main(String[] args) {

		int myInteger = 13;
		
		int[] myBoxOfInts = new int[5];
		
		myBoxOfInts[0] = 3;
		myBoxOfInts[1] = 4;
		myBoxOfInts[2] = 7;
		myBoxOfInts[3] = 6;
		myBoxOfInts[4] = 5;
			
		System.out.println(myBoxOfInts[3]);
		System.out.println(myBoxOfInts[0] + myBoxOfInts[4]);

		myBoxOfInts[3] = myBoxOfInts[2] - myBoxOfInts[1];
		System.out.println(myBoxOfInts[3]);
		
		System.out.println(myBoxOfInts.length);
		
		// print all numbers using for loop
		for(int i=0; i<myBoxOfInts.length; i++)  {
			System.out.println(myBoxOfInts[i]);
		}
		
	}

}
