package LMS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n📚 LIBRARY MENU:");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show All Books");
            System.out.println("6. Show User's Borrowed Books");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    library.addBooks(title, author);
                    break;
                case 2:
                    System.out.print("Enter user name: ");
                    String name = sc.nextLine();
                    library.registerUser(name);
                    break;
                case 3:
                    System.out.print("Enter user name: ");
                    name = sc.nextLine();
                    System.out.print("Enter book title: ");
                    title = sc.nextLine();
                    library.borrowBooks(name, title);
                    break;
                case 4:
                    System.out.print("Enter user name: ");
                    name = sc.nextLine();
                    System.out.print("Enter book title: ");
                    title = sc.nextLine();
                    library.returnBook(name, title);
                    break;
                case 5:
                    library.showAllBooks();
                    break;
                case 6:
                    System.out.print("Enter user name: ");
                    name = sc.nextLine();
                    library.showUserBorrowedBooks(name);
                    break;
                case 7:
                    System.out.println("👋 Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}
