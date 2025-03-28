package basicNumbers;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean primeNumber(int n) {
		if(n<= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimesUpTo(int limit) {
		System.out.println("Prime numbers up to "+limit+":");
		for (int i = 2; i <= limit; i++) {
			if(primeNumber(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		printPrimesUpTo(n);
	}
}
