public class ThreadPrioritySystem {
    public static void main(String[] args) {
        Thread lowPriority = new Thread(new PriorityTask("Low priority thread"));
        Thread highPriority = new Thread(new PriorityTask("High priority thread"));

        lowPriority.setPriority(Thread.MIN_PRIORITY);
        highPriority.setPriority(Thread.MAX_PRIORITY);

        lowPriority.start();
        highPriority.start();
    }

    private static class PriorityTask implements Runnable {
        private final String name;

        PriorityTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + " executing " + i);
            }
        }
    }
}
