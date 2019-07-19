package starPattern;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for (int i=0;i<10;i++) {
			//System.out.println("*");
			
			for (int j=0;j<=i;j++) {
				System.out.print("*");
				
				}
			
			System.out.println();
		}
		for (int i=0;i<10;i++) {
			//System.out.println("*");
			
			for (int j=10;j>=i;j--) {
				System.out.print("*");
				
				}
			
			System.out.println();
		}
	}

}
