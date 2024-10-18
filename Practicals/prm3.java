package Practicals;

import java.util.Scanner;
 
public class prm3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
 
        System.out.print("Enter any number: ");
        num = sc.nextInt();
 
        System.out.println("Multiplication Table of " + num);
 
        for(int i=1; i<=10; i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
    }
}

