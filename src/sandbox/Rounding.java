package sandbox;

public class Rounding {

	public static void main(String[] args) {

		int[][] myArray = {

				{7, 5, 3, 2, 3}, 
				{7, 5, 3, 2}, 
				{7, 5, 3, 2}, 
				{7, 5, 3, 2}, 
			};

		System.out.println(myArray[0].length);
		System.out.println(myArray[1].length);
		System.out.println(myArray[2].length);
		System.out.println(myArray[3].length);
		
		for(int i=0; i < 4; i++)  {
			
			System.out.println("Row " + (i+1) + " contains");

			for (int j=0; j<4; j++)  {
				System.out.println("Element " + (j+1) + ": " + myArray[i][j]);
			}
		}
			
	}

}
