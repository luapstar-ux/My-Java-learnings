/** building complex objects by combining simpler ones.
 * For example, a Library "has" many Book objects.
 * The Library class manages a collection of Book objects, showing how smaller objects form bigger ones.
  */

public class Main {
    public static void main(String[] args) {
      // Create a library instance
        Library library = new Library();

        // Create some book instances
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1122334455");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all available books
        library.displayBooks();
    }
}