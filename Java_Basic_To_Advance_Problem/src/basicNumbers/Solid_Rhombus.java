package basicNumbers;

public class Solid_Rhombus {

	public static void main(String[] args) {
	
		int  n = 5;
		for (int i = 1; i<= n; i++) {
			// spaces
			
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			// stars
			for (int j = 1; j <= 5; j++) {
			//	System.out.print("*");
				
				
				// for hollow use if else condition/ for solid just remove if else conditions
				if(i == 1 || i == n || j == 1|| j == n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
