package findingMissingNumber;

public class FindingMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {1,2,3,4,5,6,7,8,9,10,11,13};
		
		
		int expectedNumElement=a.length+1;
		
		int expextedSum=expectedNumElement*(expectedNumElement+1)/2;
		
		int sum=0;
		
		for (int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
			
			
		}
		
		System.out.println("Missing number : "+(expextedSum-sum));
		
		
	}

}
