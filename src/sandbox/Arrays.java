package sandbox;

public class Arrays {

	public static void main(String[] args) {

		int temp = 0;
		int[] myArray = {1, 3, 5, 2, 4};
		
		temp = 1;
		myArray[0] = myArray[1];
		myArray[1] = temp;
		
		
		
		for(int i=0; i<myArray.length; i++)  {
			
			System.out.println(myArray[i]);
			
		}
		
		

	}

}
