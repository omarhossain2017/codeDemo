package sumoftwonumberInarray;

public class elementprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		int[] myarray; 
        
	      // allocating memory for 5 integers. 
		myarray = new int[20];
		
		
		
		for (int i = 0; i<myarray.length;i++) {
			
			myarray[i]=i+20;
			System.out.println("Element on index "+i+" is "+ myarray[i]);
		}
		/*
		 * for (int i = 0; i<myarray.length;i++) {
		 * 
		 * //myarray[i]=1; System.out.println(myarray[i]); }
		 */
	}

}
