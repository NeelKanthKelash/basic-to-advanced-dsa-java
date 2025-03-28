package basicNumbers;

public class Checkerboard {

	public static void main(String[] args) {
		int size = 8;
		printCheckerboard(size);
		

	}
	public static void printCheckerboard(int size) {
		for (int i = 0; i < size; i++) { // loop throw each row
			for (int j = 0; j < size; j++) {// loop throw each column in the row
				// check if the sum of row and column indices is even or odd
				if ((i + j) % 2 == 0) {
					System.out.print("X ");// x for even 
				}else {
					System.out.print("O "); // o for odd
				}
			}
			System.out.println();
		}
	}

}
