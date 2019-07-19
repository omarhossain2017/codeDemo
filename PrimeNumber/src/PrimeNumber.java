
public class PrimeNumber {

	public static void main(String[] args) {
		
		
		
		int num=88; int count=0;
		
		
		
		for (int i=2;i<num-1;i++) {
			
			if (num%i==0) {
				
				count=count+1;
			}
		}
		
		System.out.println(count);
		
		/*
		 * if (count>=1) {
		 * 
		 * System.out.println(" not prime"); }
		 * 
		 * else {
		 * 
		 * System.out.println(" prime"); }
		 */
	if (count==0) {
			
			System.out.println("  prime");
		}
		
		else {
			
			System.out.println(" not prime");
		}
	}

	
}
	

