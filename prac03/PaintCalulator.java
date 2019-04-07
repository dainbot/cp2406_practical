// Chapter 3, Exercise #8

import java.util.Scanner;

class PaintCalulator
{
    public static void main(String arg[])
    {
        double length, width, height;
        double price;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the length of the room >> ");
        length = kb.nextDouble();
        System.out.print("Enter the width of the room >> ");
        width = kb.nextDouble();
        System.out.print("Enter the height of the room >> ");
        height = kb.nextDouble();
        price = computeArea(length, width, height);
        System.out.println("The cost to paint a " + (int)length + "-by-" + (int)width + "-foot room with " +
                (int)height + "-foot ceiling is $" + price);

    }

    public static double computeArea(double length, double width, double height)
    {
        double area = length * height * 2 + width * height * 2;
        double gallons;
        double price;
        final double PRICE_PER_GALLON = 32;
        gallons = computeGallons(area);
        System.out.println("You will need " + gallons + " gallons");
        price = gallons * PRICE_PER_GALLON;
        return price;
    }

    public static double computeGallons(double area)
    {
        final int SQFT_PER_GAL = 350;
        double gallons = area / SQFT_PER_GAL;
        return gallons;
    }
}