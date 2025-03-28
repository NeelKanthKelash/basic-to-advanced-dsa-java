package com.practice.recursion;

public class Factorial_n {
	
	  // Recursive function to calculate factorial
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;  // You can change this number to test with different inputs
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is " + result);
    }
}
