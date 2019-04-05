// Chapter 2, Exercise #9b

import java.util.Scanner;

class ChiliToGoProfit
{
    public static void main(String[] args)
    {
        final int ADULT_PRICE = 7;
        final int CHILD_PRICE = 4;
        final double ADULT_COST = 4.35;
        final double CHILD_COST = 3.10;
        int adultMeals;
        int childMeals;
        int totalAdult, totalChild, grandTotal;
        double profitAdult, profitChild, totalProfit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of adult meals ordered >> ");
        adultMeals = input.nextInt();
        System.out.print("Enter number of child meals ordered >> ");
        childMeals = input.nextInt();
        totalAdult = adultMeals * ADULT_PRICE;
        totalChild = childMeals * CHILD_PRICE;
        grandTotal = totalAdult + totalChild;
        profitAdult = totalAdult - adultMeals * ADULT_COST;
        profitChild = totalChild - childMeals * CHILD_COST;
        totalProfit = profitAdult + profitChild;
        System.out.println(adultMeals + " adult meals were ordered at $" + ADULT_PRICE + " each.");
        System.out.println("Total is $" + totalAdult + ".");
        System.out.println(childMeals + " child meals were ordered at $" + CHILD_PRICE + " each.");
        System.out.println("Total is $" + totalChild + ".");
        System.out.println("Grand total for all meals is $" + grandTotal + ".");
        System.out.println("Profits: ");
        System.out.println("Adult profit is: $" + profitAdult);
        System.out.println("Child profit is: $" + profitChild);
        System.out.println("Total profit is: $" + totalProfit);
    }
}