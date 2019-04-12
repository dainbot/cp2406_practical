// Chapter 4, Exercise #1

public class FormLetterWriter
{
    public static void main(String[] arg)
    {
        displaySalutation("Dain");
        displayLetter();
        displaySalutation("Christy", "Johnson");
        displayLetter();
    }

    public static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Ms. " +lastName + ",");
    }

    public static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName + ",");
    }

    public static void displayLetter()
    {
        System.out.println("Thank you for your recent order.\n");
    }
}

