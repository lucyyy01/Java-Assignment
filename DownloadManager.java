public class DownloadManager {
    public static void main(String[] args) {
        Thread download1 = new Thread(new DownloadTask("File1"));
        Thread download2 = new Thread(new DownloadTask("File2"));
        Thread download3 = new Thread(new DownloadTask("File3"));

        download1.start();
        download2.start();
        download3.start();
    }

    private static class DownloadTask implements Runnable {
        private final String fileName;

        DownloadTask(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            System.out.println("Downloading " + fileName + "...");
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println(fileName + " download completed.");
        }
    }
}
