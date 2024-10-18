package Practicals;

import java.util.Scanner;

public class prm4
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;
        int fact = 1;

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        for(int i=1; i<=num; i++)
        {
            fact *= i;//fact =fact*i;
        }

        System.out.println("Factorial of " + num   +  " is :"  + fact);
    }
}