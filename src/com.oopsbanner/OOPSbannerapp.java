public class OOPSbannerapp{

    public static void main(String[] args) {

        // Inline declaration and initialization
        String[] banner = {
                String.join("  ",
                        "   ***   ",
                        "   ***   ",
                        " *****   ",
                        "  *****  "
                ),
                String.join("  ",
                        "  *   *  ",
                        "  *   *  ",
                        " *    *  ",
                        " *       "
                ),
                String.join("  ",
                        " *     * ",
                        " *     * ",
                        " *    *  ",
                        " *       "
                ),
                String.join("  ",
                        " *     * ",
                        " *     * ",
                        " *****   ",
                        "  ****   "
                ),
                String.join("  ",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        "      *  "
                ),
                String.join("  ",
                        "  *   *  ",
                        "  *   *  ",
                        " *       ",
                        "      *  "
                ),
                String.join("  ",
                        "   ***   ",
                        "   ***   ",
                        " *       ",
                        " *****   "
                )
        };

        // Print using for-each loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}