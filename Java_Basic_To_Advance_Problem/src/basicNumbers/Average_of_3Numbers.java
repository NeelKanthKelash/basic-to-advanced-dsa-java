package basicNumbers;

import java.util.Scanner;

public class Average_of_3Numbers {

	// functions creating 
	public static double averageOfThreeNumbers(double a, double b, double c ) {

		return (a+b+c)/3 ;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextInt();
		double c = sc.nextInt();
		
		System.out.println(averageOfThreeNumbers(a, b, c));
	}


}
