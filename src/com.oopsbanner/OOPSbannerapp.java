import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 – Use Map for Character Patterns
 * @author Shashank_R
 * @version 8.0
 */

public class OOPSBannerApp {

    /**
     * Create and return a map of character patterns
     */
    public static Map<Character, String[]> createCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        });

        patternMap.put('P', new String[]{
                "*****",
                "**  *",
                "*****",
                "**   ",
                "**   ",
                "**   ",
                "**   "
        });

        patternMap.put('S', new String[]{
                "*****",
                "**   ",
                "*****",
                "   **",
                "   **",
                "** **",
                "*****"
        });

        patternMap.put(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return patternMap;
    }

    /**
     * Print banner message using HashMap lookup
     */
    public static void printMessage(String message, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = patternMap.getOrDefault(ch, patternMap.get(' '));

                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createCharacterPatternMap();

        String message = "OOPS";

        printMessage(message, patternMap);
    }
}