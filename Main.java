abstract class Shape {
    abstract double calculate_area();

    void display_info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculate_area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        // Can't instantiate abstract Shape directly
        // Shape s = new Shape();

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.display_info();
        System.out.println(c.calculate_area());

        r.display_info();
        System.out.println(r.calculate_area());
    }
}