
public class DeleteElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5};
		
		
		int deleteElement=5;
		int count=0;
		
		for (int i = 0; i < a.length; i++) {

		//	if (deleteElement==a[i]) {
				if (a[i]==deleteElement) {
				for (int j = i; j < a.length-1; j++)
				{
                       a[j]=a[j+1];
				}
				count=count+1;
				break;
			}
		}
		
		//System.out.println(deleteElement);
		
		if (count==0) {
			
			
			System.out.print("Element not found ");
			
			
		}else {
			
			System.out.println("Element deleted ");
			
			for (int i=0;i<a.length-1;i++) {
				
				
				System.out.print(a[i]+"|");
						
						
					}
			
		}
		
		/*
		 * for (int i=0;i<a.length-1;i++) {
		 * 
		 * 
		 * System.out.print(a[i]);
		 * 
		 * 
		 * }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * int [] a= {5,2,3,4,5};
		 * 
		 * //int min=a[0];
		 * 
		 * int sum=0;
		 * 
		 * int length=a.length;
		 * 
		 * int lastelement=a.length-3;
		 * 
		 * for (int i=0;i<a.length;i++) {
		 * 
		 * 
		 * if (a[i]<min) {
		 * 
		 * min=a[i]; // System.out.print(max);
		 * 
		 * }
		 * 
		 * sum=sum+a[i]; } System.out.println("Sum of the element : "+sum);
		 * System.out.println("Number of the element : "+length);
		 * //System.out.println("Sum of the element : "+sum);
		 * System.out.println("Last element of the index  : "+a[lastelement]);
		 * System.out.println("First element of the index  : "+a[2]);
		 */
	}

}
