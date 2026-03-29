public class ChatApplication {
    public static void main(String[] args) {
        Thread sender = new Thread(() -> System.out.println("Sending message..."));
        Thread receiver = new Thread(() -> System.out.println("Receiving message..."));

        sender.start();
        receiver.start();

        try {
            sender.join();
            receiver.join();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
