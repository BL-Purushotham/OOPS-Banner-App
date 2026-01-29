
 /*OOPSBannerApp UC4-OOPS Banner Application (Use Case 4)
 *
 * This class extends the functionality of Use Case 2 by improving the way the "OOPS" banner
 * is constructed and displayed. It focuses on enhansing code readability and efficiency
 * by utilizing the String.join() method to create each line of the banner. This approach
 * overcomes the drawbacks of using the + oprator for String concatination, which can lead
 * to code inefficiency due to creation of multiple intermediate String objects in memory.
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 */
public class OopsBannerApp {
    public static void main(String[] args) {
        // Line 1
        System.out.println(
                "  *****  " + "  *****  " + " ******  " + "  *****  "
        );
        System.out.println(String.join("",
                "  *****  ",
                "  *****  ",
                " ******  ",
                "  *****  "
        ));

        // Line 2
        System.out.println(
                " *     * " + " *     * " + " *     * " + " *        "
        );
        System.out.println(String.join("",
                " *     * ",
                " *     * ",
                " *     * ",
                " *        "
        ));

        // Line 3
        System.out.println(
                " *     * " + " *     * " + " *     * " + " *        "
        );
        System.out.println(String.join("",
                " *     * ",
                " *     * ",
                " *     * ",
                " *        "
        ));

        // Line 4
        System.out.println(
                " *     * " + " *     * " + " ******  " + "  *****  "
        );
        System.out.println(String.join("",
                " *     * ",
                " *     * ",
                " ******  ",
                "  *****  "
        ));

        // Line 5
        System.out.println(
                " *     * " + " *     * " + " *        " + "       * "
        );
        System.out.println(String.join("",
                " *     * ",
                " *     * ",
                " *        ",
                "       * "
        ));

        // Line 6
        System.out.println(
                " *     * " + " *     * " + " *        " + "       * "
        );
        System.out.println(String.join("",
                " *     * ",
                " *     * ",
                " *        ",
                "       * "
        ));

        // Line 7
        System.out.println(
                "  *****  " + "  *****  " + " *        " + "  *****  "
        );
        System.out.println(String.join("",
                "  *****  ",
                "  *****  ",
                " *        ",
                "  *****  "
        ));
    }
}