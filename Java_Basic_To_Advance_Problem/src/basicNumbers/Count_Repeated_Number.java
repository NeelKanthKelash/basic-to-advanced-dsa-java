package basicNumbers;
import java.util.Scanner;

public class Count_Repeated_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter the digit to count: ");
        int d = sc.nextInt();
        sc.close();
        
        int count = 0, temp = num;
        
        while (temp > 0) {
            int digit = temp % 10;  
            if (digit == d) {
                count++;  
            }
            temp = temp / 10;  
        }
        
        System.out.println("The digit " + d + " appears " + count + " times.");
    }
}
