
// package Practicals;

// public class prm1 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//         }
//     }
// }
package Practicals;
import java.util.Scanner;

public class prm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of iterations: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        scanner.close(); // close the scanner to avoid resource leak
    }
}
