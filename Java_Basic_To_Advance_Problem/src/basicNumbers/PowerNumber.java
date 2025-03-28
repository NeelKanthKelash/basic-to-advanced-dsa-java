package basicNumbers;

import java.util.Scanner;

public class PowerNumber {

	public static double powerOfNumber(double x, double n) {
		
		return Math.pow(x, n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double n = sc.nextDouble();
		
		
		System.out.println(powerOfNumber(x, n));

	}

}
