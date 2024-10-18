package Practicals;


public class prm6{
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}

// import java.util.Scanner;
// public class SumOfNumbers {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();

//         int sum = 0;
//         int i = 1;
//         while (i <= n) {
//             sum += i;
//             i++;
//         }

//         System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
//         scanner.close();
//     }
// }

// import java.util.Scanner;

// public class MultiplicationTable {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();

//         int i = 1;
//         while (i <= 10) {
//             System.out.println(n + " * " + i + " = " + (n * i));
//             i++;
//         }

//         scanner.close();
//     }
// }


// import java.util.Scanner;

// public class Factorial {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();

//         int factorial = 1;
//         int i = 1;
//         while (i <= n) {
//             factorial *= i;
//             i++;
//         }

//         System.out.println("Factorial of " + n + " is: " + factorial);
//         scanner.close();
//     }
// }


// import java.util.Scanner;

// public class FibonacciSeries {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of terms: ");
//         int n = scanner.nextInt();

//         int first = 0, second = 1;
//         System.out.print("Fibonacci Series: " + first + " " + second + " ");

//         int i = 3;
//         while (i <= n) {
//             int next = first + second;
//             System.out.print(next + " ");
//             first = second;
//             second = next;
//             i++;
//         }

//         scanner.close();
//     }
// }


// public class ReverseNumbers {
//     public static void main(String[] args) {
//         int i = 10;
//         while (i >= 1) {
//             System.out.println(i);
//             i--;
//         }
//     }
// }

// public class PrintEvenNumbers {
//     public static void main(String[] args) {
//         int i = 2;
//         while (i <= 20) {
//             System.out.println(i);
//             i += 2;
//         }
//     }
// }

// import java.util.Scanner;

// public class PrimeCheck {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();

//         int i = 2;
//         boolean isPrime = true;
//         while (i <= num / 2) {
//             if (num % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//             i++;
//         }

//         if (isPrime) {
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }
//         scanner.close();
//     }
// }

