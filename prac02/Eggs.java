// Chapter 2, Exercise #8

import java.util.Scanner;

class Eggs
{
    public static void main(String[] args)
    {
        final int DOZEN = 12;
        final double PRICE_PER_DOZEN = 3.25;
        final double PRICE_PER_EGG = 0.45;
        int eggs;
        int dozens;
        int individual;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter eggs needed >> ");
        eggs = input.nextInt();
        dozens = eggs / DOZEN;
        individual = eggs % DOZEN;
        total = dozens * PRICE_PER_DOZEN + individual * PRICE_PER_EGG;
        System.out.println("You ordered " + eggs + " eggs. That's " + dozens
                + " dozen at $" + PRICE_PER_DOZEN + " per dozen and " + individual
                + " loose eggs at " + (int)(PRICE_PER_EGG * 100) + " cents each for a total of $"
                + total + ".");

    }
}