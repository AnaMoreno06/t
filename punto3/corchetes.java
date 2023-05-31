public class ParenthesesGrammar {
    private static int currentIndex;

    public static boolean generate(String input) {
        currentIndex = 0;
        return S(input);
    }

    private static boolean S(String input) {
        if (currentIndex >= input.length()) {
            return true; // Cadena vacía
        }

        if (T(input)) {
            return S(input); // Símbolo no terminal T seguido por S
        }

        return false;
    }

    private static boolean T(String input) {
        if (currentIndex >= input.length()) {
            return false;
        }

        char currentChar = input.charAt(currentIndex);
        if (currentChar == '(') {
            currentIndex++;
            if (T(input) && currentIndex < input.length() && input.charAt(currentIndex) == ')') {
                currentIndex++;
                return true;
            }
        } else if (currentChar == '[') {
            currentIndex++;
            if (T(input) && currentIndex < input.length() && input.charAt(currentIndex) == ']') {
                currentIndex++;
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String validString1 = "([O])";
        String validString2 = "([])";
        String validString3 = "[O([OO])]";
        String invalidString1 = "([)]";
        String invalidString2 = "[( [)]]";

        System.out.println(generate(validString1)); // true
        System.out.println(generate(validString2)); // true
        System.out.println(generate(validString3)); // true
        System.out.println(generate(invalidString1)); // false
        System.out.println(generate(invalidString2)); // false
    }
}
