public class BankApplication {
    public static void main(String[] args) {
        try {
            processTransaction();
            System.out.println("Transaction processed");
        } catch (Exception ex) {
            System.out.println("Exception handled in main");
        }
    }

    private static void processTransaction() throws Exception {
        throw new Exception("Transaction error");
    }
}
