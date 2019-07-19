package binearySearch;

public class BinearySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//int [] arr= {2,3,4,5,6,7,8,9,34,45,56,67,87,89};

		
		/*
		 * int target=89; int left=0; int right=arr.length-1; int middle;
		 * 
		 * 
		 * 
		 * while (left<=right) {
		 * 
		 * // int middle=left+((right-left)/2); middle=(left+right)/2; if
		 * (arr[middle]==target) { System.out.println(arr[middle]+" exist"); break; }
		 * 
		 * else if (arr[middle]<target) {
		 * 
		 * left=middle+1; }
		 * 
		 * else if (arr[middle]>target) {
		 * 
		 * right=middle-1;
		 * 
		 * }
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * //System.out.println("element not found");
		 */
		
		
		
		int [] arrLinear= {2,3,4,5,6,7,8,9,34,45,56,67,87,892};
		
		
		
		/*
		 * int number=45;
		 * 
		 * int i; for ( i=0;i<arrLinear.length;i++) {
		 * 
		 * if(arrLinear[i]==number)
		 * 
		 * { System.out.println("found the element "+arrLinear[i]);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println(arrLinear[7]);
		 */
		
		
		
		int my = bySearch(arrLinear,892);
		
		if (my==34) {
			
			System.out.println("found it");
		}
		if (my == 892) {

			System.out.println("found it");
		}
		/*
		 * if (my == 0) {
		 * 
		 * System.out.println("found it"); }
		 */
		else {
			
			System.out.println(" Sorry! not found it");
		}
		
	}
	
	
	public static int bySearch(int [] arr,int x) {
		
		int target=x;
		int left=0;
		int right=arr.length-1;
		int middle;
		
	
		
		while (left<=right) {
			
		//	int middle=left+((right-left)/2);
				middle=(left+right)/2;
			if (arr[middle]==target) {
			//System.out.println(arr[middle]+" exist");
				
		       return target;
		    	
			}
			
			else if (arr[middle]<target) {
				
				left=middle+1;
			}
			
			else if  (arr[middle]>target) {
				
				right=middle-1;
			
			}
			
			//return target;

		}
		return target;
	}

}
