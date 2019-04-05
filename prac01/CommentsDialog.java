// Chapter 1, Exercise #11
// Displays comments in a dialog box

import javax.swing.*;

class CommentsDialog
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog
                (null, "Program comments are nonexecuting statements" +
                "you add to a file for the purpose of documentation.");

        // line comments
        // Program comments are nonexecuting statements
        // you add to a file for the purpose of documentation

        // block comments
        /* Program comments are nonexecuting statements
        you add to a file for the purpose of documentation */

        // javadoc comments
        /** Program comments are nonexecuting statements
         * you add to a file for the purpose of documentation */

    }
}