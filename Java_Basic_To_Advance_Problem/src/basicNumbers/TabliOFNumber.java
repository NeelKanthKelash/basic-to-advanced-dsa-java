package basicNumbers;

import java.util.Scanner;

public class TabliOFNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "X" + i * n);
		}

	}

}
