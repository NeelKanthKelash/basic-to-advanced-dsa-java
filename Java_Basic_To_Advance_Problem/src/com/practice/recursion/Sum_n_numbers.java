package com.practice.recursion;

public class Sum_n_numbers {
	
	public static void printSum(int n, int sum) {
		if (n == 0) {
			System.out.println(sum);
			return;
		}
		sum += n; // when n == 0 sum calculated 
		// 5+4 = 9 +3 = 12+ 2= 14 + 1 = 10 +0 = 10end
		printSum(n-1, sum);
		
	}

	public static void main(String[] args) {
	
		printSum(5, 0);
		

	}

}
