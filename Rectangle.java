class RectangleArea {

    int length;
    int breadth;

    RectangleArea(int l, int b) {
        length = l;
        breadth = b;
    }

    int Area() {
        return length * breadth;
    }

    public static void main(String[] args) {

        RectangleArea r1 = new RectangleArea(4, 5);
        RectangleArea r2 = new RectangleArea(5, 8);

        System.out.println("Area of Rectangle 1 = " + r1.Area());
        System.out.println("Area of Rectangle 2 = " + r2.Area());
    }
}