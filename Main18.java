class Bank {
    final double interestRate = 5.0;

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class Main18 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        double interest1 = bank.calculateInterest(10000);
        double interest2 = bank.calculateInterest(20000);
        double interest3 = bank.calculateInterest(50000);

        System.out.println("Interest for Customer 1: " + interest1);
        System.out.println("Interest for Customer 2: " + interest2);
        System.out.println("Interest for Customer 3: " + interest3);
    }
}