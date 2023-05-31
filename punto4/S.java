public class GrammarGsp {
    private static int currentIndex;

    public static boolean generate(String input) {
        currentIndex = 0;
        return S(input);
    }

    private static boolean S(String input) {
        if (currentIndex >= input.length()) {
            return false;
        }

        char currentChar = input.charAt(currentIndex);
        if (currentChar == 'O' || currentChar == '1') {
            currentIndex++;
            return true;
        } else if (currentChar == '(') {
            currentIndex++;
            if (S(input) && currentIndex < input.length() && input.charAt(currentIndex) == ')') {
                currentIndex++;
                return true;
            }
        } else if (currentChar == 'S') {
            currentIndex++;
            if (S(input)) {
                return true;
            }
        } else if (currentChar == 'I') {
            currentIndex++;
            if (S(input)) {
                return true;
            } else if (currentIndex < input.length() && input.charAt(currentIndex) == '+') {
                currentIndex++;
                if (S(input)) {
                    return true;
                }
            } else if (currentIndex < input.length() && input.charAt(currentIndex) == '*') {
                currentIndex++;
                if (S(input)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String validString1 = "O+1"; // 0 + 1
        String validString2 = "O*1"; // 0 * 1
        String validString3 = "(O+1)*1"; // (0 + 1) * 1
        String invalidString1 = "O+1*1"; // Ambiguo: 0 + (1 * 1) o (0 + 1) * 1

        System.out.println(generate(validString1)); // true
        System.out.println(generate(validString2)); // true
        System.out.println(generate(validString3)); // true
        System.out.println(generate(invalidString1)); // true
    }
}
