package Practicals;

import java.util.Scanner;

public class prm5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

        scanner.close();
    }
}
