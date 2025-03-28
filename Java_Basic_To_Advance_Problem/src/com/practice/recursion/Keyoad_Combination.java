package com.practice.recursion;

public class Keyoad_Combination {

	public static String Keypad[] = {".","abc","def","ghi","jkl","mon","pqrs","tu","vwx","yz"};
	
	public static void printKepadCombination(String number, int idx, String res) {
		if (idx == number.length()) {
			System.out.println(res);
			return;
		}
		for (int i = 0; i < Keypad[number.charAt(idx)-'0'].length(); i++) {
			char curr = Keypad[number.charAt(idx)-'0'].charAt(i);
			printKepadCombination(number, idx+1, res+curr);
		}
	}
	
	public static void main(String[] args) {
		String number = "12";
		printKepadCombination(number, 0,"");

	}

}
