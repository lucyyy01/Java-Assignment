public class RailwayReservation {
    private int availableTickets = 1;

    public static void main(String[] args) {
        RailwayReservation reservation = new RailwayReservation();

        Thread user1 = new Thread(reservation::bookTicket, "User1");
        Thread user2 = new Thread(reservation::bookTicket, "User2");

        user1.start();
        user2.start();
    }

    public synchronized void bookTicket() {
        if (availableTickets <= 0) {
            System.out.println("No tickets available");
            return;
        }
        availableTickets--;
        System.out.println("Ticket booked successfully");
    }
}
