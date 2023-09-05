import java.util.HashMap;
import java.util.HashSet;


class Library {
    public HashMap<String, Book> booksMap;

    public Library() {
        booksMap = new HashMap<>();
    }

    public void addBook(Book book) {
        booksMap.put(book.getTitle(), book);
    }

    public void removeBook(String title) {
        booksMap.remove(title);
    }

    public void displayBooks() {
        for (Book book : booksMap.values()) {
            book.displayDetails();
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        // Create instances of Book
        Book book1 = new Book("Java Programming", "John Smith", 29.99, 10);
        Book book2 = new Book("Python Basics", "Jane Doe", 19.99, 5);
        Book book3 = new Book("C++ Programming", "Michael Johnson", 39.99, 8);
        Book book4 = new Book("JavaScript Essentials", "Emily Brown", 24.99, 15);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Remove a book from the library
        library.removeBook("Java Programming");

        // Display all books in the library
        library.displayBooks();

        // Create a HashSet to store unique authors
        HashSet<String> authorsSet = new HashSet<>();

        // Add authors of each book to the authorsSet
        for (Book book : library.booksMap.values()) {
            authorsSet.add(book.getAuthor());
        }

        // Print out the unique authors in the library
        System.out.println("Unique Authors in the Library:");
        for (String author : authorsSet) {
            System.out.println(author);
        }
    }
}

