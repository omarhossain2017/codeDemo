
public class NumberPatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 7; i++) {

			// int count=0;
	
			for (int j = 1; j <= i; j++) {

				// count=count+1;

				System.out.print(j);

			}
			System.out.println();

		}

		for (int i = 1; i < 7; i++) {

			// int count=0;
			for (int j = i; j >= 1; j--) {

				// count=count+1;

				System.out.print(j);

			}
			System.out.println();
		}
	}

}
