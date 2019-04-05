// Chapter 2, Exercise #12

import javax.swing.*;
import java.awt.*;

class TicketNumber
{
    public static void main(String[] args)
    {
        final int CHECKDIGIT = 7;
        String ticketString;
        int tickNumber, newTickNum, lastDigit, remainder;
        boolean result;

        ticketString = JOptionPane.showInputDialog(null, "Enter 6-digit ticket number",
                "Ticket Number Dialog", JOptionPane.INFORMATION_MESSAGE);
        tickNumber = Integer.parseInt(ticketString);
        lastDigit = tickNumber % 10; // gets last digit
        newTickNum = tickNumber / 10; // removes last digit
        remainder = newTickNum % CHECKDIGIT;
        result = (remainder == lastDigit);
        JOptionPane.showMessageDialog(null, "For ticket number " + tickNumber +
                ", last digit is " + lastDigit + " and remainder is " + remainder + ", \nso result is " + result);
    }
}