package reverseString;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int [] names1= {2,3,4,9,3,9,2};
		char[] names = { 'o','m','a','r' };

	
		for (int i = names.length-1; i>=0;i--)
		{ 
			System.out.print(names[i]);
		}

		
		System.out.println();
		System.out.println();
		
		  String name="omar hossain";
		  // String name="niassoh ramo"; 
		 
		  String con="";
		  
		  for (int i=name.length()-1;i>=0;i--) {
		  
		  con=con+name.charAt(i); 
		  
		 // System.out.println(con);
		  
		  }
		  System.out.println(con);
		 
		
		

		/*
		 * String name1="*****************"; // String name="niassoh ramo"; String
		 * con1="";
		 * 
		 * for (int i=name1.length()-1;i>=0;i--) {
		 * 
		 * con1=con1+name1.charAt(i); System.out.println(con1);
		 * 
		 * }
		 */
	}

}
