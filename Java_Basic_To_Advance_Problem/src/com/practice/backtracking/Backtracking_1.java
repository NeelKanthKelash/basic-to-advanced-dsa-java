package com.practice.backtracking;

public class Backtracking_1 {

	public static void printPermutaiton(String str, String perm, int idx) {
		if (str.length()== 0) {
			System.out.println(perm);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0,i)+str.substring(i+1);
			printPermutaiton(newStr, perm+currChar, idx+1);
		}
	}
	public static void main(String[] args) {
		String str = "ABC";
		printPermutaiton(str, "", 0);

	}

}
