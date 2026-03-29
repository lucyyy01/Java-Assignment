import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();
        scanner.close();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero");
        }
    }
}
