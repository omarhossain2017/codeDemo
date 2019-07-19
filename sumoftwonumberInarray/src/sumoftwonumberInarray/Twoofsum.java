package sumoftwonumberInarray;

public class Twoofsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [] myarray = {1,2,3,4,5,6};
		
		int sum=5;
		
	
		for (int i=0;i<myarray.length;i++) {
			
			int first=myarray[i];
			
			for (int j=i+1;j<myarray.length;j++) {
				
			int second=myarray[j];
				
			  if (first+second==sum) {
				  
				  System.out.println("["+first+"]"+"["+second+"]");
				  
			  }
				
			}
			
			
		}

}
}


