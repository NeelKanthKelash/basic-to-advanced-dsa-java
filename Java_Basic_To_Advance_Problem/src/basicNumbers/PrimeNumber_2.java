package basicNumbers;

import java.util.Scanner;

public class PrimeNumber_2 {


	// method for Checking is a prime or not 
	public static boolean isPrime(int n) {
		// if number is less then 
		if(n<=1) {
			return false;
		}
		 
		for(int i = 2; i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
			return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number: ");
		int n = sc.nextInt();

		if(isPrime(n)) {
			System.out.println(n+ " is a Prime Number");
		}else {
			System.out.println(n+ " not a Prime Number");
		}
		
	}

}
