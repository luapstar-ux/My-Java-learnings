import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library(){
        books = new ArrayList<>();

    }
    //Method  to add a book to the library
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added:"+book.displayDetails());
    }

    //Method to display all available books
    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("No books available in the library:");
            return;
        }
        System.out.println("Available books in the library:");
        for (Book book :books){
            System.out.println(book.displayDetails());
        }
    }
}
