public class OOPSBannerApp {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character character to map
         * @param pattern 7-line ASCII pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Create and initialize CharacterPatternMap array
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        // O pattern
        charMaps[0] = new CharacterPatternMap('O', new String[]{
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        });

        // P pattern
        charMaps[1] = new CharacterPatternMap('P', new String[]{
                "*****",
                "**  *",
                "*****",
                "**   ",
                "**   ",
                "**   ",
                "**   "
        });

        // S pattern
        charMaps[2] = new CharacterPatternMap('S', new String[]{
                "*****",
                "**   ",
                "*****",
                "   **",
                "   **",
                "** **",
                "*****"
        });

        // Space pattern
        charMaps[3] = new CharacterPatternMap(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return charMaps;
    }

    /**
     * Get pattern for a given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // If not found, return space pattern
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Print message as banner
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}