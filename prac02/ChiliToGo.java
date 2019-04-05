// Chapter 2, Exercise #9a

import java.util.Scanner;

class ChiliToGo
{
    public static void main(String[] args)
    {
        final int ADULT_PRICE = 7;
        final int CHILD_PRICE = 4;
        int adultMeals;
        int childMeals;
        int totalAdult, totalChild, grandTotal;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of adult meals ordered >> ");
        adultMeals = input.nextInt();
        System.out.print("Enter number of child meals ordered >> ");
        childMeals = input.nextInt();
        totalAdult = adultMeals * ADULT_PRICE;
        totalChild = childMeals * CHILD_PRICE;
        grandTotal = totalAdult + totalChild;
        System.out.println(adultMeals + " adult meals were ordered at $" + ADULT_PRICE + " each.");
        System.out.println("Total is $" + totalAdult + ".");
        System.out.println(childMeals + " child meals were ordered at $" + CHILD_PRICE + " each.");
        System.out.println("Total is $" + totalChild + ".");
        System.out.println("Grand total for all meals is $" + grandTotal + ".");
    }
}