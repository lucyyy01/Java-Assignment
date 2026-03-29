public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Thread paymentThread = new Thread(() -> System.out.println("Processing payment..."));
        Thread orderThread = new Thread(() -> System.out.println("Order confirmed..."));

        paymentThread.start();
        orderThread.start();
    }
}
