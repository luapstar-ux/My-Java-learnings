public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    public String displayDetails() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}
