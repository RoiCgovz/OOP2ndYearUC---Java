import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Book> books = BookCollection.getBooks();
        Scanner scan = new Scanner(System.in);
        int choice, copies;

        while (true) {
            System.out.println("=====================Main Menu====================");
            System.out.println("====== 1: Display List of Books ==================");
            System.out.println("====== 2: Borrow a Book         ==================");
            System.out.println("====== 3: Create a Book         ==================");
            System.out.println("====== 4: Return a Book         ==================");
            System.out.println("====== 5: Exit Program          ==================");
            System.out.println("Enter a number to choose an option: ==============");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    for (Book book : books) 
                    {
                        System.out.println("==================== Books ====================");
                        book.displayBook();
                    }
                    break;
                case 2:
                    System.out.print("Enter the ISBN of the book you want to borrow: ");
                    String ISBNBorrow = scan.nextLine();
                    Book bookToBorrow = findBookByIsbn(books, ISBNBorrow);
                    if (bookToBorrow != null) 
                    {
                        boolean success = bookToBorrow.borrowBook();
                        if (success) 
                        {
                            System.out.println("You have successfully borrowed the book.");
                        }
                    } 
                    else 
                    {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the title of the book: ");
                    String title = scan.nextLine();
                    System.out.print("Enter the author of the book: ");
                    String author = scan.nextLine();
                    System.out.print("Enter the ISBN of the book: ");
                    String isbn = scan.nextLine();
                    System.out.print("Enter the number of copies: ");
                    copies = scan.nextInt();
                    scan.nextLine(); 

                    Book newBook = new Book(title, author, isbn, copies);
                    books.add(newBook);
                    System.out.println("Book added successfully.");
                    break;

                case 4:
                    // Return a book
                    System.out.print("Enter the ISBN of the book you want to return: ");
                    String ISBNReturn = scan.nextLine();
                    Book bookToReturn = findBookByIsbn(books, ISBNReturn);
                    if (bookToReturn != null) {
                        bookToReturn.returnBook();
                        System.out.println("You have successfully returned the book.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    // Exit program
                    System.out.println("==================== Thank you for using the System ====================");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }
    }

    // Method to find a book by ISBN
    private static Book findBookByIsbn(ArrayList<Book> books, String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
