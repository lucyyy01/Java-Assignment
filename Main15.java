abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
}

class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 12;
    }
}

public class Main15 {
    public static void main(String[] args) {
        Ride[] rides = new Ride[3];

        rides[0] = new BikeRide(10);
        rides[1] = new AutoRide(10);
        rides[2] = new CarRide(10);

        for (Ride r : rides) {
            System.out.println(r.calculateFare());
        }
    }
}