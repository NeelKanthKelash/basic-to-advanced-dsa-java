package com.practice.recursion;

public class PrintNumb_5_to_1 {

	public static void printNumber(int n) {
		// base case when 0 end
		if(n == 0) {
			return;
		}
		System.out.println(n); // print value from 5 -1 = 4-1 = 3-1 = 2-1 = 1-1 = 0 return end
		printNumber(n-1);
	}
	
	public static void main(String[] args) {

		int n = 5;
		printNumber(n);
	}

}
