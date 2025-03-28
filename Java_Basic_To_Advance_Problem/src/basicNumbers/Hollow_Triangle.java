package basicNumbers;

public class Hollow_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i-1-n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j== 1|| j== i|| i ==n-0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		
			/*
			 * for (int j = i; j <= 5; j++) { System.out.print("* "); }
			 */
			System.out.println();
		}

	}

}
