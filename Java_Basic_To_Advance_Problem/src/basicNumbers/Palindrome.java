package basicNumbers;

import java.util.Scanner;

public class Palindrome {

	// for numbers to check if it is palindrome or not
	public static int palindromeCheck(int n) {
		
		int reverse = 0;
		int temp = n;
		while(n>0) {
			int remainder = n%10;
			reverse = reverse*10+remainder;
			n = n/10;
		}
		if (reverse == temp) {
			System.out.println("GIven num is palindrome");
			
		}else {
			System.out.println("Given num is not palindrome ");
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(palindromeCheck(n));

	}

}
