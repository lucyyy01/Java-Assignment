public class MusicPlayer extends Thread {
    @Override
    public void run() {
        System.out.println("Playing song...");
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Progress " + i);
        }
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.start();
    }
}
