package LMS;
import java.util.*;

public class Library {

    private List<Book> books = new ArrayList<>();
    private Map<String, User> users = new HashMap<>(); 



    public void addBooks(String title, String author){
        books.add(new Book(title, author));
        System.out.println("Books added Sucessfully!");
    }


    public void registerUser(String name){
        users.put(name, new User(name));
        System.out.println("User registered Sucessfully!");
    }


    public void borrowBooks(String userName, String bookTitle){
        User user = users.get(userName);
        if(user == null){
            System.out.println("User not found!");
            return;
        }

        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(bookTitle) && !book.isBorrowed()){
                book.Borrow();
                user.borrowBook(book);
                System.out.println("Book Borrowed Sucessfully!");
                return;
            }else
               System.out.println("❌ Book not available.");
        }
    }

    public void returnBook(String userName, String bookTitle) {
        User user = users.get(userName);
        if (user == null) {
            System.out.println("❌ User not found.");
            return;
        }

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle) && book.isBorrowed()) {
                book.returnBook();
                user.returnBook(book);
                System.out.println("✅ Book returned.");
                return;
            }
        }
        System.out.println("❌ Book not found or wasn't borrowed.");
    }

     public void showAllBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public void showUserBorrowedBooks(String userName) {
        User user = users.get(userName);
        if (user != null) {
            user.listBorrowedBook();
        } else {
            System.out.println("❌ User not found.");
        }
    }
}
