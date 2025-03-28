package basicNumbers;

public class Palindromic_Pattern {

	public static void main(String[] args) {
		int n =5;
		for (int i = 1; i <= n; i++) {
			// spaces 
			for (int j = i; j <= n-1; j++) {
				System.out.print(" ");
			}
			// 1st half number
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			// 2nd half number
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}

	}

}
