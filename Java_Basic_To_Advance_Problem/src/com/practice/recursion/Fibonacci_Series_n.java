package com.practice.recursion;

public class Fibonacci_Series_n {

	
	public static void printFibonacci(int a, int b ,int n) {
		if(n==0) {
			return;
		}
		System.out.println(a);
		printFibonacci(b, a+b, n-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printFibonacci(0, 1, 5);
	}

}
