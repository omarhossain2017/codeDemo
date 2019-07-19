package mergingTwoArrays;

import java.util.Arrays;

public class MergingTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3 };
		int[] b = {13,14 };

		int a_length = a.length;
		int b_length = b.length;

		int c_length = a.length + b.length;

		int[] mergeArray = new int[c_length];

		for (int i = 0; i < a.length; i++) {

			mergeArray[i] = a[i];

		}
		
		  for (int i = 0; i < b.length; i++) {
		  
		  mergeArray[i+3] = b[i];
		  
		  }
		 

		for (int i = 0; i <  mergeArray.length; i++) {

	       System.out.print(mergeArray[i]+" | ");

		}

	}

}
