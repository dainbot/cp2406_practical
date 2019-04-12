// Chapter 4, Exercise #2

public class Billing
{
    final static double TAX = 0.08;
    public static void main(String[] args)
    {
        double bill;
        bill = computeBill(16.50);
        System.out.println("The total for a photobook that costs $16.50 is $" + bill);
        bill = computeBill(16.50, 5);
        System.out.println("The total for five photobooks that cost $16.50 is $" + bill);
        bill = computeBill(16.50, 6, 10);
        System.out.println("The total for six photobooks that costs $16.50 with a $5 coupon is $" + bill);
    }

    public static double computeBill(double amt)
    {
        double bill = amt + amt * TAX;
        return bill;
    }

    public static double computeBill(double amt, int quantity)
    {
        double bill = amt * quantity;
        bill = bill + bill * TAX;
        return bill;
    }

    public static double computeBill(double amt, int quantity, double coupon)
    {
        double bill = amt * quantity;
        bill = bill - coupon;
        bill = bill + bill * TAX;
        return bill;
    }
}