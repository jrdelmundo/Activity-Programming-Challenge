import java.util.Scanner;

public class NumberChecker {

    public static String checkOddOrEven(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static String checkPosNegOrZero(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String oddOrEven = checkOddOrEven(number);

        String posNegOrZero = checkPosNegOrZero(number);

        System.out.println("The number " + number + " is " + oddOrEven + " and " + posNegOrZero + ".");
    }
}