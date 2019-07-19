package sumoftwonumberInarray;

public class SumoftwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [] names1= {2,3,4,9};
		int sum=11;
		//System.out.print(printPairs(names1,sum));
		printPairs(names1,sum);
	}
	
	public static void printPairs(int[] array, int sum) 
	{ 
		for (int i = 0; i < array.length; i++) 
		{
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) 
			{ 
				int second = array[j]; 
				if ((first + second) == sum) 
				{ 

					// System.out.printf("(%d, %d) %n", first, second);

					 System.out.print("["+first+" , "+second+"]"+"\n");
				}
			}
		}
	}
	
	
	/*
	 * public static void prettyPrint(int[] givenArray, int givenSum) {
	 * System.out.println("Given array : " + Arrays.toString(givenArray));
	 * System.out.println("Given sum : " + givenSum);
	 * System.out.println("Integer numbers, whose sum is equal to value : " +
	 * givenSum); printPairs(givenArray, givenSum); }
	 */
	
	
	
	
}
