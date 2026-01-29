
 /*OOPSBannerApp UC4-OOPS Banner Application (Use Case 4)
  *  * This class extends the functionality of Use Case 2 by improving the way the "OOPS" banner
 * is constructed and displayed. It focuses on enhansing code readability and efficiency
 * by utilizing the String.join() method to create each line of the banner. This approach
 * overcomes the drawbacks of using the + oprator for String concatination, which can lead
 * to code inefficiency due to creation of multiple intermediate String objects in memory.
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability
 *
 * @author Developer
 * @version 3.0
 * @version 4.0
*/
public class OopsBannerApp {
    public static void main(String[] args) {
        // Step 1: Create String array for 7 lines
        String[] lines = new String[7];

        // Step 2: Populate array using String.join()
        lines[0] = String.join("",
                "  *****  ", "  *****  ", " ******  ", "  *****  ");

        lines[1] = String.join("",
                " *     * ", " *     * ", " *     * ", " *        ");

        lines[2] = String.join("",
                " *     * ", " *     * ", " *     * ", " *        ");

        lines[3] = String.join("",
                " *     * ", " *     * ", " ******  ", "  *****  ");

        lines[4] = String.join("",
                " *     * ", " *     * ", " *        ", "       * ");

        lines[5] = String.join("",
                " *     * ", " *     * ", " *        ", "       * ");

        lines[6] = String.join("",
                "  *****  ", "  *****  ", " *        ", "  *****  ");

        // Step 3: Print banner using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}