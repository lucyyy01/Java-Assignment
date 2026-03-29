import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        scanner.close();

        try {
            processWithdrawal(balance, amount);
        } catch (IllegalArgumentException ex) {
            System.out.println("Insufficient Balance");
        }
    }

    private static void processWithdrawal(double balance, double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        double remaining = balance - amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: " + remaining);
    }
}
