import java.util.Scanner;

public class SumOfInteger {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter integers to sum. Type 'exit' to stop:");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or type 'exit' to stop.");
            }
        }

        System.out.println("The sum of all entered integers is: " + sum);
    }
}
