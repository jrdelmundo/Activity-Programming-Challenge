import java.util.Scanner;

public class VowelConsonantChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String lowerCaseInput = input.toLowerCase();

        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char ch = lowerCaseInput.charAt(i);

            if (isVowel(ch)) {
                System.out.println(ch + " is a vowel.");
            } else if (isConsonant(ch)) {
                System.out.println(ch + " is a consonant.");
            } else {
                System.out.println(ch + " is neither a vowel nor a consonant.");
            }
        }

        scanner.close();
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isConsonant(char ch) {
        return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
    }
}