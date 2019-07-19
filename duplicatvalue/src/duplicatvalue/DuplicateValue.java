package duplicatvalue;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//int [] names1= {2,3,4,9,3,9,2};
		/*
		 * String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "JavaScript"
		 * };
		 * 
		 * 
		 * for (int i = 0; i < names.length; i++) { for (int j = i + 1 ; j <
		 * names.length; j++) { if (names[i].equals(names[j])) {
		 * System.out.println("got it"); System.out.println(names[i]); } } }
		 */

		
		int [] names1= {2,3,4,9,3,9,2,12};
		/*
		 * for (int i = 0; i < names1.length; i++) { for (int j = i + 1 ; j <
		 * names1.length; j++) { if (names1[i]==(names1[j])) {
		 * //System.out.println("got it"); // System.out.println(names1[i]); } } }
		 */
		
		
		
		Set<Integer> myset=new HashSet();
		
		for (int i :names1) {
			
			if(myset.add(i)==false) {
				
				System.out.println("duplicate value "+i);
			}
			
			
			//System.out.println(myset);
		}
		//System.out.println(myset);
		

	}

}
