import java.util.*;

public class Book {

    // ArrayList
    private ArrayList<String> bookNames = new ArrayList<String>();
    private ArrayList<String> bookAuthors = new ArrayList<String>();
    private ArrayList<String> isbns = new ArrayList<String>();
    private ArrayList<Integer> availableCopies = new ArrayList<Integer>();
     
    // Private Variables
    private String name;
    private String author;
    private String isbn;
    private int copies;
    
    // Constructor
    public Book(String name, String author, String isbn, int copies) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;

        // Adding to ArrayList
        this.bookNames.add(name);
        this.bookAuthors.add(author);
        this.isbns.add(isbn);
        this.availableCopies.add(copies);
    }

    // Getter Methods
    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getCopies() {
        return copies;
    }       

    // Method to display book details
    public void displayBook() {
        // Aligning the output with fixed width
        System.out.printf("%-30s: %s%n", "Name", name);
        System.out.printf("%-30s: %s%n", "Author", author);
        System.out.printf("%-30s: %s%n", "ISBN", isbn);
        System.out.printf("%-30s: %d%n", "Copies", copies);
        System.out.println();
    }
    
    // Method to borrow the book
    public boolean borrowBook() {
        if (copies > 0) 
        {
            copies--;
            return true;
        } 
        else 
        {
            System.out.println("Sorry, this book is not available for borrowing.");
            return false;
        }
    }

    // Method to return the book
    public void returnBook() {
        copies++;
    }
}
