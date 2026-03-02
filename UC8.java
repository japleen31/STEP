import java.util.HashMap;
import java.util.Map;

public class UC6{

    // HashMap to store ASCII patterns
    private Map<Character, String[]> patternMap;

    // Constructor initializes and generates patterns
    public UC8() {
        patternMap = new HashMap<>();
        generatePatterns();
    }

    // Method to generate ASCII patterns
    private void generatePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    // Retrieve character pattern
    public String[] getPattern(char ch) {
        ch = Character.toUpperCase(ch);
        return patternMap.getOrDefault(ch, new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        });
    }

    // Display full message
    public void displayMessage(String message) {
        message = message.toUpperCase();

        int height = 5; // Height of each character pattern

        for (int row = 0; row < height; row++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = getPattern(ch);
                System.out.print(pattern[row] + "  ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        UC8 system = new UC8();

        String message = "OOPS";

        System.out.println("Displaying ASCII Pattern for: " + message);
        System.out.println();

        system.displayMessage(message);
    }
}