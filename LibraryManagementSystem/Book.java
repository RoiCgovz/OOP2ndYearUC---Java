import java.util.*;
import java.lang.*;
class Book {

    //Arraylist
    private ArrayList<String> BookName = new ArrayList<String>();
    private ArrayList<String> BookAuthor = new ArrayList<String>();
    private ArrayList<String> isbn = new ArrayList<String>();
    private ArrayList<int> availableCopies = new ArrayList<int>();
     
    //Private Variables
    private final String name = new String();
    private final String author = new String();
    private final String isbn = new String();
    private int copies;
    
    //Getter Methods
    public String getAuthor(){return;}
    public String getName(){return;}
    public String getIsbn(){return;}
    public int getCopies(){return;}
    
    //Setter Method
    public void setName(String newName){this.BookName = newName;}
    public void setAuthor(String newAuthor) {this.BookAuthor = newAuthor}
    public void setIsbn(String newIsbn) {this.isbn = newIsbn}
    public void setCopies(int newCopies) {this.availableCopies = newCopies}
}

