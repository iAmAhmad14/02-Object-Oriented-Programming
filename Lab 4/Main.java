 public class Main {
    public static void main(String[] args) {
        // Attempt to create an object of the Book class using the empty/default constructor
        // Note: Since we have provided a parameterized constructor in the Book class, the default constructor is not available.

        // Create two instances of the Book class using the empty constructor and set their attributes using the respective setter methods
        Book book1 = new Book();
        book1.setTitle("Java Programming");
        book1.setAuthor("John Smith");
        book1.setPrice(29.99);
        book1.setQuantity(10);

        Book book2 = new Book();
        book2.setTitle("Python Basics");
        book2.setAuthor("Jane Doe");
        book2.setPrice(19.99);
        book2.setQuantity(5);

        // Create another two instances of the Book class using the argument constructor and provide the attribute values directly
        Book book3 = new Book("C++ Programming", "Michael Johnson", 39.99, 8);
        Book book4 = new Book("JavaScript Essentials", "Emily Brown", 24.99, 15);

        // Call the display() method for each Book instance to print out their attribute values
        book1.display();
        book2.display();
        book3.display();
        book4.display();

        // Use an array to store the Book instances and call the display() method only once for the entire array
        Book[] books = {book1, book2, book3, book4};
        for (Book book : books) {
            book.display();
        }
    }
}

