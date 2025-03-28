package basicNumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci_Series {

	// Method 2
	/*
	 * static int n1 = 1, n2= 1, n3 = 0;
	 * 
	 * static void printFibonacci(int count) { if(count > 0) { n3 = n1+n2; n1 = n2;
	 * n2= n3;
	 * 
	 * System.out.println(" "+n3); printFibonacci(count-1);
	 * 
	 * } }
	 */
	private static Map <Integer, Integer> memo = new HashMap<>();
	public static int fibonacci(int n) {

		if (n <= 1)
			return n;
		if(memo.containsKey(n))
			return memo.get(n);
		int result = fibonacci(n-1)+fibonacci(n-2);
		memo.put(n, result);
		return result;
	}
	
	
	
	public static void main(String[] args) {
		// Method 2
		/*
		 * int count = 10; System.out.println(n1+" "+n2); printFibonacci(count-2);
		 */
		
		
		
		// Method 1
		/*
		 * int n = 99, a = 0, b = 1;
		 * 
		 * System.out.println(+a+""+b); for (int count = 0; count < n; count ++ ) { int
		 * next = a+b; System.out.println(next); a = b; b = next; }
		 */	
	
		
		// Method 3 
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		
		for (int i = 0; i< n; i++) {
			System.out.println(fibonacci(i)+" ");
		}
		
		
	}
}


