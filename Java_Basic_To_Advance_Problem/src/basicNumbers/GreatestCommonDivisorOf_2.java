package basicNumbers;

public class GreatestCommonDivisorOf_2 {

	    public static int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int num1 = 56;
	        int num2 = 98;
	        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
	    }
	


}
