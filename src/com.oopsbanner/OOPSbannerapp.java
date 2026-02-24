public class OOPSbannerapp{

    // Method to build letter O
    public static String[] buildO() {
        return new String[]{
                String.join("", "   ***   "),
                String.join("", "  *   *  "),
                String.join("", " *     * "),
                String.join("", " *     * "),
                String.join("", " *     * "),
                String.join("", "  *   *  "),
                String.join("", "   ***   ")
        };
    }

    // Method to build letter P
    public static String[] buildP() {
        return new String[]{
                String.join("", " *****   "),
                String.join("", " *    *  "),
                String.join("", " *    *  "),
                String.join("", " ******   "),
                String.join("", " *       "),
                String.join("", " *       "),
                String.join("", " *       ")
        };
    }

    // Method to build letter S
    public static String[] buildS() {
        return new String[]{
                String.join("", "  *****  "),
                String.join("", " *       "),
                String.join("", " *       "),
                String.join("", "  ****   "),
                String.join("", "      *  "),
                String.join("", "      *  "),
                String.join("", " *****   ")
        };
    }

    public static void main(String[] args) {

        // Populate letters in order O O P S
        String[][] letters = { buildO(), buildO(), buildP(), buildS() };

        String[] banner = new String[7];

        // Combine rows
        for (int i = 0; i < 7; i++) {
            String line = "";
            for (String[] letter : letters) {
                line += letter[i] + "  ";
            }
            banner[i] = line;
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}