import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInputSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student age: ");

        try {
            int age = scanner.nextInt();
            if (age < 0) {
                throw new ArithmeticException("Age cannot be negative");
            }
            System.out.println("Student age is: " + age);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input");
        } catch (ArithmeticException ex) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }
    }
}
