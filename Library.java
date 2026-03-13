import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void display() {
        System.out.println(title + " " + author + " " + isbn);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isbn.equals(isbn)) {
                books.remove(i);
                System.out.println("Book removed");
                return;
            }
        }
        System.out.println("Book not found");
    }

    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java Basics", "James", "101"));
        lib.addBook(new Book("Python Guide", "Guido", "102"));

        lib.displayBooks();
        lib.removeBook("101");
        lib.displayBooks();
    }
}
