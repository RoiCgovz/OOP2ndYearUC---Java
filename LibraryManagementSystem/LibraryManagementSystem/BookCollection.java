import java.util.ArrayList;

public class BookCollection {
    // Method to create and return an ArrayList of books
    public static ArrayList<Book> getBooks() {
        ArrayList<Book> books = new ArrayList<Book>();

        // Add books to the ArrayList
        books.add(new Book("Animal Stories", "Maria Hoey", "978-1-60309-502-0", 20));
        books.add(new Book("Ashes", "Alvaro Ortiz", "978-1-60309-517-4", 10));
        books.add(new Book("The Fun Family", "Benjamin Frisch", "978-1-60309-344-6", 8));
        books.add(new Book("Nemo: Heart of Ice", "Alan Moore and Kevin O'Neill", "978-1-60309-274-6", 23));
        return books;
    }
}
