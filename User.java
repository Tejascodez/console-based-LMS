package LMS;
import java.util.*;

public class User {

    private String name;
    private List<Book> borrowedBooks = new ArrayList();


    public User(String name){
        this.name = name;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }

    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }

    public String getName(){
        return name;
    }

    public void listBorrowedBook(){
        System.out.println("Books borrowed by "+ name + ":");
        for(Book b : borrowedBooks){
            System.out.println("-" + b.getTitle());
        }
    }
}
