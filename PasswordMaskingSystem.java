import java.util.Scanner;

public class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        String maskedPassword = maskPassword(password);
        System.out.println("Masked password: " + maskedPassword);
        scanner.close();
    }

    private static String maskPassword(String password) {
        if (password == null || password.length() <= 2) {
            return password == null ? "" : password;
        }

        String prefix = password.substring(0, password.length() - 2);
        String masked = prefix;
        for (char c : prefix.toCharArray()) {
            masked = masked.replace(c, '*');
        }
        return masked + password.substring(password.length() - 2);
    }
}
