public class Restaurant {
    private boolean foodAvailable = false;

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Thread chef = new Thread(restaurant::prepareFood);
        Thread waiter = new Thread(restaurant::serveFood);

        waiter.start();
        chef.start();
    }

    public synchronized void prepareFood() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        foodAvailable = true;
        System.out.println("Chef prepared food");
        notify();
    }

    public synchronized void serveFood() {
        while (!foodAvailable) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Waiter served food");
    }
}
