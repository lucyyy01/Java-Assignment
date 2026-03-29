class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Main19 {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book("Java Basics", "Amit", 300);
        books[1] = new Book("Data Structures", "Neha", 450);
        books[2] = new Book("Operating Systems", "Rahul", 500);

        for (Book b : books) {
            b.display();
        }
    }
}