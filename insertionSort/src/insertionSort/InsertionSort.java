package insertionSort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {4,8,3,2,0,8,9,1};
		
		int temp;
		
		for (int i=1;i<a.length;i++) {
			
			 temp=a[i];
			 int j=i;
			
			   while (j>0 && a[j-1]> temp) {
				   
				   a[j]=a[j-1];
				   
				 //  j=j-1;
				   j--;
			   }
			
			   a[j]=temp;
		}
		
		for (int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+ "|");
			
		}
		
		
	}

}
