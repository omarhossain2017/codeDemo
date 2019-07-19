
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int digit=90;
		
		String f=isDividedbyDigit(digit);
		
		System.out.println(f);
		
	}

	public static String isDividedbyDigit(int n) {
		
		int temp=n;
		
		while (n>0) {
			
			int k=n%10;
			
			if (temp%k==0) {
				
				return "YES";
			}
			n /=10;
		}
		
		
		
		
		
		return "NO";
		
	} 
}
