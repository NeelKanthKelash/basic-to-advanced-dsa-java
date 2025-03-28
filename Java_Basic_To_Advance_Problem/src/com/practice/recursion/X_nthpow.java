package com.practice.recursion;

public class X_nthpow {
	
	public static int printPowr(int x, int n) {
		if(n == 0) {
			return 1;
		}
		if(x == 0) {
			return 0;
		}
		// first way
		/*
		 * int x_ = printPowr(x, n-1); int xn = x*x_; return xn;
		 */
		
		// another way
		if (n%2 == 0) {
			return printPowr(x,n/2)*printPowr(x, n/2);
		}else {
			return printPowr(x, n/2)*printPowr(x, n/2)*x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2, n = 5;
		int output = printPowr(x, n);
		System.out.println(output)
		;
	}

}
