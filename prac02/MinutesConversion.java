// Chapter 2, Exercise #11

import java.util.Scanner;

class MinutesConversion
{
    public static void main(String[] args)
    {
        int minutes;
        double hours;
        double days;
        double MINS_IN_HR = 60;
        double HRS_IN_DAY = 24;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes >> ");
        minutes = input.nextInt();
        hours = minutes / MINS_IN_HR;
        days = hours / HRS_IN_DAY;
        System.out.println(minutes + " minutes is " + hours + " hours or " + days + "days.");
    }
}