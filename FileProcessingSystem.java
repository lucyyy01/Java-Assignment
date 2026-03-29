public class FileProcessingSystem {
    public static void main(String[] args) {
        try {
            System.out.println("Reading file...");
            simulateFileRead();
        } catch (Exception ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        } finally {
            System.out.println("Closing file resources");
        }
    }

    private static void simulateFileRead() throws Exception {
        // Simulate a possible file read error for demonstration.
        if (Math.random() < 0.5) {
            throw new Exception("Simulated file read failure");
        }
    }
}
