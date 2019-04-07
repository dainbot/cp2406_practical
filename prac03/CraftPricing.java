// Chapter 3, Exercise #10

import java.util.Scanner;

class CraftPricing
{
    public static void main(String[] args)
    {
        String product;
        double materials;
        double hours;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the product name >> ");
        product = input.nextLine();
        System.out.print("Enter cost of materials >> ");
        materials = input.nextDouble();
        System.out.print("Enter hours of work >> ");
        hours = input.nextDouble();
        price = computePrice(materials, hours);
        System.out.println("The price of product '" + product + "' is $" + price);
    }

    public static double computePrice(double materials, double hours)
    {
        double price;
        final double RATE = 12.00;
        final double SHIP_AND_HANDLE = 7.00;
        price = materials + ( hours * RATE ) + SHIP_AND_HANDLE;
        return price;
    }

}