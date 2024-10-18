
package Practicals;
import java.util.Scanner;

public class prm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for sum of natural numbers: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of natural numbers is: " + sum);

        sc.close(); // close the scanner to avoid resource leak
    }
}
