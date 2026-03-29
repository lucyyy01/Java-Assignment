public class BankingSystem {
    private int balance = 1000;

    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();

        Runnable withdrawalTask = () -> system.withdraw(600);

        Thread user1 = new Thread(withdrawalTask, "User1");
        Thread user2 = new Thread(withdrawalTask, "User2");

        user1.start();
        user2.start();
    }

    public void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " deducted " + amount + ". Remaining balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " could not deduct " + amount + " due to insufficient balance.");
            }
        }
    }
}
