// Chapter 3, Exercise #4b

import java.util.Scanner;

public class NumbersDemo2
{
    public static void main (String args[])
    {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number >> ");
        num1 = input.nextInt();
        System.out.print("Enter the second number >> ");
        num2 = input.nextInt();
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int n)
    {
        final int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
    }
    public static void displayNumberPlusFive(int n)
    {
        final int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
    }
    public static void displayNumberSquared(int n)
    {
        System.out.println(n + " squared is " + (n * n));
    }
}