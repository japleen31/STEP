public class UC7 {

    public static class CharacterPatternMap {

        private char character;
        private String[] pattern;
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static void main(String[] args) {
        CharacterPatternMap[] letters = {
                new CharacterPatternMap('O', buildO()),
                new CharacterPatternMap('O', buildO()),
                new CharacterPatternMap('P', buildP()),
                new CharacterPatternMap('S', buildS())
        };
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap letter : letters) {
                line.append(letter.getPattern()[row]).append(" ");
            }

            System.out.println(line);
        }
    }
    private static String[] buildO() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }
    private static String[] buildP() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }
    private static String[] buildS() {
        return new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        };
    }
}